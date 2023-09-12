package org.bootcamp;

import java.util.Objects;

public class Measurement {

    private Unit unit;
    private Double value;

    public Measurement(Unit unit, Double value) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object object2) {
        if(this == object2) return true;

        if(!(object2 instanceof Measurement)) return false;

        Measurement measurement = (Measurement) object2;

        if(Objects.equals(this.unit, measurement.unit)){
            return Objects.equals(this.value , measurement.value);
        }else {
            Double convertedValue = convertValueInUnit(measurement.value, measurement.unit, this.unit);
            return Objects.equals(this.value , convertedValue);
        }

    }
    public boolean isSame(Measurement measurement) {
        return this == measurement;
    }

    public Measurement add(Measurement measurement2){

        Double convertedValue = convertValueInUnit(measurement2.value, measurement2.unit, this.unit);
        Double addResultValue = this.value + convertedValue;
        return new Measurement(this.unit, addResultValue);
    }


    private Double convertValueInUnit(Double value, Unit sourceUnit, Unit targetUnit){

        return value * (sourceUnit.getConversionFactor() / targetUnit.getConversionFactor());

    }

}
