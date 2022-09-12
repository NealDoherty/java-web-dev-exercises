package exercises;

import java.util.Scanner;


public class CircleArea {
    static final Double PI = 3.14159;

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("ENTER RADIUS DIMENSION:");
            double radius = input.nextDouble();



            System.out.println("CIRCLE AREA IS " + radius * PI * radius);


        }
    }




