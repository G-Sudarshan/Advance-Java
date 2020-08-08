import java.awt.*;
import javax.swing.*;

public class JComboBoxDemo extends JFrame
{
    JComboBox jcb;
    public JComboBoxDemo()
    {
        setSize(500,500);
        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("JCoboBoc Demo");
        String option[] = {"Cricket","Football","hocky","tennis"};
        jcb = new JComboBox(option);
        Label j1 = new Label("Select your Sport : ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(j1);
        add(jcb);
    }

    public static void main(String[] args) {
        JComboBoxDemo obj = new JComboBoxDemo();
    }
}