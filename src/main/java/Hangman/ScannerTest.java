/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hangman;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author jilly
 */
public class ScannerTest
{
    //variables to know what part of the game the user is going on 
    public static boolean brokenPictureFramesOption = false;
    public static boolean tornUpPicturesOption = false;
    public static boolean musicBoxOption = false;
    public static boolean doorOption = false;
    
    //variables
    //file path to the text file
    public static String filePath = getStorylineFilepath();
    
    
    
    //gets the option that was chosen and setting it to true
    public static boolean getOption()
    {
        boolean option = true;
        return option;
    }
    
    
    
    //fetching the storyline that goes with the screen
    public static String getStorylineFilepath()
    {
        //variables
        String storylineFilePath = "";
                
        //checks what option was picked to get the storyline aassociated with it
        if(brokenPictureFramesOption == true)
        {
            storylineFilePath = "src\\main\\resources\\textFiles\\brokenPictureFramesStoryline.txt";
        }
        else if(tornUpPicturesOption == true)
        {
            storylineFilePath = "src\\main\\resources\\textFiles\\tornUpPicturesStoryline.txt";
        }
        else if(musicBoxOption == true)
        {
            storylineFilePath = "src\\main\\resources\\textFiles\\musicBoxStoryline.txt";
        }
        else
        {
            storylineFilePath = "src\\main\\resources\\textFiles\\doorStoryline.txt";
        }
        
        
        return storylineFilePath;
    }
 
    
    
    //gets the information in the text file and returns it as a string
    public static String getStoryline()
    {
        //variables
        String output = "";
        filePath = getStorylineFilepath();
        
        try 
        {
            //making the filepath a file
            File textfile = new File(filePath);
                
            try (Scanner fileScanner = new Scanner(textfile)) 
            {
                //loop to run until everything in text file is scanned
                while (fileScanner.hasNextLine())
                {
                    //runs each line in the text file
                    String line = fileScanner.nextLine();
                    
                    //processes each line
                    //making a scanner to scan through each line
                    Scanner lineScanner = new Scanner(line).useDelimiter("#");
                    String storyline = lineScanner.next();
                    
                    //adding the information to the output
                    output += storyline + "\n";
                    
                    lineScanner.close();
                }
            }
        } 
        //missing file exception
        catch (FileNotFoundException ex) 
        {
            System.out.println("File not found");
        }
        
        
        return output;
    }
    
    
    
    //only gets the storyline in the text file
    public static String getOnlyStoryline()
    {
        //variables
        String output = "";
        filePath = getStorylineFilepath();
        
        try 
        {
            //making the filepath a file
            File textfile = new File(filePath);
                
            try (Scanner fileScanner = new Scanner(textfile)) 
            {
                    //runs each line in the text file
                    String line = fileScanner.nextLine();
                   line = fileScanner.nextLine();
                    
                    //processes each line
                    //making a scanner to scan through each line
                    Scanner lineScanner = new Scanner(line).useDelimiter("#");
                    String storyline = lineScanner.next();
                    
                    //adding the information to the output
                    output += storyline + "\n";
                    
                    lineScanner.close();
                }
            }
        //missing file exception
        catch (FileNotFoundException ex) 
        {
            System.out.println("File not found");
        }
        
        
        return output;
    }
    
    
    
    //testing
    
    public static void main(String[] args)
    {
        brokenPictureFramesOption = true;       
        String booksOutput = getOnlyStoryline();
        System.out.println(booksOutput);
        System.out.println("check");
    }
}
