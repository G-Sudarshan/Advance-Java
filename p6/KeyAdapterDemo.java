import java.awt.*;
import java.awt.event.*;

class KeyAdapterDemo extends KeyAdapter{
    Label l,l1;
    TextArea area;
    Frame f;
    public KeyAdapterDemo()
    {
        f = new Frame();
        l = new Label();
        l.setBounds(20,50,200,20);
        area = new TextArea();
        area.setBounds(20,80,300,300);
        area.addKeyListener(this);
        f.add(l);
        f.add(area);

        f.setSize(600,600);
        f.setLayout(null);
        f.setTitle("Adapter class Demo");
        f.setVisible(true);

        
        f.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });

    }

    public void keyReleased(KeyEvent ke)
    {
        String text = area.getText();
        String words[] = text.split("\\s");
        l.setText("Words : "+words.length+"Characters : "+text.length()); 
    }

    public static void main(String[] args) {
        new KeyAdapterDemo();
    }
}