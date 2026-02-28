
import aaa.fromnet;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class forgetpassword extends JComponent{
    forgetpassword()
    {
        JLabel jl2=new JLabel("Mobile Number");
        jl2.setBounds(150,180,150,30);
        jl2.setForeground(Color.BLUE);
        jl2.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,15));

        JTextField jt1=new JTextField();
        jt1.setBounds(90,210,250,30);
        jt1.setForeground(Color.BLACK);

        JLabel jl3=new JLabel("PIN");
        jl3.setBounds(150,250,150,30);
        jl3.setForeground(Color.blue);
        jl3.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,15));

        JPasswordField jt2=new JPasswordField();
        jt2.setBounds(90,280,250,30);
        jt2.setForeground(Color.BLACK);
        
        JLabel jl4=new JLabel("REWrite-PIN");
        jl4.setBounds(150,310,150,30);
        jl4.setForeground(Color.blue);
        jl4.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,15));

        JPasswordField jt3=new JPasswordField();
        jt3.setBounds(90,350,250,30);
        jt3.setForeground(Color.BLACK);
        
        JButton jb=new JButton("Continue");
        jb.setBounds(200,420,100,30);
        jb.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,15));
        jb.setForeground(Color.WHITE);
        jb.setBackground(Color.BLUE);

        
        add(jl2);
        add(jt1);
        add(jl3);
        add(jl4);
        add(jt3);
        add(jt2);
        add(jb);
     

        jb.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            String s1,s2,s3;
            s1=jt1.getText();
            s2=jt2.getText();
            s3=jt3.getText();
            if(s1.equals("")&&s2.equals("")&&s3.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please fill the details");
            }
            else if(s2.equals(s3))
            {
            JFrame jf=new JFrame();
            jf.add(new login());
            jf.setSize(600,1000);
            jf.setVisible(true);
            jf.setResizable(false);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JOptionPane.showMessageDialog(null,"your password have been changed");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Please match your password");
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

    }
    
     
    public static void main(String[]args)
    {
        JFrame f=new JFrame();
        f.add(new forgetpassword());
        f.setSize(500,500);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    }
    


