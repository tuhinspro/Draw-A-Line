import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.geom.Line2D;

public class Triangle extends JApplet {
  public void init() {
  setBackground(Color.lightGray);
  }
  public void paint(Graphics g) {
  Graphics2D g2d = (Graphics2D) g;
  g2d.setPaint(Color.red);
  g2d.draw(new Line2D.Double(50,150,150,150 ));
  g2d.draw(new Line2D.Double(50,50,150,150 ));
  g2d.draw(new Line2D.Double(50,50,50,150 ));
  }
  public static void main(String s[]) {
  JFrame frame = new JFrame("Show Triangle");
  JApplet applet = new Triangle();
  frame.getContentPane().add("Center", applet);
  applet.init();
  frame.setSize(300, 250);
  frame.show();
  }
}