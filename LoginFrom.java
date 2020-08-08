import java.awt.*;
import java.awt.event.*;

public class LoginForm extends Frame implements ActionListener
{
    Label l1,l2,l3;
    TextField t1,t2;
    Button b1;

    public LoginForm()
    {
        setTitle("Login Form");
        setSize(500,500);
        setVisible(true);
        setLayout(new FlowLayout());

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });

        l1 = new Label("Username : ");
        l2 = new Label("Password : ");
        l3 = new Label();

        t1 = new TextField(30);
        t2 = new TextField(30);
        t2.setEchoChar('*');

        b1 = new Button("Login");

        b1.addActionListener(this);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(l3);
    }

    public void actionPerformed(ActionEvent ae)
    {
        String u = t1.getText();
        String p = t2.getText();

        if(u.equals("admin") && p.equals("admin123"))
        {
            l3.setText("Login Successfull");
        }
        else
        {
            //l3.setText("Invalid username or passsword");
        }
    }

    public static void main(String[] args) {
        LoginForm obj = new LoginForm();
    }
}