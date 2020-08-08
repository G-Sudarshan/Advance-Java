import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class JToggleButtonDemo extends JFrame
{
    JLabel jlab;
    JToggleButton jtbn;
   public JToggleButtonDemo()
    {
        setTitle("JToggleButton Demo");
        setSize(500,500);
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jlab = new JLabel("Button is off");
        jtbn = new JToggleButton("On/Off");
        jtbn.addItemListener(new ItemListener()
        {
            public void itemStateChanged(ItemEvent ie)
            {
                if(jtbn.isSelected())
                {
                    jlab.setText("Button is On");
                }
                else
                {
                    jlab.setText("Button is Off");   
                }
            }
        });

        add(jtbn);
        add(jlab);
    }

    public static void main(String[] args) {
        JToggleButtonDemo obj = new JToggleButtonDemo();
    }
}