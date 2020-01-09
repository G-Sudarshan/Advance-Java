/**
 * @author : 176101
 * @version : 1.0 | 2 JAN 2020
 */

import java.awt.*;
import java.awt.event.*;

class Calculator extends Frame implements ActionListener
{ 
    TextField t1;
    TextField t2;
    TextField t3;

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;



    Calculator()
    {
        setSize(500,500);
        setLayout(new FlowLayout());
        setVisible(true);

        Label l1 = new Label("Enter first no");
        Label l2 = new Label("Enter second no");
        Label l3 = new Label("Answer is : ");

         b1 = new Button("+");
         b2 = new Button("-");
         b3 = new Button("*");
         b4 = new Button("/");
         b5 = new Button("=");

         t1 = new TextField(10);
         t2 = new TextField(10);
         t3 = new TextField(10);

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
        //add(b5);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

               
       

        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                System.exit(0);  
            }  
        });

    }

    public void actionPerformed(ActionEvent ae)
        {
           int no1 = Integer.parseInt(t1.getText());
           int no2 = Integer.parseInt(t2.getText());

          // Calculator b = ae.getSource();
           String s = ae.getActionCommand();
           //Label l4 = new Label(s);
           //this.add(l4);

           System.out.println(s);

           if(s=="+")
           {
               int r1 = no1+no2;

               String r =Integer.toString(r1);

               t3.setText(r);

           }
           else if(s=="-")
           {
               int r1 = no1-no2;
               String r = ""+r1;
               t3.setText(r);

           }
           else if(s=="*")
           {
               int r1 = no1*no2;
               String r = ""+r1;
               t3.setText(r);

           }
           else if(s=="/")
           {
               int r1 = no1/no2;
               String r = ""+r1;
               t3.setText(r);

           }
           else{
               System.out.println("Select Operation");
           }
           

        }


    public static void main(String[] args) {
        Calculator c = new Calculator(); 
    }
    
}