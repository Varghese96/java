package awt;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by expertzlab9 on 25/7/18.
 */
public class example implements ActionListener {
    private JButton button1;
    private JButton button2;
    private JPanel panel1;
    JTextField textfield;
    JTextField textfield1;
    JTextField textfield2;
    JLabel label;

    example(){
        JFrame frame=new JFrame("first app");
        button1=new JButton("+");
        button2=new JButton("-");
        textfield=new JTextField();
        textfield1=new JTextField();
        textfield2=new JTextField();
        label=new JLabel("first name");
        frame.setLayout(null);
        frame.setSize(500,500);
        frame.add(button1);
        frame.add(button2);
        frame.add(label);
        frame.add(textfield);
        frame.add(textfield1);
        frame.add(textfield2);

        button1.setBounds(120,220,70,30);
        button2.setBounds(180,220,70,30);
       button1.addActionListener(this);
       button2.addActionListener(this);
        textfield.setBounds(120,100,90,30);
        textfield1.setBounds(120,140,90,30);
        textfield2.setBounds(120,180,90,30);
        label.setBounds(70,75,90,30);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new example();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int i=Integer.parseInt(textfield.getText());
        int i1=Integer.parseInt(textfield1.getText());
        if(e.getSource()==button1) {

            int i2=i+i1;
            textfield2.setText(String.valueOf(i2));


        }
        else if(e.getSource()==button2)
        {
           int i2=i-i1;
           textfield2.setText(String.valueOf(i2));
        }
        JOptionPane.showMessageDialog(null,"hello");
    }

}
