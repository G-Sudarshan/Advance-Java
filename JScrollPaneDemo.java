import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class JScrollPaneDemo extends JFrame
{
   public JScrollPaneDemo()
    {
        setTitle("JScrollPane Demo");
        setSize(500,500);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(20,20));
        int b = 0;
        for (int i = 0 ; i < 20 ; i++)
        {
            for(int j = 0 ; j < 20 ; j++)
            {
                jp.add(new JButton("Button "+b));
                ++b;
            }
        }

        JScrollPane jsp = new JScrollPane(jp);
        add(jsp);
    }

    public static void main(String[] args) {
        JScrollPaneDemo obj = new JScrollPaneDemo();
    }
}