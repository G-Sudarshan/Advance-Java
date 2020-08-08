import java.awt.*;
import java.awt.event.*;

public class MenuDemo extends Frame implements ItemListener
{
    Label l1;
    CheckboxMenuItem debug;
    
    public MenuDemo()
    {
        setTitle("Checkable Menu Item Demo");
        setSize(500,500);
        setLayout(new FlowLayout());
        setVisible(true);
        addWindowListener(new WindowAdapter(){
            public void winowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
        l1 = new Label("Debug : off");
        add(l1);
        MenuBar mbar = new MenuBar();
        setMenuBar(mbar);
        Menu file = new Menu("File");
        mbar.add(file);
        debug = new CheckboxMenuItem("Debug");
        file.add(debug);
        debug.addItemListener(this);

    }

    public void itemStateChanged(ItemEvent ie)
    {
        boolean b = debug.getState();
        if(b)
        {
            l1.setText("Debug : On");
        }
        else
        {
            l1.setText("Debug : Off");
        }
    }

    public static void main(String[] args) {
        MenuDemo obj = new MenuDemo();
    }
}