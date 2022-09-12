package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;


public class Area {

    static final Double PI = 3.14159;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER RADIUS DIMENSION:");
        double radius = input.nextDouble();



        System.out.println(Circle.getArea(radius));


    }
}
