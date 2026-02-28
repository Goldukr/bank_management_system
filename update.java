import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.IOException;
//deposit, cash withdraw,pin change,mobilr reacharge,transfer,cacel
public class update extends JComponent{
    public update()
    {
    JButton jb1=new JButton("Email");
    jb1.setBounds(100,150,250,50);
    jb1.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,25));
    jb1.setForeground(Color.getHSBColor(255, 80, 95));
    jb1.setBackground(Color.DARK_GRAY);

    JButton jb2=new JButton("Mobile");
    jb2.setBounds(100,300,250,50);
    jb2.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,25));
    jb2.setForeground(Color.getHSBColor(255, 80, 95));
    jb2.setBackground(Color.DARK_GRAY);

    JButton jb3=new JButton("BACK");
        jb3.setBounds(100,400,100,30);
        jb3.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,15));
        jb3.setForeground(Color.WHITE);
        jb3.setBackground(Color.BLUE);

    add(jb1);
    add(jb2);
    add(jb3);
    jb1.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            JFrame jf=new JFrame();
            jf.add(new email());
            jf.setSize(500,500);
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
                jf.add(new mobile());
                jf.setSize(500,500);
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
                jf.add(new account_details());
                jf.setSize(500,500);
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
        f.add(new update());
        f.setSize(500,500);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

}
