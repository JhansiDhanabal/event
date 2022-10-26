package gui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class scroll implements AdjustmentListener{
    JFrame f;
    JTextField t1,t2,t3;
    JScrollBar s1,s2,s3;
    scroll()
    {
        f=new JFrame();
        s1=new JScrollBar(JScrollBar.VERTICAL, 128, 0, 0, 255);
        s1.setBounds(50, 50, 20, 60);
        t1=new JTextField();
        t1.setBounds(50, 120, 30, 20);
        s2=new JScrollBar(JScrollBar.VERTICAL, 128, 0, 0, 255);
        s2.setBounds(100, 50, 20, 60);
        t2=new JTextField();
        t2.setBounds(100, 120, 30, 20);
        s3=new JScrollBar(JScrollBar.VERTICAL, 128, 0, 0, 255);
        s3.setBounds(150, 50, 20, 60);
        t3=new JTextField();
        t3.setBounds(150, 120, 30, 20);
        s1.addAdjustmentListener(this);
        s2.addAdjustmentListener(this);
        s3.addAdjustmentListener(this);
        f.add(s1);
        f.add(s2);
        f.add(s3);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.setLayout(null);
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new scroll();
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        int red=s1.getValue();
        int green=s2.getValue();
        int blue=s3.getValue();
        t1.setText(String.valueOf(red));
        t2.setText(String.valueOf(green));
        t3.setText(String.valueOf(blue));
        f.getContentPane().setBackground(new Color(red,green,blue));
    }  
}
