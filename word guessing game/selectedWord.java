import java.util.*;
/**
 * This class represents the word selecting and processing flow.
 * 
 * @param String[] words
 */
public class selectedWord implements dataBaseSize
{
    public static void selectedWord_1(String[] words)
    {        
        System.out.print("The word that needs to be guessed: "); // Show the user the skeletal layout of the selected word that needs to be guessed.
        
        Random random = new Random(); // Call the pseudo - random number generator.

        int  randomIndex = random.nextInt(MAX_SIZE); // Create a random number in the correct range (words.length()) that will act as an index for the words array. In this fashion, the method will select a random word from the array.   
        
        int length = words[randomIndex].length(); // With the word chosen from words array, get it's length().

        char[] guess = new char[length]; // Create a character array length as the selected word. This array will be the one that the user will guess characters into.
        
        char[] wordInChar = new char[length]; // Create a character array length as the selected word as well, this array will hold the selected word in form of characters for the program to cross check with the user input.

        for(int i = 0; i < guess.length; i++) 
        {
            wordInChar[i] = words[randomIndex].charAt(i); // Load the word into a character array.

            guess[i] = '-'; // Load the guess array with '-' marks.

            System.out.print("[" + guess[i] + "]"); // Print guess array skeletal onto the screen.             
        }
        
        System.out.println();
        
        hitOrMiss.hitOrMiss_1(guess, wordInChar); // Call the guessing method with both arrays.
    }
}
