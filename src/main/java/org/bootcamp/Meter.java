package org.bootcamp;

import java.util.Objects;

public class Meter {

    private Double value;

    public Double getValue(){
        return value;
    }

    public Meter(Double value){
        this.value = value;
    }

    @Override
    public boolean equals(Object object2){
        if(this == object2) {
            return true;
        }
        if(object2 instanceof Meter){
            Meter meter = (Meter) object2;
            return Objects.equals(this.value, meter.getValue());
        }else if(object2 instanceof Centimeter){
            Centimeter centimeter = (Centimeter) object2;
            return Objects.equals(this.value, centimeter.getValue()*100);
        }
        return false;
    }

}
