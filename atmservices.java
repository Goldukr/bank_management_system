import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//deposit, cash withdraw,pin change,mobilr reacharge,transfer,cacel
public class atmservices extends JComponent{
    public atmservices()
    {
        
         JLabel jl3=new JLabel("Mobile Number ");
    jl3.setBounds(200,80,500,30);
    jl3.setForeground(Color.yellow);
    jl3.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,25));
        
    
    
    JTextField jt1=new JTextField();
        jt1.setBounds(200,120,150,30);
        jt1.setForeground(Color.BLACK);
    
        JButton jb9=new JButton("Enter");
        jb9.setBounds(350,120,100,30);
        jb9.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,15));
        jb9.setForeground(Color.MAGENTA);
        jb9.setBackground(Color.BLACK);
        
        
    JButton jb1=new JButton("Balance Enquiry");
    jb1.setBounds(0,200,250,50);
    jb1.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,25));
    jb1.setForeground(Color.getHSBColor(255, 80, 95));
    jb1.setBackground(Color.DARK_GRAY);
    
    JButton jb2=new JButton("Cash Withdraw");
    jb2.setBounds(330,200,250,50);
    jb2.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,25));
    jb2.setForeground(Color.getHSBColor(255, 80, 95));
    jb2.setBackground(Color.DARK_GRAY);

    JButton jb3=new JButton("PIN Change");
    jb3.setBounds(0,300,250,50);
    jb3.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,25));
    jb3.setForeground(Color.getHSBColor(255, 80, 95));
    jb3.setBackground(Color.DARK_GRAY);

    JButton jb4=new JButton("Mobile Recharge");
    jb4.setBounds(330,300,250,50);
    jb4.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,25));
    jb4.setForeground(Color.getHSBColor(255, 80, 95));
    jb4.setBackground(Color.DARK_GRAY);


    JButton jb6=new JButton("Cash Deposit");
    jb6.setBounds(330,400,250,50);
    jb6.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,25));
    jb6.setForeground(Color.getHSBColor(255, 80, 95));
    jb6.setBackground(Color.DARK_GRAY);

    JButton jb7=new JButton("Back");
    jb7.setBounds(0,400,250,50);
    jb7.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,20));
    jb7.setForeground(Color.getHSBColor(255, 80, 95));
    jb7.setBackground(Color.BLUE);

    JButton jb8=new JButton("Cancel");
    jb8.setBounds(200,500,250,50);
    jb8.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,20));
    jb8.setForeground(Color.getHSBColor(255, 80, 95));
    jb8.setBackground(Color.BLUE);

    add(jb1);
    
    add(jb2);
    add(jb3);
    add(jb4);
    
    add(jb6);
    add(jb7);
    add(jb8);
    add(jl3);
    add(jt1);
    add(jb9);

    jb1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
               
                 Function f = new Function();
            ResultSet rs = null;    
             rs = f.find(jt1.getText());
            String s="";
            String s1=jt1.getText();
            
             if(s1.equals(""))
            {
            JOptionPane.showMessageDialog(null, "Please enter the mobile number to see the balance ");
            }
            try{
                
      if(rs.next()){
          s=rs.getString("balance");
          JOptionPane.showMessageDialog(null, "your balance is  "+s);
      }
      }
    catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        });

        jb2.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            JFrame jf=new JFrame();
            jf.add(new cashwithdraw());
            jf.setSize(600,1000);
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
            jf.add(new homepage());
            jf.setSize(600,1000);
            jf.setVisible(true);
            jf.setResizable(false);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    });

    jb8.addActionListener(new ActionListener()
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

    jb4.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            JFrame jf=new JFrame();
            jf.add(new mobile_recharge());
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
            jf.add(new pin_change());
            jf.setSize(600,1000);
            jf.setVisible(true);
            jf.setResizable(false);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    });

    jb6.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            JFrame jf=new JFrame();
            jf.add(new cash_deposit());
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

        g.setColor(Color.GRAY);
        g.fill3DRect(0,80, 600, 400, true);

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
        f.add(new atmservices());
        f.setSize(600,650);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
