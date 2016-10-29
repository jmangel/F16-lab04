package edu.ucsb.cs56.drawings.jkr.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes
import java.awt.Point;

import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Circle;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a play button that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author John Rehbein
   @version for CS56, F16, UCSB
   
*/
public class PlayButton extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of house
       @param y y coord of lower left corner of house
       @param radius radius of button
    */
    public PlayButton(int x, int y, int radius)
    {
	// These points are the top, bottom, and right points respectively of the play button
	Point2D[] point = {new Point2D(x+radius/3.0, y+radius/3.0),
			 new Point2D(x+radius/3.0, y+radius*2.0/3.0),
			 new Point2D(x+radius*2.0/3.0, y+radius/2.0)) };
    
         Line2D.Double line1 = 
	     new Line2D.Double (point[0], point[1]);
         Line2D.Double line2 = 
	     new Line2D.Double (point[1], point[2]);
         Line2D.Double line3 = 
	     new Line2D.Double (point[2], point[0]);

    
    
      
	
        GeneralPath playButtonPath = this.get();
        wholeHouse.append(line1, false);
        wholeHouse.append(line2, false);
        wholeHouse.append(line3, false);    
    }
}
