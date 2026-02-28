import aaa.fromnet;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class homepage extends JComponent {
public homepage()
{
    JLabel jl1=new JLabel("Welcome to 811");
    jl1.setBounds(10,100,500,30);
    jl1.setForeground(Color.BLUE);
    jl1.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,30));


    
    JLabel jl3=new JLabel("Mobile Number ");
    jl3.setBounds(200,140,500,30);
    jl3.setForeground(Color.yellow);
    jl3.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,25));
    
    JTextField jt1=new JTextField();
        jt1.setBounds(200,180,150,30);
        jt1.setForeground(Color.BLACK);
    
        JButton jb8=new JButton("enter");
        jb8.setBounds(350,180,100,30);
        jb8.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,15));
        jb8.setForeground(Color.MAGENTA);
        jb8.setBackground(Color.BLACK);


    JButton jb1=new JButton("<html>Account<br> Overview</html>");
    jb1.setBounds(30,350,100,50);
    jb1.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,15));
    jb1.setForeground(Color.MAGENTA);
    jb1.setBackground(Color.BLACK);

    JButton jb3=new JButton("<html>Bills<br> Pay</html>");
    jb3.setBounds(130,350,100,50);
    jb3.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,15));
    jb3.setForeground(Color.MAGENTA);
    jb3.setBackground(Color.BLACK);


    JButton jb4=new JButton("<html> Service<br> Request</html>");
    jb4.setBounds(230,350,100,50);
    jb4.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,15));
    jb4.setForeground(Color.MAGENTA);
    jb4.setBackground(Color.BLACK);

    JButton jb5=new JButton("<html> Atm<br> Servie</html>");
    jb5.setBounds(330,350,100,50);
    jb5.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,15));
    jb5.setForeground(Color.MAGENTA);
    jb5.setBackground(Color.BLACK);

    JButton jb6=new JButton("<html>Send<br> Money</html>");
    jb6.setBounds(430,350,100,50);
    jb6.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,15));
    jb6.setForeground(Color.MAGENTA);
    jb6.setBackground(Color.BLACK);

    JButton jb7=new JButton("Logout");
    jb7.setBounds(430,90,120,40);
    jb7.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,20));
    jb7.setForeground(Color.getHSBColor(255, 80, 95));
    jb7.setBackground(Color.RED);


    JButton jb2=new JButton("View Balance");
    jb2.setBounds(400,255,140,40);
    jb2.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,15));
    jb2.setForeground(Color.getHSBColor(255, 80, 95));
    jb2.setBackground(Color.DARK_GRAY);

    JLabel jl8=new JLabel("Coustumer Care: 1860 266 2666");
    jl8.setBounds(250,400,350,40);
    jl8.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,20));
    jl8.setForeground(Color.BLACK);
    
     JLabel jll=new JLabel("");
     jll.setBounds(150,250,350,40);
     jll.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,20));
     jll.setForeground(Color.BLACK);
     
      JLabel jlt=new JLabel("");
     jlt.setBounds(10,250,350,40);
     jlt.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,20));
     jlt.setForeground(Color.BLUE);
     
     JLabel jlb=new JLabel("");
     jlb.setBounds(110,280,350,40);
     jlb.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,15));
     jlb.setForeground(Color.YELLOW);
     
      JLabel jlb1=new JLabel("");
     jlb1.setBounds(10,280,350,40);
     jlb1.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,15));
     jlb1.setForeground(Color.BLUE);
    
     add(jl8);
     add(jlb);
     add(jlb1);
     add(jlt);
    add(jb1);
    add(jl3);
    add(jt1);
    add(jll);
    add(jl1);
    add(jb2);
    add(jb4);
    add(jb3);
    add(jb5);
    add(jb6);
    add(jb7);
    add(jb8);
    
    jb1.addActionListener(new ActionListener()
    {
        @Override
    public void actionPerformed(ActionEvent e) { 
        Function f = new Function();
            ResultSet rs = null;    
             rs = f.find(jt1.getText());
            String s="";
            String s1=jt1.getText();
            String na="";
            String ac="";
            String crd="";
            String atmpin="";
            
            if(s1.equals(""))
            {
            JOptionPane.showMessageDialog(null, "Please enter the mobile number");
            }
            else
            {
            
    try{
      if(rs.next()){
          na=rs.getString("Full_name");
          ac=rs.getString("Account_Number");
            JLabel jl2=new JLabel("Hello "+na);
        jl2.setBounds(350,150,500,30);
         jl2.setForeground(Color.BLUE);
       jl2.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,30));
       add(jl2);
              JOptionPane.showMessageDialog(null, "your Name is "+na+"\n your account  number is "+ac);
              JOptionPane.showMessageDialog(null, "your account  number is "+ac);
      }
      }
            
    catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex.getMessage());
            }
    
            }
    }
        
    });
    
    jb4.addActionListener(new ActionListener()
    {
        @Override
    public void actionPerformed(ActionEvent e) { 
        
        Function f = new Function();
            ResultSet rs = null;    
             rs = f.find(jt1.getText());
            String s="";
            String s1=jt1.getText();
            
            String crd="";
            String atmpin="";
            
            if(s1.equals(""))
            {
            JOptionPane.showMessageDialog(null, "Please enter the mobile number");
            }
            else
            {
                JFrame jf=new JFrame();
            jf.add(new cards_details());
            jf.setSize(600,1000);
            jf.setVisible(true);
            jf.setResizable(false);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
    try{
      if(rs.next()){
          crd=rs.getString("card");
          atmpin=rs.getString("Password");
              JOptionPane.showMessageDialog(null, " your card number is "+crd+"\n your ATM PIN is "+atmpin);

      }
      }
    catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            }
            
    }
        
    });

    
    jb6.addActionListener(new ActionListener()
    {
        @Override
    public void actionPerformed(ActionEvent e) { 
        
        Function f = new Function();
            ResultSet rs = null;    
             rs = f.find(jt1.getText());
            String s="";
            String s1=jt1.getText();
            
           
           String balance="";
            
            if(s1.equals(""))
            {
            JOptionPane.showMessageDialog(null, "Please enter the mobile number");
            }
            else
            {
                JFrame jf=new JFrame();
            jf.add(new transfer_amount());
            jf.setSize(600,1000);
            jf.setVisible(true);
            jf.setResizable(false);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
    try{
      if(rs.next()){
          
          balance=rs.getString("balance");
              JOptionPane.showMessageDialog(null, " your Account balance is "+balance);

      }
      }
    catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            }
            
    }
        
    });

    
    jb8.addActionListener(new ActionListener()
    {
        @Override
    public void actionPerformed(ActionEvent e) { 
        
        Function f = new Function();
            ResultSet rs = null;    
             rs = f.find(jt1.getText());
            String s="";
            String s1=jt1.getText();
            
           
           String AccountNumber="";
            
            if(s1.equals(""))
            {
            JOptionPane.showMessageDialog(null, "Please enter the mobile number");
            }
            else
            {
    try{
      if(rs.next()){
          
          AccountNumber=rs.getString("Account_Number");
             jll.setText(AccountNumber);
             jlt.setText("A/C NUMBER:-");
      }
      else
      {
          JOptionPane.showMessageDialog(null, "NO DATA FOR THIS Mobile number");
      }
      }
    catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            }
            
    }
        
    });

    jb2.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
             Function f = new Function();
            ResultSet rs = null;    
             rs = f.find(jt1.getText());
            String s="";
            String s1=jt1.getText();
            
           
           String balance="";
            
            if(s1.equals(""))
            {
            JOptionPane.showMessageDialog(null, "Please enter the mobile number");
            }
            else
            {
    try{
      if(rs.next()){
          
          balance=rs.getString("balance");
             jlb.setText(balance);
             jlb1.setText("A/C Balance:-");
      }
      else
      {
          JOptionPane.showMessageDialog(null, "NO DATA FOR THIS Mobile number");
      }
      }
    catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            }
            
    }
    });

    jb5.addActionListener(new ActionListener()
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

        jb3.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            JFrame jf=new JFrame();
            jf.add(new bills_pay());
            jf.setSize(500,500);
            jf.setVisible(true);
            jf.setResizable(false);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    });
    jb7.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            JFrame jf=new JFrame();
            jf.add(new login());
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

        g.setColor(Color.LIGHT_GRAY);
        g.fill3DRect(0,115, 600, 600, true);
            
        g.setColor(Color.RED);
        g.fill3DRect(0,220, 600, 120, true);
        
        g.setColor(Color.YELLOW);
        g.fill3DRect(240,400, 350, 50, true);
       
        
        g.setColor(Color.DARK_GRAY);
        g.fill3DRect(0,82, 600, 50, true);
        
        Toolkit t1=Toolkit.getDefaultToolkit();
        Image i1=t1.getImage("D:\\Java prog\\aaa\\src\\aaa\\5.jpg");
        g.drawImage(i1, 30, 450, this);
        
        Toolkit t2=Toolkit.getDefaultToolkit();
        Image i2=t2.getImage("D:\\Java prog\\aaa\\src\\aaa\\6.jpg");
        g.drawImage(i2, 300, 450, this);

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
    public static void main(String[]args)
    {
        JFrame f=new JFrame();
        f.add(new homepage());
        f.setSize(600,1000);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
    }

