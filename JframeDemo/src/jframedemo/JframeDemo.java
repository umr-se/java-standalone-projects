package jframedemo;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class JframeDemo {
public static void main(String[] args ){
    
    //// open popup window
    JFrame f= new JFrame("Login");
    f.setVisible(true);
    f.setBounds(100, 100, 600, 500);
    f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
   /// container where all j fields shown
    Container c = f.getContentPane();
    c.setLayout(null);
    
    JLabel l = new JLabel("Username");
    l.setBounds(50,50,100,30);
    
     JTextField t1 = new JTextField();
    t1.setBounds(150,50,150,30);
    
    
    
    /// radio button
    JRadioButton r1 = new JRadioButton("Male");
    r1.setBounds(50,200,100,100);
    JRadioButton r2 = new JRadioButton("Female");
    r2.setBounds(160,200,100,100);
    ButtonGroup gender= new ButtonGroup();
    gender.add(r1);
    gender.add(r2);
    
    /// check box
    
    JCheckBox ck1 = new JCheckBox("Student");
    JCheckBox ck2 = new JCheckBox("Teacher");
     ck1.setBounds(50,300,100,50);
     ck2.setBounds(160,300,100,50);
     ButtonGroup check= new ButtonGroup();
     check.add(ck1);
     check.add(ck2);
    
    //// for text area
    
      JTextArea t3 = new JTextArea();
    t3.setBounds(50,360,140,200);
   t3.setLineWrap(true);
   
   
   /// drop down combo box
   
   String[] age= {"18","19","20","21","22"};
   JComboBox jb= new JComboBox(age);
    jb.setBounds(50,570,80,20);
   
   JLabel l2 = new JLabel("Password");
    l2.setBounds(50,100,100,30);
    
     JPasswordField t2 = new JPasswordField();
    t2.setBounds(150,100,150,30);
    t2.setEchoChar('*');
    
   // button text
    
    JButton btn1= new JButton("Red");
    JButton btn2= new JButton("Blue");
    JButton btn3= new JButton("Green");
    
    ////set lengths of button
    
btn1.setBounds(100, 150,100, 20);
btn2.setBounds(210, 150,100, 20);
btn3.setBounds(320, 150,100, 20);

////add action on button click

btn1.addActionListener(new ActionListener(){
 @Override
        public void actionPerformed(ActionEvent e) {
             c.setBackground(Color.red);
           
        }
});
btn2.addActionListener(new ActionListener(){
 @Override
        public void actionPerformed(ActionEvent e) {
             c.setBackground(Color.blue);
           
        }
});


btn3.addActionListener(new ActionListener(){
 @Override
        public void actionPerformed(ActionEvent e) {
             c.setBackground(Color.green);
           
        }
});


//Add items in container or frame
c.add(t1);
c.add(l);
c.add(t2);
c.add(l2);
c.add(btn1);
c.add(btn2);
c.add(btn3);
c.add(r1);
c.add(r2);
c.add(ck1);
c.add(ck2);
c.add(t3);
c.add(jb);

  }
}

