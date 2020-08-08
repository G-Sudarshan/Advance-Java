import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class CitiesPanel extends JPanel
{
    public CitiesPanel()
    {
        JButton b1 = new JButton("New York");
        JButton b2 = new JButton("Tokyo");
        JButton b3 = new JButton("Nashik");
        JButton b4 = new JButton("Pune");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
    }
}

class ColorsPanel extends JPanel{
    public ColorsPanel()
    {
        JCheckBox cb1 = new JCheckBox("Red");
        JCheckBox cb2 = new JCheckBox("Green");
        JCheckBox cb3 = new JCheckBox("Blue");

        add(cb1);
        add(cb2);
        add(cb3);

    }
}

class FlavorsPanel extends JPanel{
    public FlavorsPanel()
    {
        JComboBox jcb = new JComboBox();
        jcb.addItem("Vanilla");
        jcb.addItem("Chocolate");
        jcb.addItem("Strawberry");
        add(jcb);
    }
}
public class JTabbedPaneDemo extends JFrame
{
    public JTabbedPaneDemo()
    {
        setTitle("JTabbedPane Demo");
        setSize(500,500);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTabbedPane jtp = new JTabbedPane();
        jtp.addTab("Cities",new CitiesPanel());
        jtp.addTab("Colors",new ColorsPanel());
        jtp.addTab("Flavors",new FlavorsPanel());
        add(jtp);
    }

    public static void main(String[] args) {
        JTabbedPaneDemo obj = new JTabbedPaneDemo();
    }
}