import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class SimpleCalculator  extends Frame implements ActionListener
{
    TextField tf;
    String s1,s2,s3,s4,s5;
    int c,n;
    Button add,sub,mul,div,mod,cl,eql;

    public SimpleCalculator()
    {

        setSize(500,500);
        setTitle("Calculator");
        setVisible(true);
        FlowLayout ft = new FlowLayout();
        setLayout(ft);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
        tf = new TextField(20);
        add(tf);
        
        Panel p = new Panel();
        add(p);
        p.setLayout(new GridLayout(5,4,4,4));
        Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;

        b0 = new Button("0");
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");

        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        
        add = new Button("+");
        add.addActionListener(this);
        sub = new Button("-");
        sub.addActionListener(this);
        mul = new Button("*");
        mul.addActionListener(this);
        div = new Button("/");
        div.addActionListener(this);
        mod = new Button("%");
        mod.addActionListener(this);
        eql = new Button("=");
        eql.addActionListener(this);
        cl  = new Button("C");
        cl.addActionListener(this);     

        add(b0);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(add);
        add(sub);
        add(mul);
        add(div);
        add(mod);
        add(eql);
        add(cl);

        
        

    }

    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==add)
        {
            s1 = tf.getText();
            tf.setText("");
            c = 1;
        }
        else if(ae.getSource()==sub)
        {
            s1 = tf.getText();
            tf.setText("");
            c=2;
        }
        else if(ae.getSource()==mul)
        {
            s1 = tf.getText();
            tf.setText("");
            c=3;
        }
        else if(ae.getSource()==div)
        {
            s1 = tf.getText();
            tf.setText("");
            c=4;
        }
        else if(ae.getSource()==mod)
        {
            s1 = tf.getText();
            tf.setText("");
            c=5;
        }
        else if(ae.getSource()==eql)
        {
            s2 = tf.getText();
            if(c==1)
            {
                n = Integer.parseInt(s1) + Integer.parseInt(s2);
                tf.setText(String.valueOf(n));

            }
            else if(c==2)
            {
                n = Integer.parseInt(s1) - Integer.parseInt(s2);
                tf.setText(String.valueOf(n));   
            }
            else if(c==3)
            {
                n = Integer.parseInt(s1) * Integer.parseInt(s2);
                tf.setText(String.valueOf(n));   
            }
            else if(c==4)
            {
                n = Integer.parseInt(s1) / Integer.parseInt(s2);
                tf.setText(String.valueOf(n));   
            }
            else if(c==5)
            {
                n = Integer.parseInt(s1) % Integer.parseInt(s2);
                tf.setText(String.valueOf(n));   
            }

        }
        else if(ae.getSource()==cl)
        {
            tf.setText("");
        }
        else
        {
            String s10 = ae.getActionCommand();
            String s = tf.getText();
            tf.setText(s+s10);
        }


    }

    public static void main(String[] args) {
        SimpleCalculator sc = new SimpleCalculator();
    }
}