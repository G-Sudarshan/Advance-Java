import java.awt.*;
import java.awt.event.*;

public class MyWordCountDemo extends Frame implements TextListener{
    
    TextArea t;
    Label l;

    public MyWordCountDemo(){
        t = new TextArea(20,20);
        l = new Label("0 words");

        add(l);
        add(t);

        setLayout(new FlowLayout());
        setTitle("WordCount");
        setSize(500,500);
        setVisible(true);
        
        t.addTextListener(this);

        addWindowListener(new WindowAdapter(){
            public void windowClsoing(WindowEvent we){
                System.exit(0);
            }
        });
    }

    public void textValueChanged(TextEvent te)
    {
        String s = t.getText();
        String words[] = s.split(" ");
        int wc = words.length;
        String label =  wc + " words";
        l.setText(label);
    }

    public static void main(String args[]){
        MyWordCountDemo obj = new MyWordCountDemo();
    }
}