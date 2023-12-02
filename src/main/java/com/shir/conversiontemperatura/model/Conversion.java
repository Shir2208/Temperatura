package com.shir.conversiontemperatura.model;

public class Conversion {
    private final double c;
    private final double gf;

    public Conversion(double c, double gf){
        this.c = c;
        this.gf = gf;
    }

    public double getC() {
        return c;
    }

    public double getGf() {;
        return (c*1.8)+32;
    }

    @Override
    public String toString() {
        return "Conversion{" +
                "c=" + c +
                ", gf=" + gf +
                '}';
    }
}
