/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hangman;

/**
 *
 * @author jilly
 */
public class Backend
{   
    //variables
    public static String[] word = {"c", "a", "t"};
    public static String wordStr = "cat";
    public static int wordLength = wordStr.length();
    public static String[] guessWord = {"_", "_", "_" };
    //ascii variables
    public static int origWordTotalAsciiValue = 0;
    public static int guessWordAsciiValue = 0;
    //loop variables
    public static boolean completedWord = false;
    
    
    //letter screen
    //public static String[] text = {Letter1, Letter2, Letter3};
    
    
    //lettercheck
    public static String[] LetterCheck(String inputLetter)
    {
        for(int i = 0; i < wordLength; i++)
            {  
                if(word[i].equals(inputLetter))
                {
                    guessWord[i] = inputLetter;
                    AsciiIncrease(i);
                }
            }
        return guessWord; 
    }
    
    //ascii value increase
    public static int AsciiIncrease(int i)
    {
        char asciiCode = wordStr.charAt(i);
        guessWordAsciiValue += asciiCode;
        return guessWordAsciiValue;
    }
    
    
    //printing out word
    public static void WordPrint()
    {
        //wordDisplay = System.err.println(guessWord);
    }
    
    //completed word check
    public static void Win()
    {
    if(origWordTotalAsciiValue == guessWordAsciiValue)
            {
                new WinningScreen().setVisible(true);
            }
    }
    
}
