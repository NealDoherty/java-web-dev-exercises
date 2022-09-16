package exercises;

import java.util.Arrays;

public class Exercise371 {
    public static void main(String [] args) {

        int[] test = {1, 1, 2, 3, 5, 8};

        for (int i : test) {
            System.out.println(i);
        }

        String test1 = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String [] test2 = test1.split("\\. ");

        System.out.println(test1);

        System.out.println(Arrays.toString(test2));
}
}