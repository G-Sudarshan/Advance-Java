import java.awt.*;

class Registration extends Frame
{
    Registration()
    {
        setSize(500,500);
        setTitle("Registration Form");
        setVisible(true);
        setLayout(null);

        Label l = new Label("Registration Form");
        l.setBounds(200,100,150,21);
        Label l1 = new Label("Enter your name");
        l1.setBounds(100, 200, 100, 21);
        TextField tf1 = new TextField();
        tf1.setBounds(220,200,100,21);
        Label l2 = new Label("Enter your email");
        l2.setBounds(100, 225, 120, 21);
        TextField tf2 = new TextField();
        tf2.setBounds(220,225,100,20);
        Label l3 = new Label("Select Gender");
        l3.setBounds(100,250,120,21);
        CheckboxGroup gender = new CheckboxGroup();
        Checkbox g1 = new Checkbox("male",false,gender);
        g1.setBounds(225,250,50,21);
        Checkbox g2 = new Checkbox("female",false,gender);
        g2.setBounds(225,275,100,25);
        Label l6 = new Label("Select your branch : ");
        l6.setBounds(100,300,110,21);
        Choice c = new Choice();
        
        c.add("Computer Technology");
        c.add("Mechanical");  
        c.add("Civil");  
        c.add("Automobile");  

        c.setBounds(220,300,150,21);

        Label l4 = new Label("Select an option");
        l4.setBounds(100, 330, 100, 21);

        List l5 = new List(4, true);  
        l5.setBounds(222, 330, 100, 50);
      
        l5.add("Laravel");  
        l5.add("Spring");  
        l5.add("Hibernate");  
        l5.add("CodeIgniter");

        Button b= new Button("Submit");
        b.setBounds(250,400,50,21);
        
        add(l);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(tf1);
        add(tf2);
        add(b);
        add(g1);
        add(g2);
        add(c);

    }

    public static void main(String[] args) {
        Registration r = new Registration();
    }
}