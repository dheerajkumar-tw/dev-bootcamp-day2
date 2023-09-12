package org.bootcamp;

import java.util.Objects;

public class Measurement {

    private String unit;
    private Double value;



    public Measurement(String unit, Double value) {
        this.unit = unit;
        this.value = value;
    }

    public String compare(Measurement Measurement) {
        if(this.equals(Measurement)){
            return "Same";
        }
        return "Not Same";
    }

    public String equal(Measurement measurement) {
        if(Objects.equals(this.unit, measurement.unit) && Objects.equals(this.value, measurement.value)){
            return "Equal";
        }else{

        }
        return "Not Equal";
    }
}
