package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;


public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radius;

        do {
            System.out.println("ENTER A POSITIVE RADIUS DIMENSION:");
            while (!input.hasNextDouble()) {
                System.out.println("INPUT FAILED - ENTER A NUMBER:");
                input.next();
            }
            radius = input.nextDouble();
        }
        while(radius<0);

        System.out.println(Circle.getArea(radius));


    }
}
