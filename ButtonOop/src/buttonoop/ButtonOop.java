package buttonoop;
import javax.swing.*;
public class ButtonOop {
    public static void main(String[] args) {
    JFrame Text = new JFrame("Button");
    JButton b = new JButton("Click Here ");
    b.setBounds(50, 50, 100, 50);
    Text.add(b);
    Text.setSize(400, 400);
    Text.setLayout(null);
    Text.setVisible(true);
    }  
}
