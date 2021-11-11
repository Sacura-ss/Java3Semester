package lab6;
/*Реализуйте игру-угадайку, которая имеет одно текстовое поле и
одну кнопку. Он предложит пользователю угадать число между 0-20 и
дает ему три попытки. Если ему не удастся угадать, то будет выведено
сообщение,  что  пользователь  допустил  ошибку  в  угадывнии  и  что
число меньше / больше. Если пользователь попытался три раза угадать,
то  программу  завершается  с  соответствующим  сообщением.  Если
пользовательугадал,  то  программа  должна  тоже  завершаться  с
соответствующим сообщением. */

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Game extends JFrame {

    private int NUMBER = 13;
    private JButton answerButton = new JButton("Отправить ответ");
    private JTextField textField = new JTextField(2);
    private JLabel labelAsk= new JLabel("Угадайте число между 0-20 ",SwingConstants.CENTER);
    private JLabel labelCounterAttemps= new JLabel("У вас  осталось попыток 3 ",SwingConstants.CENTER);
    //private JLabel labelGameOver= new JLabel("У вас не осталось попыток. Игра окончена ",SwingConstants.CENTER);
    //private JLabel labelGameWin= new JLabel("Верно. Вы победили. Игра окончена ",SwingConstants.CENTER);
    private int counter = 3;
    //private JLabel labelLargerNumber= new JLabel("Какое число? ",SwingConstants.CENTER);

    public Game() {
        super("Угадайка");
        this.setBounds(100, 100, 500, 500); //рахмер формы (координаты, размер)
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane(); //контейнер для объектов frame
        container.setLayout(new GridLayout(4,1));//задаем размер в виде таблицы
        container.add(labelAsk);
        container.add(textField);
        container.add(answerButton);
        container.add(labelCounterAttemps);
        setVisible(true);
        JFrame parent = this;
        answerButton.addMouseListener(new MouseAdapter() {
           @Override
            public void mouseClicked(MouseEvent e) {
                //super.mouseClicked(e);
                counter--;
                if(textField.getText().equals("13")) {
                    labelCounterAttemps.setText("Верно. Вы победили. Игра окончена ");
                   JOptionPane.showMessageDialog(parent, "Верно. Вы победили. Игра окончена ");
                   System.exit(0);
                }

                else if (counter > 0) {
                    labelCounterAttemps.setText("У вас  осталось попыток " + counter);
                    if (Integer.parseInt(textField.getText()) < NUMBER) labelAsk.setText("Искомое число больше ");
                    else labelAsk.setText("Искомое число меньше ");
                }
                else if(counter < 1 ) {
                    labelCounterAttemps.setText("У вас не осталось попыток. Игра окончена ");
                    JOptionPane.showMessageDialog(parent, "У вас не осталось попыток. Игра окончена ");
                    System.exit(0);
                }
            }
        });
        textField.setHorizontalAlignment(20);
        container.getAlignmentX();//выравнивание по x


    }
}
