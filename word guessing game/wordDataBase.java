
/**
 * This class represent the data base that contains the words.
 * 
 */
public class wordDataBase implements dataBaseSize
{
  public static void wordDataBase_1()
  {
      String[] words = new String[MAX_SIZE];

      words[0] = "Hello";
      words[1] = "Bye";
      words[2] = "Proletarian";
      words[3] = "Surmise";
      words[4] = "Tincture";
      
      selectedWord.selectedWord_1(words); // After the String array is done with, call the method that tasked with processing the selected word.
  }
}
