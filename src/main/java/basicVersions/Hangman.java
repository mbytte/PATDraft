package basicVersions;


import java.util.Arrays;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jilly
 */
public class Hangman
{
    public static void main(String[] args)
    {
        //variables
        String[] word = {"c", "a", "t"};
        String wordStr = "cat";
        int wordLength = wordStr.length();
        String[] guessWord = {"_", "_", "_" };
        
        //ascii variables
        int origWordTotalAsciiValue = 0;
        for(int i = 0; i < wordLength; i++)
        {
            char asciiCode = wordStr.charAt(i);
            origWordTotalAsciiValue += asciiCode;
        }
        
        
        
        //loop to carry on until the word is finished
        boolean completedWord = false;
        while(completedWord == false)
        {           
            //input
            String inputLetter = JOptionPane.showInputDialog("Give me a letter");
                       
            //letter check
            int guessWordAsciiValue = 0;
            for(int i = 0; i < wordLength; i++)
            {  
                if(word[i].equals(inputLetter))
                {
                    guessWord[i] = inputLetter;
                    char asciiCode = wordStr.charAt(i);
                    guessWordAsciiValue += asciiCode; 
                }
            }
            
            //printing out progress
            System.out.println(Arrays.toString(guessWord));
            
            //completed word check
            if(origWordTotalAsciiValue == guessWordAsciiValue)
            {
                System.out.println("You have won");
                completedWord = true;
            }
        }
    }
}
