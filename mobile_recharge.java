import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.IOException;
public class mobile_recharge extends JComponent {
    public mobile_recharge()
    {
        JLabel jl1=new JLabel("Recharge your phone here!");
        jl1.setBounds(50,100,500,30);
        jl1.setForeground(Color.BLUE);
        jl1.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,25));
        
         JLabel jl5 = new JLabel("Enter your Mobile Number ");
        jl5.setBounds(150, 150, 500, 30);
        jl5.setForeground(Color.yellow);
        jl5.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 25));

        JTextField jt3 = new JTextField();
        jt3.setBounds(250, 200, 150, 30);
        jt3.setForeground(Color.BLACK);

        JLabel jl2=new JLabel("Mobile no.");
        jl2.setBounds(50,250,500,30);
        jl2.setForeground(Color.red);
        jl2.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,20));

        JTextField jt1=new JTextField();
        jt1.setBounds(200,250,150,30);
        jt1.setForeground(Color.BLACK);

        JLabel jl3=new JLabel("Operator");
        jl3.setBounds(50,300,500,30);
        jl3.setForeground(Color.red);
        jl3.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,20));

        String[] optionToChoose={"Airtel","Jio","BSNL","Vi"};
        JComboBox<String> jComboBox=new JComboBox<>(optionToChoose);
        jComboBox.setBounds(200,300,140,25);
        jComboBox.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,10));

        JLabel jl4=new JLabel("Amount");
        jl4.setBounds(50,350,500,30);
        jl4.setForeground(Color.red);
        jl4.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,20));

        JTextField jt2=new JTextField();
        jt2.setBounds(200,350,150,30);
        jt2.setForeground(Color.BLACK);

        JButton jb1=new JButton("PAY");
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
        add(jl5);
        add(jt3);
        add(jl2);
        add(jt1);
        add(jl3);
        add(jl4);
        add(jt2);
        add(jb1);
        add(jb3);
        add(jComboBox);

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
                String s2=jt1.getText();

                if((s1.equals(""))&&s2.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Please fill the details");
                }
                else{       
                JFrame jf=new JFrame();
                jf.add(new atmservices());
                jf.setSize(600,1000);
                jf.setVisible(true);
                jf.setResizable(false);
                jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JOptionPane.showMessageDialog(null, "your Recharge is Successful");    
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
        f.add(new mobile_recharge());
        f.setSize(500,500);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
