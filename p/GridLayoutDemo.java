import java.awt.*;
import java.awt.event.*;

public class GridLayoutDemo extends Frame
{
    public GridLayoutDemo()
    {
        setTitle("GridLayout Demo");
        setSize(500,500);
        setVisible(true);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
        setLayout(new GridLayout(4,4));
        setFont(new Font("SanSerif",Font.BOLD,24));
        for(int i = 0 ; i < 16 ; i++)
        {
            add(new Button(""+i));
            
        }
    }

    public static void main(String[] args) {
        GridLayoutDemo g = new GridLayoutDemo();
    }
}