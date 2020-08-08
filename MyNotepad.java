import java.awt.*;
import java.awt.event.*;

class MyNotepad extends Frame implements ActionListener
{
    MenuBar mbar;
    Menu file,edit,view,format,help;
    MenuItem fnew, fopen, fsave, esend, vfont, habtus;
    CheckboxMenuItem vsnap;

    public MyNotepad()
    {
        setTitle("Untitled - Notepad");
        setSize(800,500);
        setVisible(true);
        setLayout(null);

        mbar = new MenuBar();
        setMenuBar(mbar);

        file = new Menu("File");
        edit = new Menu("Edit");
        view = new Menu("View");
        help = new Menu("Help");
        format = new Menu("Format");

        mbar.add(file);
        mbar.add(edit);
        mbar.add(format);
        mbar.add(view);
        mbar.add(help);

        fnew = new MenuItem("New");
        fopen = new MenuItem("Open");
        fsave = new MenuItem("Save");
        file.add(fnew);
        file.add(fopen);
        file.add(fsave);

        esend = new MenuItem("Send File");
        edit.add(esend);

        vfont = new MenuItem("Fonts");
        vsnap = new CheckboxMenuItem("Snapshot");
        view.add(vfont);
        view.add(vsnap);
        habtus = new MenuItem("About Us");
        help.add(habtus);

        fnew.addActionListener(this);
        fopen.addActionListener(this);
        esend.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource().equals(fnew))
        {
            Panel p = new Panel();
            p.setLayout(new BorderLayout());
            p.setBounds(100,50,600,400);
            TextArea ta = new TextArea();
            p.add(ta,BorderLayout.CENTER);
            add(p);
        }
        else if(ae.getSource().equals(fopen))
        {
            FileDialog fd = new FileDialog(MyNotepad.this,"OPen File",FileDialog.LOAD);
            fd.setVisible(true);
        }
        else
        {
            Dialog d = new Dialog(MyNotepad.this,"Send File",false);
            d.setSize(200,200);
            d.setLayout(new FlowLayout());
            Label temp = new Label("Sorry no internet Connection");
            d.add(temp);
            d.setVisible(true);
        }
    }

        public static void main(String[] args) {
            MyNotepad obj = new MyNotepad();
        }
    
}