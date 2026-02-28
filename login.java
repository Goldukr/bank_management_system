import aaa.fromnet;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class login extends JComponent{
    login()
    {
        JLabel jl1=new JLabel("LOGIN");
        jl1.setBounds(30,-140,600,500);
        jl1.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,30));
        jl1.setForeground(Color.BLUE);

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
        
         JButton jb2=new JButton("Forget PIN ");
        jb2.setBounds(220,320,250,30);
        jb2.setForeground(Color.BLUE);
        jb2.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,12));
        jb2.setOpaque(false);
        jb2.setContentAreaFilled(false);
        jb2.setBorderPainted(false);

        JButton jb=new JButton("SignUp");
        jb.setBounds(80,350,100,30);
        jb.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,15));
        jb.setForeground(Color.WHITE);
        jb.setBackground(Color.BLUE);
    
        JButton jb1=new JButton("Login");
        jb1.setBounds(200,350,100,30);
        jb1.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,15));
        jb1.setForeground(Color.WHITE);
        jb1.setBackground(Color.BLUE);

        add(jl1);
        add(jl2);
        add(jt1);
        add(jl3);
        add(jt2);
        add(jb);
        add(jb1);
        add(jb2);

        jb.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            JFrame jf=new JFrame();
            jf.add(new bank_management());
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
            jf.add(new forgetpassword());
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
             Function f = new Function();
            ResultSet rs = null;    
             rs = f.find(jt1.getText());
            String s="";
            String s1=jt1.getText();
            
             Function2 f2 = new Function2();
            ResultSet rs1 = null;    
             rs1 = f2.find1(jt2.getText());
            String sr="";
             String s2=jt2.getText();
            
            if(s1.equals("")&& s2.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Please enter Fill the details");
                }
            else{
                 
        try{
      if(rs.next()){
          
              s=rs.getString("Mobile_No");
              
      }if(rs1.next()){
          
              sr=rs1.getString("Password");
      }
      if(s.equals(s1)&&sr.equals(s2))
      {
      JFrame jf=new JFrame();
            jf.add(new homepage());
            jf.setSize(600,1000);
            jf.setVisible(true);
            jf.setResizable(false);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
      else{
          JOptionPane.showMessageDialog(null, "NO DATA FOR THIS ID");
      }
    }catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            
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

        g.setColor(Color.LIGHT_GRAY);
        g.fill3DRect(0,125, 600, 600, true);
            
        g.setColor(Color.DARK_GRAY);
        g.fill3DRect(0,82, 600, 50, true);

        g.setColor(Color.RED);
        g.fillOval(10,82, 130, 50);
    }
     public class Function{
       Connection con = null;
       ResultSet rs = null;
       PreparedStatement ps = null;
       public ResultSet find(String s){
           try{
           con = DriverManager.getConnection("jdbc:mysql://localhost/bank_details","root","");
           ps = con.prepareStatement("select * from details where Mobile_No = ?");
           ps.setString(1,s);
           rs = ps.executeQuery();
           }catch(Exception ex){
              JOptionPane.showMessageDialog(null, ex.getMessage());
           }
           return rs;
       }
   }
     
     public class Function2{
       Connection con = null;
       ResultSet rs1 = null;
       PreparedStatement ps = null;
       public ResultSet find1(String t){
           try{
           con = DriverManager.getConnection("jdbc:mysql://localhost/bank_details","root","");
           ps = con.prepareStatement("select * from details where  Password=?");
           
           ps.setString(1,t);
           rs1 = ps.executeQuery();
           }catch(Exception ex){
              JOptionPane.showMessageDialog(null, ex.getMessage());
           }
           return rs1;
       }
   }
     
    public static void main(String[]args)
    {
        JFrame f=new JFrame();
        f.add(new login());
        f.setSize(500,500);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    }
    

