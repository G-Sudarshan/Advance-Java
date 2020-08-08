import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="MyApplet.class" Height=500 Width=500></applet>
*/
public class MyApplet extends Applet implements ActionListener{

    TextField tf1,tf2;
    Button b;
    Label l1,l2;
   
    public void init()
    {
        
        setSize(500,500);
       

        tf1 = new TextField(10);
        tf2 = new TextField(10);
        b = new Button("calculate factorial");
        l1 = new Label("Enter no : ");
        l2 = new Label("Factorial is : ");
        add(l1);
        add(tf1);
        add(b);
        add(l2);
        add(tf2);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
    {
        int a = Integer.parseInt(tf1.getText());
        int r = fact(a);
        String re = r+"";
        tf2.setText(re); 

    }

    public int fact(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else
        {
            return (n*fact(n-1));
        }
    }

  
    

}