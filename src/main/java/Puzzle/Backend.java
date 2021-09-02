/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Puzzle;
import Puzzle.MainUI.*;
import java.awt.Image;
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
    
    
    //picture randomiser
    public JButton pictureRandomiser(JButton frame)
    {
        String[] images = new String[6];
        images[0] = "/images/1.jpg";
        images[1] = "/images/2.jpg";
        images[2] = "/images/3.jpg";
        images[3] = "/images/4.jpg";
        images[4] = "/images/5.jpg";
        images[5] = "/images/6.jpg";
        frame.setIcon(new ImageIcon(getClass().getResource(images[0])));
        return frame;
    }
    
    
    //picture swapper
    public void pictureSwap(JButton button1, JButton button2)
    {    
        //getting the photo description from each button
        String button1Icon = ((ImageIcon)button1.getIcon()).getDescription();    
        String button2Icon = ((ImageIcon)button1.getIcon()).getDescription();
        
        //button2.setIcon(new ImageIcon(getClass().getResource("/images/1.jpg" )));
        button2.setIcon(new ImageIcon(getClass().getResource(button1Icon)));
        button1.setIcon(new ImageIcon(getClass().getResource(button2Icon)));

        
        //swapping the screens pictures
        //button1.setIcon((Icon) button2Icon);
        //button2.setIcon((Icon) button1Icon);
        
        //button2.setIcon(new ImageIcon(getClass().getResource("/images/1.jpg" )));
        
        
    }
    //check if pic3 is next to picture check (pic3 is blank)
    
}
