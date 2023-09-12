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
        if(this == object2){
            return true;
        }
        if(!(object2 instanceof Centimeter)) return false;
        Centimeter centimeter = (Centimeter) object2;
        return Objects.equals(this.value, centimeter.value);
    }
    public boolean isSame(Centimeter centimeter) {
        return this == centimeter;
    }

    public boolean equal(Meter meter) {
       return Objects.equals(this.value*100, meter.getValue());
    }
}
