/**

 @author : 176114
 @version : 1.0 | 1 JAN 2020

*/


import java.awt.*;
import java.awt.event.*;

class First_frame extends Frame implements WindowListener
{
	First_frame()
	{
		
		Label name  = new Label("Name");
		Label password = new Label("password");
		TextField nameInput = new TextField(10);
		TextField passwordInput = new TextField(10);
		passwordInput.setEchoChar('*');

		Button register = new Button("Register");

		Choice c = new Choice();  
         
        c.add("First Year");  
        c.add("Second Year");  
        c.add("Third Year");  
       
        List l1 = new List(5);  
         
        l1.add("Computer Technology");  
        l1.add("Information Technology");  
        l1.add("Mechanical");  
        l1.add("Civil");  
        l1.add("Automobile");  

        List l2 = new List(4, true);  
      
        l2.add("Turbo C++");  
        l2.add("Spring");  
        l2.add("Hibernate");  
        l2.add("CodeIgniter");  

        CheckboxGroup cbg = new CheckboxGroup();  
        Checkbox checkBox1 = new Checkbox("Male", cbg, false);    
          
        Checkbox checkBox2 = new Checkbox("Female", cbg, false);    
               	
		add(name);
		add(nameInput);
		add(password);
		add(passwordInput);
		add(checkBox1);
		add(checkBox2);
		add(l1); 
		add(c); 
		add(l2);
		add(register);    

		setTitle("Registration form");

		setSize(500,500);

		setLayout(new FlowLayout());

		setVisible(true);

		addWindowListener(this);  

	}

	

public void windowClosing(WindowEvent arg0) {  
    System.exit(0);
} 

public void windowClosed(WindowEvent arg0) {}  
public void windowActivated(WindowEvent arg0) {}   
public void windowDeactivated(WindowEvent arg0) {}  
public void windowDeiconified(WindowEvent arg0) {}  
public void windowIconified(WindowEvent arg0) {}  
public void windowOpened(WindowEvent arg0) {}  

	public static void main(String[] args) {
		First_frame f = new First_frame();
	}
}