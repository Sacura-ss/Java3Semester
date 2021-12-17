package restaurant2;

import javax.swing.*;
import java.awt.*;

public class Application extends JFrame {
    //private JButton addOrder = new JButton("+");

    private JPanel containerDelivery = new JPanel();
    private JPanel containerTable = new JPanel();

    public static void setMature(boolean mature) {
        isMature = mature;
    }

    private static boolean isMature;

    public Application(){
        super("Orders");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        setLayout(new FlowLayout(FlowLayout.CENTER));

        containerTable.setLayout(new GridLayout(3, 0));

        containerTable.setBackground(new Color(45, 34, 43, 230));
        containerTable.setSize(500, 500);

        containerTable.add(new JLabel("Â çàëå"));
        add(containerTable);

        containerDelivery.setLayout(new GridLayout(3, 0));

        containerDelivery.setBackground(new Color(45, 34, 43, 230));
        containerDelivery.setSize(500, 500);

        containerDelivery.add(new JLabel("Äîñòàâêà"));

        add(containerDelivery);

        setVisible(true);

        new Registration();

    }
}
