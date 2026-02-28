import javax.lang.model.util.ElementScanner6;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class mobile extends JComponent{
    public mobile()
    {
        JLabel jl1=new JLabel("Enter your new Mobile number");
        jl1.setBounds(35,100,500,30);
        jl1.setForeground(Color.BLUE);
        jl1.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,25));

        JTextField jt1=new JTextField();
        jt1.setBounds(10,180,250,30);
        jt1.setForeground(Color.BLACK);

        JButton jb1=new JButton("save");
        jb1.setBounds(200,350,100,30);
        jb1.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,15));
        jb1.setForeground(Color.WHITE);
        jb1.setBackground(Color.BLUE);

        JButton jb2=new JButton("cancel");
        jb2.setBounds(30,350,100,30);
        jb2.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,15));
        jb2.setForeground(Color.WHITE);
        jb2.setBackground(Color.BLUE);


        add(jl1);
        add(jt1);
        add(jb1);
        add(jb2);

        jb1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String s1=jt1.getText();
                if(s1.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Please enter your Mobile number");
                }
                else if(s1.equals("0")||s1.equals("1")||s1.equals("2")||s1.equals("3")||s1.equals("4")||s1.equals("5"))
                {
                JFrame jf=new JFrame();
                jf.add(new update());
                jf.setSize(600,1000);
                jf.setVisible(true);
                jf.setResizable(false);
                jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JOptionPane.showMessageDialog(null, "your Mobile Number is update");
        }
        else{
            JOptionPane.showMessageDialog(null, "please enter the valid Mobile Numbet");
        }
    }
        });
        jb2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JFrame jf=new JFrame();
                jf.add(new update());
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
    public static void main(String[]args)
{
    JFrame f=new JFrame();
        f.add(new mobile());
        f.setSize(500,500);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}