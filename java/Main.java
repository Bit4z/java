

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    System.out.print("Enter the string: ");
	    String string = scanner.next();

	    int head = 0;
	    String uniqueCharacters = "";
	    Set<String> uniqueWords = new HashSet();

        for (int i = head; i < string.length(); i++){
            char character = string.charAt(i);

            if (uniqueCharacters.indexOf(character) > -1) {
                uniqueWords.add(uniqueCharacters);

                i = string.indexOf(character, head);
                head++;
                uniqueCharacters = "";
                continue;
            }

            uniqueCharacters += character;

            if (i == string.length() - 1) {
                uniqueWords.add(uniqueCharacters);
            }
        }

        String item = "";

        for (String word: uniqueWords) {
            if (word.length() > item.length()) { item = word; }
        }

        System.out.println("(" + item + ", " + item.length() + ")");
    }
}