/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Puzzle;
import Puzzle.MainUI.*;
import java.awt.Image;
import javax.accessibility.AccessibleContext;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Meganl
 */
public class Backend 
{
    //need a picture randomiser
    
    
    //get picture reference 
    //String desc = ((ImageIcon)button.getIcon()).getDescription();
    //if(desc.equals(image1.getDescription())
    
    //check
    public static void main(String[] args)
    {   
        System.out.println("");
    }
    
    //picture swapper
    public void PictureSwap(JButton button1, JButton button2)
    {    
        //getting the photo description from each button
        String button1Icon = ((ImageIcon)button1.getIcon()).getDescription();
        String button2Icon = ((ImageIcon)button1.getIcon()).getDescription();
        //AccessibleContext button2Icon = ((ImageIcon)button2.getIcon()).getAccessibleContext();
        //AccessibleContext button1Icon = ((ImageIcon)button1.getIcon()).getAccessibleContext();
        
        //return strings
        //String 1 = button1Icon;
        
        button2.setIcon(new ImageIcon(getClass().getResource(button1Icon)));
        button1.setIcon(new ImageIcon(getClass().getResource(button2Icon)));

        
        //swapping the screens pictures
        //button1.setIcon((Icon) button2Icon);
        //button2.setIcon((Icon) button1Icon);
        
        //button2.setIcon(new ImageIcon(getClass().getResource("/images/1.jpg" )));
        
        
        
        //return button1Icon;
        //return button2Icon;
    }
    //check if pic3 is next to picture check (pic3 is blank)
    
}
