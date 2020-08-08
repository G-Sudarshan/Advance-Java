import java.awt.*;
import java.awt.event.*;

public class Notepad extends Frame implements ActionListener 
{
    TextArea tr;
    Menu file;
    MenuBar mbar;
    MenuItem open,save,exit,b;
    Notepad()
    {
        setTitle("Notepad");
        setSize(500,500);
        setLayout(new FlowLayout());
        setVisible(true);

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });

        mbar = new MenuBar();
        setMenuBar(mbar);

        file = new Menu("File");
        open = new MenuItem("Open");
        file.add(open);
        save = new MenuItem("Save");
        file.add(save);
        b = new MenuItem("-");
        file.add(b);
        exit = new MenuItem("Exit");
        file.add(exit);

        mbar.add(file);

        tr = new TextArea();

        

        exit.addActionListener(this);
        open.addActionListener(this);
        save.addActionListener(this);


        add(tr);

    }

    public void actionPerformed(ActionEvent ae)
    {
        String arg = ae.getActionCommand();

        if(arg.equals("Exit"))
        {
            System.exit(0);
        }
        else if(arg.equals("Open"))
        {
            FileDialog fd = new FileDialog(this,"Open text file",FileDialog.LOAD);
            fd.setVisible(true);
        }
        else if(arg.equals("Save"))
        {
            FileDialog fds = new FileDialog(this,"Save text file",FileDialog.SAVE);
            fds.setVisible(true);
        }


    }

    public static void main(String[] args) {
        Notepad n = new Notepad();
    }

}