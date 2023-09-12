package org.bootcamp;

import java.util.Objects;

public class Centimeter {

    private final Double value;

    public Double getValue(){
        return value;
    }

    public Centimeter(Double value){
        this.value = value;
    }

    @Override
    public boolean equals(Object object2){
        if(this == object2) {
            return true;
        }
        if(object2 instanceof Meter){
            Meter meter = (Meter) object2;
            return Objects.equals(this.value*100, meter.getValue());
        }else if(object2 instanceof Centimeter){
            Centimeter centimeter = (Centimeter) object2;
            return Objects.equals(this.value, centimeter.value);
        }
        return false;
    }
    public boolean isSame(Centimeter centimeter) {
        return this == centimeter;
    }

}
