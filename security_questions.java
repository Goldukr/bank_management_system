import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
public class security_questions extends JComponent {
    public security_questions()
    {
        JLabel jl1=new JLabel("Please select the Security Question");
        jl1.setBounds(20,100,500,30);
        jl1.setForeground(Color.BLUE);
        jl1.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,22));

        String[] optionToChoose={"What is your first school Name","What is your D.O.B","What is your Birth Place","What is your First pet","What is your favorite Colour"};
        JComboBox<String> jComboBox=new JComboBox<>(optionToChoose);
        jComboBox.setBounds(50,200,350,25);
        jComboBox.setFont(new java.awt.Font ("Verdana",java.awt.Font.PLAIN,20));

        JTextField jt1=new JTextField();
        jt1.setBounds(100,260,250,30);
        jt1.setForeground(Color.BLACK);

        JButton jb1=new JButton("Continue");
        jb1.setBounds(280,400,200,40);
        jb1.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,25));
        jb1.setForeground(Color.WHITE);
        jb1.setBackground(Color.BLUE);

        add(jl1);
        add(jt1);
        add(jb1);
        add(jComboBox);

        jb1.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {String s1=jt1.getText();
            if(s1.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please fill the security option");
            }
            else{
            JFrame jf=new JFrame();
            jf.add(new create_acount1());
            jf.setSize(600,1000);
            jf.setVisible(true);
            jf.setResizable(false);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JOptionPane.showMessageDialog(null, "Thanks for your answer");
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

        g.setColor(Color.YELLOW);
        g.fill3DRect(0,150, 600, 5, true);

    }
    public static void main(String[]args) throws IOException
    {
        
        JFrame f=new JFrame();
        f.add(new security_questions());
        f.setSize(500,500);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
