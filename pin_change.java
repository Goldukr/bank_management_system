
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class pin_change extends JComponent{
    public pin_change(){
        JLabel jl1=new JLabel("You can change your PIN here!");
        jl1.setBounds(35,100,500,30);
        jl1.setForeground(Color.BLUE);
        jl1.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,25));

         JLabel jl4 = new JLabel("Mobile Number ");
        jl4.setBounds(200, 150, 500, 30);
        jl4.setForeground(Color.yellow);
        jl4.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 25));

        JTextField jt3 = new JTextField();
        jt3.setBounds(200, 200, 150, 30);
        jt3.setForeground(Color.BLACK);
        
        JLabel jl2=new JLabel("Enter Old PIN");
        jl2.setBounds(50,250,500,30);
        jl2.setForeground(Color.DARK_GRAY);
        jl2.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,20));

        JTextField jt1=new JTextField();
        jt1.setBounds(250,250,150,30);
        jt1.setForeground(Color.BLACK);

        JLabel jl3=new JLabel("Enter New PIN");
        jl3.setBounds(50,300,500,30);
        jl3.setForeground(Color.DARK_GRAY);
        jl3.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,20));

        JTextField jt2=new JTextField();
        jt2.setBounds(250,300,150,30);
        jt2.setForeground(Color.BLACK);

        JButton jb1=new JButton("UPDATE");
        jb1.setBounds(250,400,100,30);
        jb1.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,15));
        jb1.setForeground(Color.WHITE);
        jb1.setBackground(Color.BLUE);

        JButton jb3=new JButton("BACK");
        jb3.setBounds(100,400,100,30);
        jb3.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,15));
        jb3.setForeground(Color.WHITE);
        jb3.setBackground(Color.BLUE);
        add(jl1);
        add(jl2);
        add(jt1);
        add(jl3);
        add(jt2);
        add(jb1);
        add(jb3);
        add(jl4);
        add(jt3);
    
        jb1.addActionListener(new ActionListener()
    {
        @Override
      public void actionPerformed(ActionEvent e) { 
        
        Function f;
            f = new Function();
            ResultSet rs = null;    
             rs = f.find(jt1.getText());
      
           String s3=jt3.getText();
            String s1=jt1.getText();
            String s2=jt2.getText();
            String s="";
           
            
            if(s3.equals(""))
            {
            JOptionPane.showMessageDialog(null, "Please enter the mobile number ");
            }
            if(s1.equals(""))
            {
            JOptionPane.showMessageDialog(null, "Please enter OLD Pin ");
            }
            if(s2.equals(""))
            {
            JOptionPane.showMessageDialog(null, "Please enter new Pin ");
            }
//            else
//            {
//                JFrame jf=new JFrame();
//            jf.add(new atmservices());
//            jf.setSize(600,1000);
//            jf.setVisible(true);
//            jf.setResizable(false);
//            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
    try{
         if(rs.next()){
          
              s=rs.getString("Password");
              
      }
         if(s.equals(s1))
         {
          JFrame jf=new JFrame();
            jf.add(new atmservices());
            jf.setSize(600,1000);
            jf.setVisible(true);
            jf.setResizable(false);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         }
         
         theQuery("update details set Password = '"+jt1.getText()+"' where Mobile_no = "+jt3.getText());
    }
      
    catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex.getMessage());
            }   
            
    }
    });
        
        
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
    
//     public class Function2{
//       Connection con = null;
//       ResultSet rs1 = null;
//       PreparedStatement ps = null;
//       public ResultSet find1(String t){
//           try{
//           con = DriverManager.getConnection("jdbc:mysql://localhost/bank_details","root","");
//           ps = con.prepareStatement("select * from details where  Password=?");
//           
//           ps.setString(1,t);
//           rs1 = ps.executeQuery();
//           }catch(Exception ex){
//              JOptionPane.showMessageDialog(null, ex.getMessage());
//           }
//           return rs1;
//       }
//   }
    
    
     public void theQuery(String query){
      Connection con = null;
      Statement st = null;
      try{
          con = DriverManager.getConnection("jdbc:mysql://localhost/bank_details","root","");
          st = con.createStatement();
          st.executeUpdate(query);
          JOptionPane.showMessageDialog(null,"the pin has been changed");
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,ex.getMessage());
      }
  }
    
    public static void main(String[]args)
{
    JFrame f=new JFrame();
        f.add(new pin_change());
        f.setSize(500,500);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
    
}
