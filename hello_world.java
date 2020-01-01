/**

 @author : 176114
 @version : 1.0

*/


import java.awt.*;
import java.awt.event.*;

class Hello_world extends Frame impl
{
	Hello_world()
	{
		Label l = new Label("Hello World");
		l.setBounds(30,100,80,30);
		add(l);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
			Hello_world h1 = new Hello_world();
		}	
}