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

    public String compare(Meter meter) {
        if(this.equals(meter)){
            return "Same";
        }
        return "Not Same";
    }

    public String equal(Meter meter) {
        if(Objects.equals(this.value, meter.value)){
            return "Equal";
        }
        return "Not Equal";
    }

    public String equal(Centimeter centimeter) {
        if(Objects.equals(this.value, centimeter.getValue()*100)){
            return "Equal";
        }
        return "Not Equal";
    }

}
