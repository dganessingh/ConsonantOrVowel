import java.util.*;

public class ConsonantOrVowel {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a letter");

        String userInput = input.nextLine();
        if (userInput.length() == 0 || userInput.length() > 1){
            System.out.println("Invalid input. Please enter a single letter.");
            return;
        }

        char letter = userInput.charAt(0);
        
        if (!Character.isLetter(letter)) {
            System.out.println("Invalid input. Please enter a letter.");
            return;
        }
        
        char lowerCaseLetter = Character.toLowerCase(letter);
        if (lowerCaseLetter == 'a' || lowerCaseLetter == 'e' || lowerCaseLetter == 'i' || lowerCaseLetter == 'o' || lowerCaseLetter == 'u') {
            System.out.println(letter + " is a vowel.");
        } 
        else {
            System.out.println(letter + " is a consonant.");
        }
    }
}
