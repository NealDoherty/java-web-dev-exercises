package exercises;

import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String story = new String("Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it " +
                "had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures " +
                "or conversation?'");

        story.toLowerCase();

        System.out.println("ENTER SEARCH TERM");
        String search = input.nextLine();
        search.toLowerCase();



        System.out.println(story.contains(search));
    }
}
