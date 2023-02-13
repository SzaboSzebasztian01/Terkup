/*
 * File:MainConsole.java
 * Author:Szabó Szebasztián
 * Copyright:2023, Szebi :)
 * Group: SZOFT-I-1-N
 * Date: 2023-02-13
 * Github: https://github.com/SzaboSzebasztian01
 * Licenc: GNU GPL
 */

import java.util.Scanner;

public class MainConsole {
    public MainConsole() {
        about();
        task(); 
        calc();
    }
    private void task(){
        System.out.println("Feladat 0301");
        System.out.println("Kör");
    }
    private void about(){
        System.out.println("Szabó Szebasztián");
        System.out.println("Szoft I-1-N");
        System.out.println("2023.02.13.");
    }

    public void calc(){
        Cone cone = new Cone();
        String radiusStr = input("Sugár: ");
        String heightStr = input("Magasság: ");
        Double radius = Double.parseDouble(radiusStr);
        Double height = Double.parseDouble(heightStr);
        System.out.println(cone.calcVolume(radius, height));
    }
    public String input(String msg){
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg + "");
        String text = scanner.nextLine();
        return text;
    }
}