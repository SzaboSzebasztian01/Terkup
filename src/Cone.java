/*
 * File:Kup.java
 * Author:Szabó Szebasztián
 * Copyright:2023, Szebi :)
 * Group: SZOFT-I-1-N
 * Date: 2023-02-13
 * Github: https://github.com/SzaboSzebasztian01
 * Licenc: GNU GPL
 */

public class Cone {
    public double calcVolume(double radius, double height){
        double volume = (1.0/3.0) * Math.pow(radius, 2) * Math.PI * height ;
        return volume;
    }
}
