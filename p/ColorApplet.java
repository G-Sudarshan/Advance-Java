import java.applet.*;
import java.awt.*;
/* <applet code="ColorApplet.class" width="500" height="500" ></applet>  */

public class ColorApplet extends Applet
{
    public void paint(Graphics g){
        setBackground (Color.yellow);
        setForeground(Color.magenta);
        Font f1 = new Font("Times New Roman",Font.ITALIC, 24);
        
        g.setFont(f1);
        g.drawString("Welcome to Java Programming",100,100);
        
    }
}