import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class account_details extends JComponent{
    public account_details()
    {
        JLabel jl1=new JLabel("your personal details are here!");
        jl1.setBounds(50,100,500,30);
        jl1.setForeground(Color.BLUE);
        jl1.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,25));

        JLabel jl2=new JLabel("Name");
        jl2.setBounds(50,180,500,30);
        jl2.setForeground(Color.red);
        jl2.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,20));

        JLabel jl3=new JLabel();
        jl3.setBounds(200,180,250,30);
        jl3.setForeground(Color.BLACK);

        JLabel jl4=new JLabel("Address");
        jl4.setBounds(50,225,500,30);
        jl4.setForeground(Color.red);
        jl4.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,20));

        JLabel jl5=new JLabel("Address");
        jl5.setBounds(200,225,500,30);
        jl5.setForeground(Color.red);
        jl5.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,20));

        JLabel jl6=new JLabel("Account Number");
        jl6.setBounds(50,270,500,30);
        jl6.setForeground(Color.red);
        jl6.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,20));

        JLabel jl7=new JLabel("mobile no.");
        jl7.setBounds(200,270,500,30);
        jl7.setForeground(Color.red);
        jl7.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,20));

        JLabel jl8=new JLabel("emial id.");
        jl8.setBounds(50,350,100,30);
        jl8.setForeground(Color.red);
        jl8.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,20));

        JLabel jl9=new JLabel("emial id.");
        jl9.setBounds(200,350,100,30);
        jl9.setForeground(Color.red);
        jl9.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,20));

        JButton jb1=new JButton("OK");
        jb1.setBounds(300,400,100,30);
        jb1.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,15));
        jb1.setForeground(Color.WHITE);
        jb1.setBackground(Color.BLUE);

        JButton jb2=new JButton("UPDATE");
        jb2.setBounds(100,400,100,30);
        jb2.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,15));
        jb2.setForeground(Color.WHITE);
        jb2.setBackground(Color.BLUE);

        add(jl1);
        add(jl2);
        add(jl3);
        add(jl4);
        add(jl5);
        add(jl6);
        add(jl7);
        add(jl8);
        add(jl9);
        
        add(jb1);
        add(jb2);
        

        jb1.addActionListener(new ActionListener()
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

        jb2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JFrame jf=new JFrame();
                jf.add(new update());
                jf.setSize(500,500);
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

        g.setColor(Color.MAGENTA);
        g.fill3DRect(0,81, 600, 5, true);

    }
    public static void main(String[]args)
{
    JFrame f=new JFrame();
        f.add(new account_details());
        f.setSize(500,500);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
    
}
