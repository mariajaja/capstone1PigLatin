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
		// add step to verify user entered text?

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
		// if translate for all other words

	}

}
