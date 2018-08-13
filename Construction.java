import java.applet.Applet;  
import java.awt.*;  
   
public class Construction extends Applet {  
       
    private void drawHouse(Graphics g,int rightSide, int leftSide, int bottom, int top){  
     g.drawLine(rightSide, leftSide, bottom, top); 
     g.drawLine(rightSide, leftSide, bottom+80, top+65); 
     g.drawLine(rightSide+83, leftSide, bottom+83, top); 
     
    }  
       
     private void drawTriangle(Graphics g,int bottomX, int bottomY, int base, int height){  
            g.drawLine(bottomX, bottomY, bottomX+base, bottomY);  
            g.drawLine(bottomX+base, bottomY, bottomX+base/2, bottomY-height);  
            g.drawLine(bottomX+base/2, bottomY-height, bottomX, bottomY);  
}  
     public void paint(Graphics g) {  
            this.drawTriangle(g, 80, 80, 100, 110);  
            resize(800,600);  
             
            this.drawHouse(g,85, 150, 85, 85);
        }  
}  