package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER LENGTH DIMENSION:");
        double length = input.nextDouble();

        System.out.println("ENTER WIDTH DIMENSION:");
        double width = input.nextDouble();

        System.out.println("AREA IS " + width * length);


    }
}
