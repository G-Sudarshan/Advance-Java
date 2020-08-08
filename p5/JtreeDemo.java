import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.tree.*;

public class JtreeDemo extends JFrame{
    JTree tree;
    JLabel jlab;
    JTable table;

    public JtreeDemo()
    {
        setSize(500,500);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setTitle("JTree and JTable");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DefaultMutableTreeNode top = new DefaultMutableTreeNode("Programming languages");
        DefaultMutableTreeNode a = new DefaultMutableTreeNode("Java");
        top.add(a);
        DefaultMutableTreeNode b = new DefaultMutableTreeNode("C++");
        top.add(b);
        DefaultMutableTreeNode c = new DefaultMutableTreeNode("C");
        top.add(c);

        DefaultMutableTreeNode key = new DefaultMutableTreeNode("Keywords");
        c.add(key);
        DefaultMutableTreeNode fun = new DefaultMutableTreeNode("Functions");
        c.add(fun);
        tree = new JTree(top);
        JScrollPane jsp = new JScrollPane(tree);
        add(jsp);

        String colHeads[] =  {"Keywords", "used", "in", "C"};
        Object[][] data ={
        {"auto", "break","case", "char"},
        {"const","continue","default","do"},
        {"double", "else", "enum", "extern"},
        {"float", "for", "goto", "if"},
        {"int", "long", "register", "return"},
        {"short", "signed","sizeof"," static"},
        {"struct", "switch", "typedef"," union"},
        {"unsigned","void","volatile","while"}
        };

        tree.addTreeSelectionListener(new TreeSelectionListener()
        {
            public void valueChanged(TreeSelectionEvent tse)
            {
                TreePath treepath = tse.getPath();
                if(treepath.getLastPathComponent()==key)
                {
                    table = new JTable(data,colHeads);
                    JScrollPane jsp1 = new JScrollPane(table);
                    add(jsp1,BorderLayout.CENTER);
                }
                else
                {
                    System.out.println("Table not seletced");
                }
            }
        });
    }

    public static void main(String[] args) {
        JtreeDemo obj =new JtreeDemo();
    }
}