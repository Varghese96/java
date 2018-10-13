package awt;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by expertzlab9 on 25/7/18.
 */
public class GUI implements ActionListener {
    private JButton button1;
    private JPanel panel1;
    JTextField textfield;
    JLabel label;

    GUI(){
        JFrame frame=new JFrame("first app");
        button1=new JButton("click");
        textfield=new JTextField();
        label=new JLabel("first name");
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.add(button1);
        frame.add(label);
        frame.add(textfield);

        button1.setBounds(120,200,70,30);
        button1.addActionListener(this);
        textfield.setBounds(120,100,90,30);
        label.setBounds(70,75,90,30);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent  e) {

if(e.getSource()==button1)
        textfield.setText("hello java");
        JOptionPane.showMessageDialog(null,"hello");
    }

}
