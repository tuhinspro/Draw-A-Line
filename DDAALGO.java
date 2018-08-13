import java.applet.*;
import java.awt.*;
import java.util.*;

public class DDAALGO extends Applet
{
	 public void paint(Graphics g)
	    {
		 double xc,yc;
    double dx,dy,steps,x,y,k;
    double x1=400,y1=600,x2=200,y2=500;
    try{
            dx=x2-x1;
        dy=y2-y1;
    if(Math.abs(dx)>Math.abs(dy))
        steps=Math.abs(dx);
        else
        steps=Math.abs(dy);
        xc=(dx/steps);
        yc=(dy/steps);
        x=x1;
        y=y1;
  
        for(k=1;k<=steps;k++)
        {
            x=x+xc;
            y=y+yc;
            g.fillOval((int)x,(int)y,5,5);
            
        }
            }
    
            catch(Exception e){}
    }


}