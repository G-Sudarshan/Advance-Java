import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class JListDemo extends JFrame
{
    JList jlist;
    JLabel jlab;
    JScrollPane jscrlp;

    String cities[] = {
        "New York","Chicago","Paris","Tokyo","London","New Delhi","Nashik","Begluru" 
     };

     public JListDemo()
     {
         setTitle("JList Demo");
         setSize(500,500);
         setVisible(true);
         setLayout(new FlowLayout(FlowLayout.LEFT));
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         jlist = new JList(cities);
         jlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
         jscrlp = new JScrollPane(jlist);
         jscrlp.setPreferredSize(new Dimension(120,90));
         jlab = new JLabel("Choose a city");
         jlist.addListSelectionListener( new ListSelectionListener()
         {
            public void valueChanged(ListSelectionEvent le)
            {
                int idx = jlist.getSelectedIndex();
                if(idx != -1)
                jlab.setText("Current Selection : "+cities[idx]);
                else
                jlab.setText("Choose a city : ");

            }
         });

         add(jscrlp);
         add(jlab);
     }

     public static void main(String[] args) {
         JListDemo obj = new JListDemo();
     }
}