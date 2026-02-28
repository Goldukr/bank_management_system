import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class transfer_amount extends JComponent{
    public transfer_amount(){
        JLabel jl1=new JLabel("Transfer your money from here!");
        jl1.setBounds(20,100,500,30);
        jl1.setForeground(Color.BLUE);
        jl1.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,20));
        
        
         JLabel jl5 = new JLabel("Mobile Number ");
        jl5.setBounds(200, 150, 500, 30);
        jl5.setForeground(Color.yellow);
        jl5.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 25));

        JTextField jt3 = new JTextField();
        jt3.setBounds(200, 180, 150, 30);
        jt3.setForeground(Color.BLACK);

        JLabel jl2=new JLabel("Account Number");
        jl2.setBounds(50,250,500,30);
        jl2.setForeground(Color.DARK_GRAY);
        jl2.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,20));

        JTextField jt1=new JTextField();
        jt1.setBounds(250,250,150,30);
        jt1.setForeground(Color.BLACK);

        JLabel jl3=new JLabel("Amount");
        jl3.setBounds(50,300,500,30);
        jl3.setForeground(Color.DARK_GRAY);
        jl3.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,20));

        JTextField jt2=new JTextField();
        jt2.setBounds(250,300,150,30);
        jt2.setForeground(Color.BLACK);

        JButton jb1=new JButton("Send");
        jb1.setBounds(250,400,100,30);
        jb1.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,15));
        jb1.setForeground(Color.WHITE);
        jb1.setBackground(Color.BLUE);

        JButton jb3=new JButton("BACK");
        jb3.setBounds(100,400,100,30);
        jb3.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,15));
        jb3.setForeground(Color.WHITE);
        jb3.setBackground(Color.BLUE);

        add(jl5);
        add(jt3);
        add(jl1);
        add(jl2);
        add(jt1);
        add(jl3);
        add(jt2);
        add(jb1);
        add(jb3);

        jb3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JFrame jf=new JFrame();
                jf.add(new atmservices());
                jf.setSize(600,1000);
                jf.setVisible(true);
                jf.setResizable(false);
                jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               
        }
        });

        jb1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String s1=jt1.getText();
                String s2=jt2.getText();
                if(s1.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Please enter the account number");
                }
                if(s2.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Please enter the Amount");
                }
                else{
                JFrame jf=new JFrame();
                jf.add(new atmservices());
                jf.setSize(600,1000);
                jf.setVisible(true);
                jf.setResizable(false);
                jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JOptionPane.showMessageDialog(null, "your Amount will be transfered sucessfully");
        }
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

        g.setColor(Color.MAGENTA);
        g.fill3DRect(0,81, 600, 5, true);
    }
    public static void main(String[]args)
{
    JFrame f=new JFrame();
        f.add(new transfer_amount());
        f.setSize(500,500);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
    
}
