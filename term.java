
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JScrollPane;
public class term extends JComponent{
    term()
    {
     
    JLabel jl=new JLabel("<html>His document lays out the Terms and Conditions which shall be applicable to all the accounts which are existing or may be opened anytime in future with Kotak Bank. The words, I, me, my and Customer refer to the person(s) who open the account and shall include both singular and plural. Reference to masculine shall include the feminine and neuter gender. The Bank refers to Kotak Bank Ltd., a banking company incorporated in India under the Companies Act 1956 and having its registered office at Kotak Bank House, Senapati Bapat Marg, Lower Parel, Mumbai-400013.</html>");
    jl.setBounds(8,0,450,500);
    jl.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,20));
    jl.setForeground(Color.BLACK);
    
    JButton jb=new JButton("Continue");
    jb.setBounds(320,410,150,40);
    jb.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,20));
    jb.setForeground(Color.BLACK);
    jb.setBackground(Color.BLUE);
    
    add(jl);
    add(jb);
    
    jb.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            
            JFrame jf=new JFrame();
            jf.add(new create_acount1());
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
    }
    public static void main(String[]args)
    {
    JFrame f=new JFrame();
        f.add(new term());
        f.setSize(500,500);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}