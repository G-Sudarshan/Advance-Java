import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.tree.*;

public class JTreeDemo extends JFrame
{
    JTree tree;
    JLabel jlab;

    public JTreeDemo()
    {
        setTitle("JTree Demo");
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        DefaultMutableTreeNode top = new DefaultMutableTreeNode("Options");

        DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
        top.add(a);

        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("A1");
        a.add(a1);

        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("A2");
        a.add(a2);

        DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");
        top.add(b);

        DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("B1");
        b.add(b1);

        DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("B2");
        b.add(b2);

        DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("B3");
        b.add(b3);

        tree = new JTree(top);
        JScrollPane jsp = new JScrollPane(tree);
        add(jsp);

        jlab = new JLabel();

        add(jlab,BorderLayout.SOUTH);

        tree.addTreeSelectionListener(new TreeSelectionListener()
        {
            public void valueChanged(TreeSelectionEvent te)
            {
                jlab.setText("Selection is : "+te.getPath());
            }
        });
    }

    public static void main(String[] args) {
        JTreeDemo obj = new JTreeDemo();
    }
}