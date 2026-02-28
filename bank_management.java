import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.IOException;

 
public class bank_management extends JComponent{
    // JButton jb;
    public bank_management()
    {
           JLabel jl1=new JLabel("Hi there!");
           jl1.setBounds(30,60,100,100);
           jl1.setFont(new Font ("Verdana",Font.BOLD,20));
        jl1.setForeground(Color.BLUE);

        JLabel jl2=new JLabel("Smart move to pick this app.");
        jl2.setBounds(30,80,500,100);
        jl2.setFont(new Font ("Verdana",Font.PLAIN,18));
        jl2.setForeground(Color.MAGENTA);

        JLabel jl3=new JLabel("New to Kotak?");
        jl3.setBounds(60,250,250,30);
        jl3.setFont(new Font ("Verdana",Font.BOLD,19));
        jl3.setForeground(Color.BLUE);

        JLabel jl4=new JLabel("Get 811 activated in an instant");
        jl4.setBounds(60,280,500,30);
        jl4.setFont(new Font ("Verdana",Font.BOLD,18));
        jl4.setForeground(Color.WHITE);

       
       JButton jb=new JButton("Get Started Now");
        jb.setBounds(150,320,300,50);
        jb.setFont(new Font ("Verdana",Font.BOLD,15));
        jb.setForeground(Color.WHITE);
        jb.setBackground(Color.RED);

        JLabel jl5=new JLabel("Already have a Kotak Account?");
        jl5.setBounds(60,580,500,30);
        jl5.setFont(new Font ("Verdana",Font.BOLD,18));
        jl5.setForeground(Color.BLUE);

        JButton jb1=new JButton("Click Here to Log in");
        jb1.setBounds(150,630,300,40);
        jb1.setFont(new Font ("Verdana",Font.BOLD,15));
        jb1.setForeground(Color.WHITE);
        jb1.setBackground(Color.RED);

        add(jl1);
        add(jl2);
        add(jl3);
        add(jl4);
        add(jb);
        add(jl5);
        add(jb1);
        // jb.setEnabled(false);
        jb.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            
            JFrame jf=new JFrame();
            jf.add(new create_Account());
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
            JFrame jf=new JFrame();
            jf.add(new login());
            jf.setSize(500,500);
            jf.setVisible(true);
            jf.setResizable(false);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    });
        
       }
    public void paintComponent(Graphics g)
        {

            g.setColor(Color.RED);
            g.fill3DRect(0, 0, 600, 62, true);

            Toolkit t=Toolkit.getDefaultToolkit();
            Image i=t.getImage("D:\\Java prog\\aaa\\src\\aaa\\1.png");
            g.drawImage(i, 180, -30, this);

            g.setColor(Color.ORANGE);
            g.fillRect(30, 170, 520, 5);

            g.setColor(Color.DARK_GRAY);
            g.fillRect(30, 175, 520, 250);

            g.setColor(Color.YELLOW);
            g.fillRect(30, 475, 520, 5);

            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(30, 480, 520, 200);
        }    
    public static void main(String[]args) throws IOException
    {
        
        JFrame f=new JFrame();
        f.add(new bank_management());
        f.setSize(600,1000);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}