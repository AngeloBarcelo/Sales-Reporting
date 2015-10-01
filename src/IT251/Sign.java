/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IT251;

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;
/**
 *
 * @author Truth
 */
public class Sign extends JPanel
{
    String message;
    
    //overrides and displays graphics 
    @Override
    public void paintComponent (Graphics logo)
    {
        //Sets background color
        setBackground( Color.BLACK );
        
        //Sets the bottom three circules in the logo
        logo.setColor(Color.darkGray);
        logo.fillOval(23, 100, 23, 23);
       
        logo.setColor(Color.darkGray);
        logo.fillOval(53, 100, 23, 23);
        
        logo.setColor(Color.darkGray);
        logo.fillOval(83, 100, 23, 23);
        
        //Sets middle two circules in logo
        logo.setColor(Color.LIGHT_GRAY);
        logo.fillOval(53, 70, 23, 23);
        
        logo.setColor(Color.LIGHT_GRAY);
        logo.fillOval(83, 70, 23, 23);
        
        //Sets last circule 
        logo.setColor(Color.BLUE);
        logo.fillOval(83, 40, 23, 23);
        
        //draws text next to logo
        logo.setFont(new Font("Thonburi", Font.BOLD, 45));
        logo.setColor(Color.BLUE);
        logo.drawString( "BSI", 125, 100 );
        
        //Draws weird shape using the code from the text book. I could not 
        //figure out how to draw a shape without using one of the basic shapes
        //everything seems to start off with or ending with one of the basic
        //shapes drawline, drawarc, drawovale
        int [] xValues ={20,40,50,30,20,15};
        int [] yValues = {50,50,60,80,80,60};
        Polygon polygon1 = new Polygon(xValues, yValues, 6);
        logo.drawPolygon(polygon1);
        
        //draw string and set font,type, size, color and location
        logo.setFont( new Font( "Papyrus", Font.BOLD, 75) );
        logo.setColor(Color.WHITE);
        logo.drawString( message, 100, 250 );
    } 
    public String getLabel1Text()
    {
        return message;
    }
    void setLabel1Text(String message)
    {
    this.message = message; 
    }
}


