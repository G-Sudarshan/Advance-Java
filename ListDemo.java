import java.awt.*;
import java.awt.event.*;

public class ListDemo extends Frame implements ActionListener
{
    List os, browser;
    String msg = "";
    public ListDemo()
    {
        setTitle("List Demo");
        setSize(500,500);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setVisible(true);

        os= new List(4,true);
        browser = new List(4,false);

        os.add("Windows Xp");
        os.add("Windows Vista");
        os.add("Solaris");
        os.add("Mac OS");

        browser.add("Interney Explorer ");
        browser.add("Google Chrome");
        browser.add("Chrome");
        browser.add("safari");

        browser.select(1);

        add(os);
        add(browser);

        os.addActionListener(this);
        browser.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae)
    {
        repaint();

    }

    public void paint(Graphics g)
    {
        int idx[];
        msg = "Current Os : ";
        idx = os.getSelectedIndexes();
        for(int i = 0 ; i < idx.length ; i++)
        {
            msg += os.getItem(idx[i])+" ";
        }
        g.drawString(msg,50,120);
        msg = "Current Browser";
        msg += browser.getSelectedItem();
        g.drawString(msg,50,140);
    }
    
    public static void main(String[] args) {
        ListDemo obj = new ListDemo();
    }
}