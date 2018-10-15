import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */

public class Capstone1PigLatin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner userScanner = new Scanner(System.in);
		String userInput = "";
		String systemQuit;
		char[] nonLetters = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '-', '!', '(', ')', '{', '}', '[',
				']', '^', '~', '*', '?', ':', '&', '@' };

		do {
			// allow multiple words to be translated
			String[] userInputSplit;

			// prompt user for a word/phrase, and sets to lower case
			System.out.print("Please enter a word or phrase to be translated: ");
			userInput = userScanner.nextLine();
			// splits statement to account for multiple words
			userInputSplit = userInput.split("");

			// method verifies that user entered some text
			userInputValid(userInput);
			System.out.println("In English: " + userInput);

			// splits statement to account for multiple words

			pigLatinTranslater(userInputSplit, nonLetters);

			// possibly change above to return input to the same case it started out with

			// ask if wants to play again
			System.out.println("Would you like to translate a phrase again? \n(Type \"quit\" to end)");
			systemQuit = userScanner.nextLine();

		} while (!systemQuit.equalsIgnoreCase("quit"));

		userScanner.close();
	}

	public static void pigLatinTranslater(String[] userInputSplit, char[] nonLetters) {

		// output for words with special characters and no vowels
		userInputContainsNonLetters(userInputSplit, nonLetters);

		// output for location of vowels in words, translated
		userInputVowelTranslation(userInputSplit);
		return;
	}

	// method to validate user's entered some kind of text
	public static boolean userInputValid(String userInput) {
		while (userInput.equals("")) {
			Scanner userScanner = new Scanner(System.in);

			System.out.println("The program can't translate nothing. \nPlease enter a word or phrase: ");
			userInput = userScanner.nextLine();

			userScanner.close();
		}
		return true;
	}

	// method to check if variable starts with a vowel, then translate
	public static void userInputVowelTranslation(String[] userInputSplit) {
		// find position of first vowel, if any
		for (int i = 0; i < userInputSplit.length; i++) {
			char[] vowel = { 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U' };
			String userInput = userInputSplit.toString();
			// char firstVowel = Character.toLowerCase(userInput.charAt(i));
			i = userInput.indexOf(i);
			boolean position = Arrays.asList(userInput).contains(vowel);
			// pigLatinTranslater(userInputSplit, nonLetters);

			if (position && i == 0) {
				System.out.println("In Pig Latin: " + userInput + "way");
				break;

			} else if (position && i != -1) {
				// translating if vowel exists, and doesn't contain special characters
				// moving letters of word from vowel to the end of word
				String newBeginning = userInput.substring(i);
				// extracting the alphabets present before the first vowel
				String newEnding = userInput.substring(0, i);
				System.out.println("In Pig Latin: " + newBeginning + newEnding + "ay");
				break;
			}
		}
	}

	// checks for numbers, symbols, and no vowels and makes no changes
	public static void userInputContainsNonLetters(String[] userInputSplit, char[] nonLetters) {
		int index = Arrays.binarySearch(userInputSplit, nonLetters);
		if (index >= 0) { // only returns if index is not negative (if not found, would be -1)
			System.out.println("In Pig Latin: " + userInputSplit);
		}
	}
}
