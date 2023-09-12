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

    public boolean equal(Centimeter centimeter) {
        return Objects.equals(this.value, centimeter.getValue()*100) ;
    }

}
