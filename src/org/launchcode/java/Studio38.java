package org.launchcode.java;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Studio38 {

        public static void main(String[] args) {

            HashMap<String, Integer> characters = new HashMap<>();
            Scanner input = new Scanner(System.in);
            String character;

            System.out.println("Enter text:");
            String inputText = input.nextLine();

            /*String inputText = "If the product of two terms is zero then common sense says at least one of the two terms" +
                    " has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics" +
                    " into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that," +
                    " it’s pretty straightforward from there.";

             */

            inputText = inputText.toLowerCase();

            String [] searchText = inputText.split("");

            for(String i:searchText){
                if(characters.containsKey(i))
                {
                    characters.merge(i,1,Integer::sum);
                }
                else
                {
                    characters.put(i,1);
                }
            }


            for (Map.Entry<String, Integer> printer : characters.entrySet()) {
                System.out.println(printer.getKey() + " (" + printer.getValue() + ")");
            }

        }
}


