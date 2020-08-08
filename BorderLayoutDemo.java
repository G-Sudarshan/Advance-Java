import java.awt.*;
import java.awt.event.*;

public class BorderLayoutDemo extends Frame{
    public BorderLayoutDemo(){
        setTitle("BorderLayout");
        setSize(500,500);
        setLayout(new BorderLayout());
        setVisible(true);

        Label north,south,center,east,west;

        north = new Label("This is North");
        south = new Label("This is South");
        east = new Label("This is East");
        west = new Label("This is West");
        center = new Label("This is Center");

        north.setAlignment(Label.CENTER);
        south.setAlignment(Label.CENTER);
        east.setAlignment(Label.CENTER);
        west.setAlignment(Label.CENTER);
        center.setAlignment(Label.CENTER);

        add(north,BorderLayout.NORTH);
        add(south,BorderLayout.SOUTH);
        add(east,BorderLayout.EAST);
        add(west,BorderLayout.WEST);
        add(center,BorderLayout.CENTER);  
        
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
        
    }

    public static void main(String[] args) {
        BorderLayoutDemo obj = new BorderLayoutDemo();
    }


    
}