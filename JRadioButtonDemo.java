import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class JRadioButtonDemo extends JFrame implements ActionListener
{
    JLabel jlab;
    public JRadioButtonDemo()
    {
        setTitle("JRadioButton Demo");
        setSize(500,500);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JRadioButton b1 = new JRadioButton("A");
        b1.addActionListener(this);
        add(b1);

        JRadioButton b2 = new JRadioButton("B");
        b2.addActionListener(this);
        add(b2);

        JRadioButton b3 = new JRadioButton("C");
        b3.addActionListener(this);
        add(b3);

        ButtonGroup bg = new ButtonGroup();
        bg.add(b1);
        bg.add(b2);
        bg.add(b3);
        jlab = new JLabel("Select one : ");
        add(jlab);
    }

    public void actionPerformed(ActionEvent ae)
    {
        jlab.setText("You Selected : "+ae.getActionCommand());
    }

    public static void main(String[] args) {
        JRadioButtonDemo obj = new JRadioButtonDemo();
    }
}