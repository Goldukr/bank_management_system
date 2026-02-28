import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class create_pin extends JComponent {
   public create_pin(){
    
    JLabel jl1=new JLabel("Please Generate your PIN");
    jl1.setBounds(30,-140,600,500);
    jl1.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,25));
    jl1.setForeground(Color.blue);

    JLabel jl2=new JLabel("Enter PIN");
    jl2.setBounds(30,-80,600,500);
    jl2.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,20));

    JPasswordField jp1=new JPasswordField();
    jp1.setBounds(165,155,150,30);
    jp1.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,20));

    JLabel jl3=new JLabel("RE-Enter PIN");
    jl3.setBounds(30,-30,600,500);
    jl3.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,20));

    JPasswordField jp2=new JPasswordField();
    jp2.setBounds(165,200,150,30);
    jp2.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,20));

    JButton jb=new JButton("Continue");
    jb.setBounds(150,300,100,30);
    jb.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,15));
    jb.setForeground(Color.WHITE);
    jb.setBackground(Color.BLUE);
    jb.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String s1,s2;
                s1=jp1.getText();
                s2=jp2.getText();
                
                if(s1.equals("")&&s2.equals(""))
        {
 JOptionPane.showMessageDialog(null, "Please enter the pin");
        }
        // int a,b;
        // a=Integer.parseInt(jp1.getText());
        // b=Integer.parseInt(jp2.getText());
        // System.out.println(a);
        // System.out.println(b);
                
                           
        
              else if(s1.equals(s2))
                {
                JFrame jf=new JFrame();
                jf.add(new security_questions());
                jf.setSize(500,500);
                jf.setVisible(true);
                jf.setResizable(false);
                jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JOptionPane.showMessageDialog(null, "your PIN is Generated");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please match your pin");
        } 
                
//                 try{
//            String query="";    
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_details","root","");
//            Statement stmt=con.createStatement();
//           query="insert into details2 values('"+s1+"')";
//                   stmt.executeUpdate(query);
//        }
//        catch(Exception ev)
//        {
//            System.out.println(ev);
//        }
    }
        });


    add(jl1);
    add(jl2);
    add(jp1);
    add(jl3);
    add(jp2);
    add(jb);
    }
    public void paintComponent(Graphics g){
        g.setColor(Color.BLACK);
        g.fill3DRect(0,5, 600, 80, true);

        Toolkit t=Toolkit.getDefaultToolkit();
        Image i=t.getImage("D:\\Java prog\\aaa\\src\\aaa\\3.png");
        g.drawImage(i, 0, 0, this);
    }
    public static void main(String[]args)
    {
        JFrame f=new JFrame();
        f.add(new create_pin());
        f.setSize(400,400);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
