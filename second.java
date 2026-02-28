import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
public class second extends JComponent{
    public second(String msg)
    {
        JLabel jl1=new JLabel();
        jl1.setBounds(50,100,500,30);
        jl1.setForeground(Color.BLUE);
        jl1.setFont(new java.awt.Font ("Verdana",java.awt.Font.BOLD,25));

        jl1.setText(msg);
    }
    public static void main(String[]args)
    {
        String st="";
        JFrame f=new JFrame();
        f.add(new second(st));
         f.setSize(500,500);
        f.setVisible(true);
        f.setResizable(false);
    }

   
}

