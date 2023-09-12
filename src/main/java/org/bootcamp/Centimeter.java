package org.bootcamp;

import java.util.Objects;

public class Centimeter {

    private Double value;

    public Double getValue(){
        return value;
    }

    public Centimeter(Double value){
        this.value = value;
    }

    public String compare(Centimeter centimeter) {
        if(this.equals(centimeter)){
            return "Same";
        }
        return "Not Same";
    }

    public String equal(Centimeter centimeter) {
        if(Objects.equals(this.value, centimeter.value)){
            return "Equal";
        }
        return "Not Equal";
    }

    public String equal(Meter meter) {
        if(Objects.equals(this.value*100, meter.getValue())){
            return "Equal";
        }
        return "Not Equal";
    }
}
