import java.awt.*;
import java.awt.event.*;

class MenuDemo extends Frame
{
    Frame f = new Frame();
    public MenuDemo()
    {
        setSize(500,500);
        setVisible(true);
        setTitle("Menu Demo");
        setLayout(null);
        MenuBar m = new MenuBar();
        setMenuBar(m);
        Menu file = new Menu("File");
        Menu edit = new Menu("Edit");
        m.add(file);
        m.add(edit);

        MenuItem m1 = new MenuItem("Open");
        file.add(m1);
        m1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                FileDialog fd = new FileDialog(f,"Choose a file",FileDialog.LOAD);
                fd.setVisible(true);
                String filename = fd.getFile();
                if(filename==null)
                {
                    System.out.println("You cancelled thr choice");
                }
                else
                {
                    System.out.println("You Chose"+filename);
                }
            }
        });

        MenuItem m2 = new MenuItem("New File");
        file.add(m2);
        MenuItem m3 = new MenuItem("Save");
        file.add(m3);
        MenuItem m5 = new MenuItem("-");
        file.add(m5);
        MenuItem m4 = new MenuItem("Exit");
        file.add(m4);
        Menu m6 = new Menu("SubMenu");
        file.add(m6);


        MenuItem s1 = new MenuItem("Select 1");
        m6.add(s1);
        MenuItem s2 = new MenuItem("Select 2");
        m6.add(s2);
        MenuItem s3 = new MenuItem("Select 3");
        m6.add(s3);

        MenuItem e1 = new MenuItem("Cut....");
        edit.add(e1);
        MenuItem e2 = new MenuItem("Copy....");
        edit.add(e2);
        MenuItem e3 = new MenuItem("Paste....");
        edit.add(e3);

        CheckboxMenuItem ch = new CheckboxMenuItem("Debug");
        file.add(ch);
    }

    public static void main(String[] args) {
        MenuDemo o = new MenuDemo();
    }
}