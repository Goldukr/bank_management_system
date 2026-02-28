import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
public class cards_details extends JComponent {
    public cards_details()
    {
       JButton jb1=new JButton("<html>DebitCard <br>Requsets</html>");
        jb1.setBounds(50,180,100,50);
         jb1.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,15));
         jb1.setForeground(Color.MAGENTA);
         jb1.setBackground(Color.BLACK);
         
         JButton jb2=new JButton("<html>CreditCard <br>Requsets</html>");
        jb2.setBounds(150,180,100,50);
         jb2.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,15));
         jb2.setForeground(Color.MAGENTA);
         jb2.setBackground(Color.BLACK);
        
        JButton jb3=new JButton("<html>Cheque <br>Requsets</html>");
        jb3.setBounds(250,180,100,50);
         jb3.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,15));
         jb3.setForeground(Color.MAGENTA);
         jb3.setBackground(Color.BLACK);

         JButton jb4=new JButton("<html>LostCard <br>Requset</html>");
        jb4.setBounds(350,180,100,50);
         jb4.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,15));
         jb4.setForeground(Color.MAGENTA);
         jb4.setBackground(Color.BLACK);

          JButton jb5 = new JButton("BACK");
        jb5.setBounds(100, 400, 100, 30);
        jb5.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 15));
        jb5.setForeground(Color.WHITE);
        jb5.setBackground(Color.BLUE);
      
        add(jb1);
        add(jb2);
        add(jb4);
        add(jb3);
        add(jb5);
        
        jb1.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            
            JOptionPane.showMessageDialog(null, "Your request for Debit Card is acepted");
            }
        });
        
        jb2.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            JOptionPane.showMessageDialog(null, "Your request for Credit Card is acepted");
        }
        });
        
        jb3.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            JOptionPane.showMessageDialog(null, "Your request for cheque is acepted");
            }
        });

        jb4.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            JOptionPane.showMessageDialog(null, "Thanks for your information your card is now blocked");
            }
        });
        
        
        jb5.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            
            JFrame jf=new JFrame();
            jf.add(new homepage());
            jf.setSize(600,1000);
            jf.setVisible(true);
            jf.setResizable(false);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
            }
            

        });
        
    }
    public void paintComponent(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.fill3DRect(0,5, 600, 80, true);

        Toolkit t=Toolkit.getDefaultToolkit();
        Image i=t.getImage("D:\\Java prog\\aaa\\src\\aaa\\3.png");
        g.drawImage(i, 150, 0, this);

        g.setColor(Color.YELLOW);
        g.fill3DRect(0,150, 600, 5, true);

    }
    
    public static void main(String[]args) throws IOException
    {
        
        JFrame f=new JFrame();
        f.add(new cards_details());
        f.setSize(500,500);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}