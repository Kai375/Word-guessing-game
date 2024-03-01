import java.util.*;
/**
 * This class represent the guessing game.
 * @param char[] guess
 * @param char[] wordInChar
 */
public class hitOrMiss implements dataBaseSize
{
   public static void hitOrMiss_1(char[] guess, char[] wordInChar)
   {
        Scanner scan = new Scanner(System.in);     
        
        char[] lowerCase = new char[NUMBER_OF_ALPHABET]; // Create arrays for both lower and upper english alphabet characters.
        char[] upperCase = new char[NUMBER_OF_ALPHABET];
      
        System.out.println();

        System.out.println("Enter a valid alphabet character, or press * to end the game: "); // Prompt the user to enter a valid alphabet or press * to exit.

        int guessCounter = 0; 
        
        int charCounter = guess.length; // A variable that represent the guess array length, that can be tampered with.

        boolean flag = true;
                   
        for(char t = 'a'; t <= 'z'; ++t) // Load lowerCase alphabet into an array.
        {
           lowerCase[t - 'a'] = t;
        }
        
        for(char t = 'A'; t <= 'Z'; ++t) // Load upperCase alphabet into an array.
        {
           upperCase[t - 'A'] = t;
        }

        while(flag) // A controlled infinite loop. There are two ways to break it: (1) Press '*', (2) Compelet the game.
        {
            char ch = scan.next().charAt(0); // Take a character input from user.

            if(ch == '*') // This is the first way to break the loop, if '*' as been detected:
            {
                flag = false; // Break the loop in the next iteration.

                guessCounter = guessCounter -1; // Substract the counter by one when '*' as been detected, beacuse it is not counted as a guessing attempted.
            }
            
            for(int i = 0; i < NUMBER_OF_ALPHABET; i++) // After the user as enterd a character, cross check it with both lower and upper case arrays.
            {
                if(ch == lowerCase[i]) // If the inputed character is present in the array, remove it and place a blank. *** NOTICE- If a character as already been chosen, it CAN NOT be used again! ***
                {
                    lowerCase[i] = ' ';
                } 
               
                
                if(ch == upperCase[i]) // If the inputed character is present in the array, remove it and place a blank. *** NOTICE- If a character as already been chosen, it CAN NOT be used again! ***
                {
                    upperCase[i] = ' ';
                }
            }

            if((65 <= ch && ch <= 90) || (97 <= ch && ch <= 122) || ch == 42) // Only accept an input that is a lower or upper case alphabet or an '*',
            {
                guessCounter++;

                for(int i = 0; i < wordInChar.length; i++)
                {                   
                    if(wordInChar[i] == ch) // After the input as been validated, check if it's present in the character array of the original word.
                    {
                       guess[i] = ch; // If so, place it in the corresponding locations in the guess array, (they have the same length).
                        
                       charCounter = charCounter -1; // After successfully placing a character, substract one from this variable until it reach zero. 
                    }                         
                                        
                    if(charCounter == 0) // Finish guessing the word.
                    {
                        flag = false; // Break the loop in the next iteration.                                  
                    }
                }               
                
                // Summery of game data that is showing per guess.
                
                System.out.println();
                System.out.print("Available letters: Lower case [");
                System.out.print(lowerCase);
                System.out.print("] -- ");
                System.out.print("Upper case [");
                System.out.print(upperCase);
                System.out.print("]. Guessing progress:  ");
                System.out.println(guess);
                System.out.println();

                if(!flag && charCounter == 0) // This is the second way of breaking the loop. When charCounter reach zero and the flag is set to false, thats mean that the user guessed the word. 
                {
                     System.out.println("Well done! You have finished guessing the word!");                                        
                }                
            }
            else
            {
                System.out.println("Error, invalid character. Try again.");
            }
        }
        
        // Summery of game data that is showing at end game.
        
        System.out.println();
        System.out.println("Total number of guesses: " + guessCounter);
        System.out.println();
        
        System.out.println("Want a new game? (y/n)"); // Ask the user for another game.
        System.out.println();
        
        char ch = scan.next().charAt(0);
        
        if(ch == 'y')
        {
            flag = true;
            
            wordDataBase.wordDataBase_1();
        }
        else
        {
            System.out.println();
            
            System.out.println("End of game.");
        }
   }
}
