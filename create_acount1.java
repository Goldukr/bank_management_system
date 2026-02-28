import java.awt.event.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.*;
public class create_acount1 extends JComponent {
    create_acount1()
    {
        JLabel jl1=new JLabel("Where can we reach you?");
        jl1.setBounds(50,20,500,30);
        jl1.setForeground(Color.BLUE);
        jl1.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,25));

        JLabel jl2=new JLabel("Please give us your Current address");
        jl2.setBounds(50,50,600,30);
        jl2.setForeground(Color.RED);
        jl2.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,20));

        JLabel jl3=new JLabel("House no./Apartment*");
        jl3.setBounds(10,120,600,30);
        jl3.setForeground(Color.DARK_GRAY);
        jl3.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,15));

        JTextField jt1=new JTextField();
        jt1.setBounds(250,120,250,30);
        jt1.setForeground(Color.BLACK);

        JLabel jl4=new JLabel("Locality/Street Name*");
        jl4.setBounds(10,170,600,30);
        jl4.setForeground(Color.DARK_GRAY);
        jl4.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,15));

        JTextField jt2=new JTextField();
        jt2.setBounds(250,170,250,30);
        jt2.setForeground(Color.BLACK);

        JLabel jl5=new JLabel("Area/Landmark*");
        jl5.setBounds(10,220,600,30);
        jl5.setForeground(Color.DARK_GRAY);
        jl5.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,15));

        JTextField jt3=new JTextField();
        jt3.setBounds(250,220,250,30);
        jt3.setForeground(Color.BLACK);

        JLabel jl6=new JLabel("city*");
        jl6.setBounds(10,270,600,30);
        jl6.setForeground(Color.DARK_GRAY);
        jl6.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,15));

        JTextField jt4=new JTextField();
        jt4.setBounds(250,270,250,30);
        jt4.setForeground(Color.BLACK);

        JLabel jl7=new JLabel("PinCode*");
        jl7.setBounds(10,320,600,30);
        jl7.setForeground(Color.DARK_GRAY);
        jl7.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,15));

        JTextField jt5=new JTextField();
        jt5.setBounds(250,320,250,30);
        jt5.setForeground(Color.BLACK);

        JLabel jl8=new JLabel("State*");
        jl8.setBounds(10,370,150,30);
        jl8.setForeground(Color.DARK_GRAY);
        jl8.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,15));

        String[] optionToChoose1={"Andhra Pradesh","Andaman and Nicobar Islands","Arunachal Pradesh","Assam","Bihar","Chhattisgarh",
        "Dadra & Nagar Haveli and Daman & Diu","Delhi","Goa","Gujarat","Haryana","Himachal Pradesh","Jammu and Kashmir",	
        "Jharkhand","Karnataka","Kerala","Ladakh","Lakshadweep","Madhya Pradesh","Maharashtra","Manipur","Meghalaya",	
        "Mizoram","Nagaland","Odisha","Puducherry","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana",
        "Tripura","Uttar Pradesh","Uttarakhand","West Bengal"};
        JComboBox<String> jComboBox=new JComboBox<>(optionToChoose1);
        jComboBox.setBounds(250,370,180,25);
        jComboBox.setFont(new java.awt.Font ("Arial",java.awt.Font.PLAIN,10));

        JLabel jl9=new JLabel("Mobile Number*");
        jl9.setBounds(10,420,150,30);
        jl9.setForeground(Color.DARK_GRAY);
        jl9.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,15));

        JTextField jt6=new JTextField();
        jt6.setBounds(250,420,250,30);
        jt6.setForeground(Color.BLACK);


        JCheckBox jBox=new JCheckBox();
        jBox.setBounds(10,525,20,20);

        JLabel jl10=new JLabel("I agree to the ");
        jl10.setBounds(40,520,150,30);
        jl10.setForeground(Color.BLACK);
        jl10.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,10));

        JButton jb1=new JButton("Terms & Conditions ");
        jb1.setBounds(60,520,250,30);
        jb1.setForeground(Color.BLUE);
        jb1.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,11));
        jb1.setOpaque(false);
         jb1.setContentAreaFilled(false);
         jb1.setBorderPainted(false);

        JLabel jl12=new JLabel("and authorize Kotak Bank to Contact me. ");
        jl12.setBounds(255,520,500,30);
        jl12.setForeground(Color.BLACK);
        jl12.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,10));

        JLabel jl13=new JLabel("This is override the registry with DNC/NDNC");
        jl13.setBounds(10,540,500,30);
        jl13.setForeground(Color.BLACK);
        jl13.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,10));

        JLabel jl14=new JLabel("If you wish to apply with aadhar eKYC , make sure your full name and mobile number ");
        jl14.setBounds(10,565,1000,30);
        jl14.setForeground(Color.BLUE);
        jl14.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,10));

        JLabel jl15=new JLabel("as same as per Aadhar Card");
        jl15.setBounds(40,580,1000,30);
        jl15.setForeground(Color.BLUE);
        jl15.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,10));

        JButton jb=new JButton("CLICK HERE TO COMPLETE THE APPLICATION");
        jb.setBounds(90,620,400,50);
        jb.setFont(new java.awt.Font ("Arial",java.awt.Font.BOLD,15));
        jb.setForeground(Color.WHITE);
        jb.setBackground(Color.BLUE);    
        add(jl1);
        add(jl2);
        add(jl3);
        add(jt1);
        add(jl4);
        add(jt2);
        add(jl5);
        add(jt3);
        add(jl6);
        add(jt4);
        add(jl7);
        add(jl8);
        add(jt5);
        add(jComboBox);
        add(jl9);
        add(jt6);
        add(jl10);
        add(jb1);
        add(jl12);
        add(jBox);
        add(jl13);
        add(jl14);
        add(jl15);
        add(jb);
        jb.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String s1=jt1.getText();
                String s2=jt2.getText();
                String s3=jt3.getText();
                String s4=jt4.getText();
                String s5=jt5.getText();
                String s6=""+jComboBox.getItemAt(jComboBox.getSelectedIndex());
                String s7=jt6.getText();
                
                if(s1.equals("")&&s2.equals("")&&s3.equals("")&& s4.equals("")&&s5.equals("")&&s6.equals("")&&s7.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Please fill the details");
                    
                }
                else if (s1.length()>=1&&s2.length()>=1&& s3.length()>=1 && s4.length()>=1 && s5.length()>=1 && s6.length()>=1 && s7.length()>=1){
                JFrame jf=new JFrame();
                jf.add(new bank_management());
                jf.setSize(600,1000);
                jf.setVisible(true);
                jf.setResizable(false);
                jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JOptionPane.showMessageDialog(null, "you account created sucessfully");
                
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"please fill the details first");
                }
            
            try{
            String query="";    
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_details","root","");
            Statement stmt=con.createStatement();
           query="insert into details1 values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"')";
                   stmt.executeUpdate(query);
        }
        catch(Exception ev)
        {
            System.out.println(ev);
        }
        }
        });
          jb.setEnabled(false);
            
             jBox.addActionListener(new ActionListener()
             {
                public void actionPerformed(ActionEvent e)
                 {
                 if(jBox.isSelected())
                 {
                     jb.setEnabled(true);
                 }
                 else if(!jBox.isSelected())
                 {
                 jb.setEnabled(false);
                 }
                 
         }
         });
             
                jb1.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            JFrame jf=new JFrame();
            jf.add(new term());
            jf.setSize(600,1000);
            jf.setVisible(true);
            jf.setResizable(false);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            
    }
    });
             
    }

        public void paintComponent(Graphics g){
            g.setColor(Color.DARK_GRAY);
        g.fillRect(5, 100, 560, 2);
        }
    

public static void main(String[]args)
{
    JFrame f=new JFrame();
        f.add(new create_acount1());
        f.setSize(600,1000);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
}
}