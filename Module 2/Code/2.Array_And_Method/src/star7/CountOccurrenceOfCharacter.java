package star7;

import java.util.Scanner;

public class CountOccurrenceOfCharacter {
    static int count = 0;

    public void countCharacter(char character) {
        String str = "abchvcfdas";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) {
                count++;
            }
        }
    }

    public static void main(String[] args) {
        CountOccurrenceOfCharacter countCharacter = new CountOccurrenceOfCharacter();
        Scanner scanner = new Scanner(System.in);
        char character;

        System.out.print("Enter the character u want to count: ");
        character = scanner.next().charAt(0);
        countCharacter.countCharacter(character);

        System.out.println("The number occurrence of character " + character + " is: " + count);
    }
}
