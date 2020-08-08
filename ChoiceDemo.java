import java.awt.*;
import java.awt.event.*;

public class ChoiceDemo extends Frame implements ItemListener
{
    Choice os, browser;
    String msg = "";
    public ChoiceDemo()
    {
        setTitle("Choice Demo");
        setSize(500,500);
        setLayout(new FlowLayout());
        setVisible(true);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });

        os = new Choice();
        browser = new Choice();

        os.add("Windows Xp");
        os.add("Windows Vista");
        os.add("Solaris");
        os.add("Mac OS");

        browser.add("Interney Explorer ");
        browser.add("Google Chrome");
        browser.add("Chrome");
        browser.add("safari");

        add(os);
        add(browser);

        os.addItemListener(this);
        browser.addItemListener(this);

    }

    public void itemStateChanged(ItemEvent ie)
    {
        repaint();
    }

    public void paint(Graphics g)
    {
        msg  = "Current OS : ";
        msg += os.getSelectedItem();
        g.drawString(msg,50,120);
        
        msg = "Current Browser : ";
        msg += browser.getSelectedItem();
        g.drawString(msg,50,140);
    }
    
    public static void main(String[] args) {
        ChoiceDemo obj = new ChoiceDemo();
    }
}