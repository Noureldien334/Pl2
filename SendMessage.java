
package messagetoallmembers;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SendMessage {
    public SendMessage()
    {
        CoachMessage o = new CoachMessage ();
        JFrame f1 = new JFrame ("Send Message ");
        f1.setSize(600,600);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(null);
        f1.setLocation(650, 250);
        JButton b1 = new JButton("Message");
        JButton b2 = new JButton("Send Message");
        JTextArea ta = new JTextArea(30,50); 
        ta.setLineWrap(true);
        JScrollPane sp = new JScrollPane(ta);
        ta.setEditable(true);
        b1.setBounds(400, 200, 140, 40);
        f1.add(b1);
        
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                 JFrame f2 = new JFrame ("Send Message"); 
                 f2.setSize(600,600);
                 f2.setVisible(true);
                 f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 f2.setLayout(new FlowLayout());
                 f2.setLocation(650, 250);
                 ta.append(" ");
                 f2.add(ta);
                 f2.add(b2);
             
            }
        });
          b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                  try {
                    o.MessageFunction(ta.getText());
                   }
                 catch (IOException ex) {
                }
                  
                  JOptionPane.showMessageDialog(null,"The Message Sent Successfully");
                  
            }
        });
        
        
    
    }
}
