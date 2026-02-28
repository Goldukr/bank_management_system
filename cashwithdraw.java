import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class cashwithdraw extends JComponent {

    public cashwithdraw() {
        JLabel jl1 = new JLabel("Withdraw you cash here!");
        jl1.setBounds(35, 100, 500, 30);
        jl1.setForeground(Color.BLUE);
        jl1.setFont(new java.awt.Font("Verdana", java.awt.Font.BOLD, 25));

        JLabel jl3 = new JLabel("Mobile Number ");
        jl3.setBounds(200, 150, 500, 30);
        jl3.setForeground(Color.yellow);
        jl3.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 25));

        JTextField jt2 = new JTextField();
        jt2.setBounds(200, 200, 150, 30);
        jt2.setForeground(Color.BLACK);


        JLabel jl2 = new JLabel("Enter Withdraw Amount");
        jl2.setBounds(20, 300, 500, 30);
        jl2.setForeground(Color.DARK_GRAY);
        jl2.setFont(new java.awt.Font("Verdana", java.awt.Font.BOLD, 20));

        JTextField jt1 = new JTextField();
        jt1.setBounds(300, 300, 150, 30);
        jt1.setForeground(Color.BLACK);

        JButton jb1 = new JButton("WITHDRAW");
        jb1.setBounds(200, 350, 150, 30);
        jb1.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 15));
        jb1.setForeground(Color.WHITE);
        jb1.setBackground(Color.BLUE);

        JButton jb3 = new JButton("BACK");
        jb3.setBounds(100, 400, 100, 30);
        jb3.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 15));
        jb3.setForeground(Color.WHITE);
        jb3.setBackground(Color.BLUE);

        add(jl1);
        add(jl2);
        add(jl3);
        add(jt2);
        add(jt1);
        add(jb1);
        add(jb3);
        //add(jb9);

        jb3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame jf = new JFrame();
                jf.add(new atmservices());
                jf.setSize(600, 1000);
                jf.setVisible(true);
                jf.setResizable(false);
                jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }
        });

        jb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s1 = jt1.getText();
                String s2=jt2.getText();
                String sr="";
                if (s1.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the amount to Withdraw");
                }
               else if(s2.equals(""))
                {
                JOptionPane.showMessageDialog(null, "Please enter the Mobile number to Withdraw");
                }
                else  {
                    JFrame jf = new JFrame();
                    jf.add(new atmservices());
                    jf.setSize(600, 1000);
                    jf.setVisible(true);
                    jf.setResizable(false);
                    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    JOptionPane.showMessageDialog(null, "The Amount is withdraw from your account");
                     Function f = new Function();

                }
            }
        });

    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);
        g.fill3DRect(0, 5, 600, 80, true);

        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("D:\\Java prog\\aaa\\src\\aaa\\3.png");
        g.drawImage(i, 150, 0, this);

        g.setColor(Color.MAGENTA);
        g.fill3DRect(0, 81, 600, 5, true);
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
    
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.add(new cashwithdraw());
        f.setSize(500, 500);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
