package org.bootcamp;

public enum Unit {
    METER("METER", 1.0),
    CENTIMETER("CENTIMETER", 0.01),
    INCH("INCH", 1.0);

    private String unitName;
    private Double conversionFactor;
    Unit(String unit, double conversionFactorToMeter) {
        this.conversionFactor = conversionFactorToMeter;
        this.unitName = unit;

    }

    public Double getConversionFactor(){
        return this.conversionFactor;
    }
}
