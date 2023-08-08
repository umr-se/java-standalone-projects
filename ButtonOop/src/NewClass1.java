import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class NewClass1 extends JFrame implements ActionListener{
    JTextField tf1, tf2, tf3;
    JButton b1, b2, b3, b4;
    NewClass1() {
        tf1 = new JTextField();
        tf1.setBounds(50, 50, 150, 20);
        tf2 = new JTextField();
        tf2.setBounds(50, 100, 150, 20);
        tf3 = new JTextField();
        tf3.setBounds(50, 150, 150, 20);
        tf3.setEditable(false);
         b3 = new JButton("/");
          b3.setBounds(200, 200, 50, 50);
        b1 = new JButton("+");
        b1.setBounds(50, 200, 50, 50);
        b2 = new JButton("-");
        b2.setBounds(120, 200, 50, 50);
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(b3);
        add(tf1);
        add(tf2);
        add(tf3);
        add(b1);
        add(b2);
        setSize(400, 300);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = 0;
        if (e.getSource() == b1) {
            c = a + b;
        }
        else if(e.getSource() == b2) {
            c = a - b;
        }
        else if(e.getSource() == b3) {
            c = a / b;
        }
        String result = String.valueOf(c);
        tf3.setText(result);
    }
    public static void main(String[] args) {
        new NewClass1();
    }
}
