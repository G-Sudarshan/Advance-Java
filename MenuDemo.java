import java.awt.*;
import java.awt.event.*;

public class MenuDemo extends Frame implements ActionListener,ItemListener
{
    String msg = "";
    MenuBar mbar;
    Menu file,edit,sub;

    MenuItem item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11, item12;
    CheckboxMenuItem debug, test;
    
    MenuDemo()
    {
        int n = 4;
        setTitle("Menu Program");
        setSize(500,500);
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.LEFT));

        mbar = new MenuBar();
        setMenuBar(mbar);

        file = new Menu("File");
        item1 = new MenuItem("New.....");
        file.add(item1);
        item2 = new MenuItem("Open.....");
        file.add(item2);
        item3 = new MenuItem("Close.....");
        file.add(item3);
        item4 = new MenuItem("-");
        file.add(item4);
        item5 = new MenuItem("Quit.....");
        file.add(item5);
        mbar.add(file);

        edit = new Menu("Edit");
        item6 = new MenuItem("Cut");
        edit.add(item6);
        item7 = new MenuItem("Copy");
        edit.add(item7);
        item8 = new MenuItem("Paste");
        edit.add(item8);
        item9 = new MenuItem("-");
        edit.add(item9);
        sub = new Menu("Special");
        item10 = new MenuItem("First");
        sub.add(item10);
        item11 = new MenuItem("Second");
        sub.add(item11);
        item12 = new MenuItem("Second");
        sub.add(item12);
        edit.add(sub);

        debug = new CheckboxMenuItem("Debug");
        edit.add(debug);
        test = new CheckboxMenuItem("testing");
        edit.add(test);
        mbar.add(edit);

        item1.addActionListener(this);
        item2.addActionListener(this);
        item3.addActionListener(this);
        item4.addActionListener(this);
        item5.addActionListener(this);
        item6.addActionListener(this);
        item7.addActionListener(this);
        item8.addActionListener(this);
        item9.addActionListener(this);
        item10.addActionListener(this);
        item11.addActionListener(this);
        item12.addActionListener(this);
        

        debug.addItemListener(this);
        test.addItemListener(this);

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g)
    {
        g.drawString(msg,50,200);
        if(debug.getState())
        {
            g.drawString("Debug is on",50,220);
        }
        else
        {
            g.drawString("Debug is off",50,220);
        }
        if(test.getState())
        {
            g.drawString("Testing is on",50,240);
        }
        else
        {
            g.drawString("Testing is off",50,240);
        }


    }

    public void actionPerformed(ActionEvent ae)
    {
        msg = "Yoy Selected : ";
        String arg = ae.getActionCommand();
        if(arg.equals("New....."))
            msg += "New.....";
        else if(arg.equals("Open....."))
            msg += "Open.....";
        else if(arg.equals("Close....."))
            msg += "Close.....";
        else if(arg.equals("Quit....."))
            msg += "Quit.....";
        else if(arg.equals("Cut"))
            msg += "Cut";
        else if(arg.equals("Copy"))
            msg += "Copy";
        else if(arg.equals("Paste"))
            msg += "Paste";
        else if(arg.equals("First"))
            msg += "First";
        else if(arg.equals("Second"))
            msg += "Second.";
        else if(arg.equals("Second"))
            msg += "Second";
        else if(arg.equals("Debug"))
            msg += "Debug";
        else if(arg.equals("testing"))
            msg += "testing";

        repaint();
        
    }

    public void itemStateChanged(ItemEvent ie)
    {
        repaint();
    }

    public static void main(String[] args) {
        MenuDemo obj = new MenuDemo();
    }
}