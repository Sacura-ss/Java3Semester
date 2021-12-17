package restaurant2;

import javax.swing.*;
import java.awt.*;

public class Registration extends JFrame{
    JLabel titleName1 = new JLabel("First name");
    JTextField firstName = new JTextField(30);

    JLabel titleName2 = new JLabel("Second name");
    JTextField secondName = new JTextField(30);

    JLabel titleAddress = new JLabel("Address");
    JTextField address = new JTextField(30);

    JCheckBox isMature = new JCheckBox("18+");

    JButton submit = new JButton("Submit");


    Registration(){
        super("Registration");

        setSize(300, 400);
        setResizable(false);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        setLayout(new FlowLayout());

        add(titleName1);
        add(firstName);

        add(titleName2);
        add(secondName);

        add(titleAddress);
        add(address);

        add(isMature);

        submit.addActionListener(e ->{

            Application.setMature(isMature.isEnabled());
            setVisible(false);

        });

        titleName1.setForeground(Color.BLUE);
        titleName2.setForeground(Color.BLUE);

        titleAddress.setBackground(Color.LIGHT_GRAY);
        titleAddress.setForeground(Color.BLUE);

        firstName.setBackground(Color.WHITE);
        secondName.setBackground(Color.WHITE);

        isMature.setBackground(Color.YELLOW);
        isMature.setForeground(Color.RED);

        submit.setBackground(Color.GREEN);

        titleName1.setPreferredSize(new Dimension(150, 80));
        titleName2.setPreferredSize(new Dimension(150, 80));
        titleAddress.setPreferredSize(new Dimension(150, 80));

        add(submit);
        setVisible(true);

    }

}
