import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.*;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import java.io.IOException;
import java.sql.DriverManager;
public class create_Account extends JComponent {
    public create_Account()
    {
       
        
        JLabel jl1=new JLabel("Get started here to open an");
        jl1.setBounds(40,-220,600,500);
        jl1.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,35));
        jl1.setForeground(Color.BLUE);
        

        JLabel jl2=new JLabel("Account with Kotak Bank");
        jl2.setForeground(Color.BLUE);
        jl2.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,35));
        jl2.setBounds(40,-180,1000,500);
        
        JLabel jl3=new JLabel("Title");
        jl3.setBounds(50,180,150,30);
        jl3.setForeground(Color.DARK_GRAY);
        jl3.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,15));

        String[] optionToChoose={"MR","MRS"};
        JComboBox<String> jComboBox=new JComboBox<>(optionToChoose);
        jComboBox.setBounds(250,180,140,25);
        jComboBox.setFont(new java.awt.Font ("Arial",java.awt.Font.PLAIN,10));
        
        
        JLabel jl4=new JLabel("Full Name*");
        jl4.setBounds(50,225,150,30);
        jl4.setForeground(Color.DARK_GRAY);
        jl4.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,15));

        JTextField jt1=new JTextField();
        jt1.setBounds(250,225,250,30);
        jt1.setForeground(Color.BLACK);

        JLabel jl5=new JLabel("Father's Name*");
        jl5.setBounds(50,270,150,30);
        jl5.setForeground(Color.DARK_GRAY);
        jl5.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,15));

        JTextField jt2=new JTextField();
        jt2.setBounds(250,270,250,30);
        jt2.setForeground(Color.BLACK);

        JLabel jl6=new JLabel("Aadhar Number*");
        jl6.setBounds(50,315,250,30);
        jl6.setForeground(Color.DARK_GRAY);
        jl6.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,15));

        JTextField jt3=new JTextField();
        jt3.setBounds(250,315,250,30);
        jt3.setForeground(Color.BLACK);

        JLabel jl11=new JLabel("D.O.B*");
        jl11.setBounds(50,360,200,30);
        jl11.setForeground(Color.DARK_GRAY);
        jl11.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,15));

        JTextField jt6=new JTextField();
        jt6.setBounds(250,360,250,30);
        jt6.setForeground(Color.BLACK);


        JLabel jl7=new JLabel("Email Id*");
        jl7.setBounds(50,405,150,30);
        jl7.setForeground(Color.DARK_GRAY);
        jl7.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,15));

        JTextField jt4=new JTextField();
        jt4.setBounds(250,405,250,30);
        jt4.setForeground(Color.BLACK);

        JLabel jl8=new JLabel("Mobile No.*");
        jl8.setBounds(50,450,150,30);
        jl8.setForeground(Color.DARK_GRAY);
        jl8.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,15));

        JTextField jt5=new JTextField();
        jt5.setBounds(250,450,250,30);
        jt5.setForeground(Color.BLACK);
        
         JTextField jt7=new JTextField();
        jt7.setText("0");


        JLabel jl9=new JLabel("PIN*");
        jl9.setBounds(50,495,150,30);
        jl9.setForeground(Color.DARK_GRAY);
        jl9.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,15));

        JPasswordField jp1=new JPasswordField();
        jp1.setBounds(250,495,250,30);
        jp1.setForeground(Color.BLACK);

        JLabel jl10=new JLabel("ReWrite PIN*");
        jl10.setBounds(50,540,200,30);
        jl10.setForeground(Color.DARK_GRAY);
        jl10.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,15));

        JPasswordField jp2=new JPasswordField();
        jp2.setBounds(250,540,250,30);
        jp2.setForeground(Color.BLACK);

        JButton jb=new JButton("Next");
        jb.setBounds(400,620,150,50);
        jb.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,15));
        jb.setForeground(Color.WHITE);
        jb.setBackground(Color.BLUE);

        JButton jb1=new JButton("Back");
        jb1.setBounds(0,620,150,50);
        jb1.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,15));
        jb1.setForeground(Color.WHITE);
        jb1.setBackground(Color.BLUE);
        
        add(jl1);
        add(jl2);
        add(jComboBox);
        add(jl3);
        add(jt1);
        add(jl4);
        add(jt2);
        add(jl5);
        add(jt3);
        add(jl6);
        add(jt4);
        add(jl7);
        add(jt5);
        add(jl8);
        add(jl9);
        add(jl10);
        add(jl11);
        add(jt6);
        add(jp1);
        add(jp2);
        add(jb1);
        add(jb);

      
        
        jb.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            String s1,s2,s3,s4,s5,s6,s7,st,s8,s9,s10,s11;
            st=""+jComboBox.getItemAt(jComboBox.getSelectedIndex());
            s1=jt1.getText();
            s2=jt2.getText();
            s3=jt3.getText();
            s4=jt4.getText();
            s5=jt5.getText();
            s6=jt6.getText();
            s7=jp1.getText();
            s8=jp2.getText();
            s9="91"+jt5.getText();
            s10="91"+jt5.getText()+"6599";
            s11=jt7.getText();

        if(s1.equals("")&&s2.equals("")&&s3.equals("")&& s4.equals("")&&s5.equals("")&&s6.equals("")&&s7.equals("")&&s8.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please fill the details");
        }
        
            
       else if(s7.equals(s8)&& s4.contains("@gmail.com")||s4.contains("@ymail.com")||s4.contains("yahoo.com")||s4.contains("@outlook.com")||s4.contains("@redishmail.com")||s4.contains("@hotmail.com")&&s3.equals("12")&&s5.equals("10"))
        {
            JFrame jf=new JFrame();
            jf.add(new create_acount1());
            jf.setSize(600,1000);
            jf.setVisible(true);
            jf.setResizable(false);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               
            
        }
      else{
        JOptionPane.showMessageDialog(null, "Please match your PIN ,Email,Moblie Number or Aadhar Number");
    }
        try{
            String query="";    
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_details","root","");
            Statement stmt=con.createStatement();
           query="insert into details values('"+st+"','"+s1+"','"+s2+"','"+s3+"','"+s6+"','"+s4+"','"+s5+"','"+s7+"','"+s9+"','"+s10+"','"+s11+"')";
                   stmt.executeUpdate(query);

        }
        catch(Exception ev)
        {
            System.out.println(ev);
        }


    }
        
    });

    
    jb1.addActionListener(new ActionListener()
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

    }
    public void paintComponent(Graphics g)
    {
        
        g.setColor(Color.ORANGE);
        g.fill3DRect(30,15, 500, 80, true);
        g.setColor(Color.LIGHT_GRAY);
        g.fill3DRect(30,150, 500, 450, true);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(5, 120, 560, 2);
    }

    public static void main(String[]args) 
    {
        JFrame f=new JFrame();
        f.add(new create_Account());
        f.setSize(600,1000);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
