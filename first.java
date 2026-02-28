import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
public class first extends JComponent {
    public first()
    {
        JTextField jt1=new JTextField();
        jt1.setBounds(100,250,260,30);
         jt1.setForeground(Color.BLACK);
         
         JButton jb=new JButton("CLICK HERE TO COMPLETE THE APPLICATION");
        jb.setBounds(90,620,400,50);
        jb.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,15));
        jb.setForeground(Color.WHITE);
        jb.setBackground(Color.BLUE);
        add(jb);
        add(jt1);
       
        jb.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String msg=jt1.getText();
                new second(msg).setVisible(true);
                setVisible(false);
                
         }
         });
    }
    public static void main(String[]args)
    {
        JFrame f=new JFrame();
        f.add(new first());
         f.setSize(600,1000);
        f.setVisible(true);
        f.setResizable(false);
            // f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
} 