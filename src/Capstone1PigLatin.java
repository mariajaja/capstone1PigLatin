import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mariah
 *
 */
public class Capstone1PigLatin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner userScanner = new Scanner(System.in);
		String userInput;

		// prompt user for a word/phrase, and sets to lowercase
		System.out.print("Please enter a word or phrase to be translated: ");
		userInput = userScanner.nextLine();
		userInput = userInput.toLowerCase();

		// method verifies that user entered some text
		// call method when true to continue on userInputValid(userInput);
		System.out.println(userInputValid(userInput));

		// method for if general pig latin for one word (that does recursion if
		// there are more than one word)
		// method that if word has no vowels, keep it same
		// also if word starts w/ vowel, just add "way" to the end (Y is NOT a vowel)
		// keep punctuation/translate for contractions (optional)
		// don't translate with numbers (optional); keep word the same

		// translate, then display original and translated texts
		// ask if user wants to translate again

		userScanner.close();
	}

	public static void pigLatinTranslater(String userInput) {
		// make the method run for each next???
		// if statement if each word contains a number/symbol to not translate
		// if statement for contractions?
		// if for words with no vowels
		// if translate for words start with vowels (a,e,i,o,u)
		// call userInputStartsVowel(userInput);
		// if translate for all other words

	}

	// verify that user is only letters (userInput.matches("[a-zA-Z]+"))

	// method to validate user's text
	public static boolean userInputValid(String userInput) {
		while (userInput.equals("")) {
			Scanner userScanner = new Scanner(System.in);

			System.out.println("The program can't translate nothing. \nPlease enter a word or phrase: ");
			userInput = userScanner.nextLine();

			userScanner.close();
		}
		return true;
	}

	// check if variable starts with a vowel, then translate
	public static void userInputStartVowel(String userInput) {
		char firstLetter = userInput.charAt(0);
		if (firstLetter == 'a' || firstLetter == 'A' || firstLetter == 'e' || firstLetter == 'E' || firstLetter == 'i'
				|| firstLetter == 'I' || firstLetter == 'o' || firstLetter == 'O' || firstLetter == 'u'
				|| firstLetter == 'U') {
			userInput = userInput + "way";
			System.out.println(userInput);
		} else {

		}
	}
}
