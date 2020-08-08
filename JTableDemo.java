import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class JTableDemo extends JFrame
{
    JLabel jlab;

    public JTableDemo()
    {
        setTitle("JTable Demo");
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] colHeads = {"Name","Extension","ID#"};

        Object[][] data = {
            {"Gail","4567","745"},
            {"sdfss","867","645"},
            {"efwdf","7667","545"},
            {"cxvxc","3467","245"},
            {"Gsdfl","8867","145"},
            {"ykl","3358","202"},
            {"ojasil","3222","789"},
            {"qwl","6069","234"},
            {"kkqil","6667","755"},
            {"assdil","1007","454"}

        };

        JTable table = new JTable(data,colHeads);

        JScrollPane jsp = new JScrollPane(table);

        add(jsp);

    }

    public static void main(String[] args) {
        JTableDemo obj = new JTableDemo();
    }
}