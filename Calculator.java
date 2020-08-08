import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener
{ 
    TextField t1,t2,t3;
    Label l1,l2,l3;
    Button b1,b2,b3,b4;

    Calculator()
    {
        setTitle("Calculator");
        setSize(400,400);
        setVisible(true);
        setLayout(new FlowLayout());

        l1 = new Label("Enter first no : ");
        l2 = new Label("Enter second no : ");
        l3 = new Label("Answer is : ");

        t1 = new TextField(30);
        t2 = new TextField(30);
        t3 = new TextField(30);

        b1 = new Button("Add");
        b2 = new Button("Sub");
        b3 = new Button("Mul");
        b4 = new Button("Div");
        

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae)
    {
        String c = ae.getActionCommand();

        if(c=="Add")
        {
        int n1 = Integer.parseInt(t1.getText());
        int n2 = Integer.parseInt(t2.getText());
        int n3 = n1 + n2;

        String s = " "+n3;

        t3.setText(s);
        
        }

        if(c=="Sub")
        {
        int n1 = Integer.parseInt(t1.getText());
        int n2 = Integer.parseInt(t2.getText());
        int n3 = n1 - n2;

        String s = " "+n3;

        t3.setText(s);
        
        }

        if(c=="Mul")
        {
        int n1 = Integer.parseInt(t1.getText());
        int n2 = Integer.parseInt(t2.getText());
        int n3 = n1 * n2;

        String s = " "+n3;

        t3.setText(s);
        
        }

        if(c=="Div")
        {
        int n1 = Integer.parseInt(t1.getText());
        int n2 = Integer.parseInt(t2.getText());
        int n3 = n1 / n2;

        String s = " "+n3;

        t3.setText(s);
        
        }

    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
    }

}