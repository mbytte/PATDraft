/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Puzzle;
import Puzzle.MainUI.*;
import java.awt.Image;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Meganl
 */
public class Backend 
{
    //get picture reference 
    //String desc = ((ImageIcon)button.getIcon()).getDescription();
    //if(desc.equals(image1.getDescription())
    
    //variables 
    //each image is in the numbered place that their screen variable is in
    
    
    //variables
    public static String[] currentPic = {"/images/0.jpg", "/images/1.jpg", "/images/2.jpg", "/images/3.jpg", "/images/4.jpg", "/images/5.jpg"};
    
    //picture randomiser
    /*public JButton pictureRandomiser(JButton frame)
    {
        String[] images = new String[6];
        images[0] = "/images/0.jpg";
        images[1] = "/images/1.jpg";
        images[2] = "/images/2.jpg";
        images[3] = "/images/3.jpg";
        images[4] = "/images/4.jpg";
        images[5] = "/images/5.jpg";
        frame.setIcon(new ImageIcon(getClass().getResource(images[0])));
        return frame;
    }
    */
    
    public static String getPic(String screenStr)
    {
        //getting the screen number
        int screenNumber = getScreenNumber(screenStr);
        
        //getting the image that is place of the screen
        /*String[] images = new String[6];
        images[0] = "/images/0.jpg";
        images[1] = "/images/1.jpg";
        images[2] = "/images/2.jpg";
        images[3] = "/images/3.jpg";
        images[4] = "/images/4.jpg";
        images[5] = "/images/5.jpg";*/
        
        //setting the image to screenIcon
        String screenIcon = currentPic[screenNumber];
        
        //returning screenIcon to be able to use the file paths of the images
        return screenIcon;   
    }
    
    
    //screen number 
    public static int getScreenNumber(String screenStr)
    {
        int screenNumber = 0;
        //getting the screen number depending on which screen is in question
        if(screenStr.equals("frame1"))
        {
            screenNumber = 1;
        }
        if(screenStr.equals("frame2"))
        {
            screenNumber = 2;
        }
        if(screenStr.equals("frame3"))
        {
            screenNumber = 3;
        }
        if(screenStr.equals("frame4"))
        {
            screenNumber = 4;
        }
        if(screenStr.equals("frame5"))
        {
            screenNumber = 5;
        }
        return screenNumber;
    }
    
    
    //picture swapper
    public void pictureSwap(JButton button1, JButton button2, String button1Str, String button2Str)
    {    
        //getting the image icons in those current buttons
        String button1Icon = getPic(button1Str);
        String button2Icon = getPic(button2Str);
        
        //button2.setIcon(new ImageIcon(getClass().getResource("/images/1.jpg" )));
        button2.setIcon(new ImageIcon(getClass().getResource(button1Icon)));
        button1.setIcon(new ImageIcon(getClass().getResource(button2Icon)));
        
        //setting the current image array to be updated according to what images are there
        int btn1ScreenNumber = getScreenNumber(button1Str);
        currentPic[btn1ScreenNumber] = button2Icon;
        int btn2ScreenNumber = getScreenNumber(button2Str);
        currentPic[btn2ScreenNumber] = button1Icon;
        System.out.println(Arrays.toString(currentPic));

    }
    //check if pic3 is next to picture check (pic3 is blank)
    
}
