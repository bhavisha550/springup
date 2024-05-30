package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
    @Value("#{ 22 + 11 }")
    private int x;
    @Value("#{ 5 + 45 }")  //calling expressions
    private int y;
    @Value("#{ T(java.lang.Math).sqrt(25) }") //calling static methods
    private double z;
    @Value("#{ T(java.lang.Math).E }")  //calling obj.
    private double e;
    @Value("#{ 8>3 }")  //calling boolean value
    private boolean isActive;
    @Value("#{ new java.lang.String('isha moghe') }")
    private String name;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }


    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", e=" + e +
                ", isActive=" + isActive +
                ", name='" + name + '\'' +
                '}';
    }
}
