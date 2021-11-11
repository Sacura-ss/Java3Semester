/*Напишите интерактивную программу с использованием GUI имитирует
таблицу результатов матчей между командами Милан и Мадрид.
 • одна кнопка JButton labeled “AC Milan”
• другая JButton подписана “Real Madrid”
• надпись JLabel содержит текст “Result: 0 X 0”
• надпись JLabel содержит текст “Last Scorer: N/A”
• надпись Label содержит текст “Winner: DRAW”;*/

package Practice4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    private int numClicksFirstTeam = 0;
    private int numClicksSecondTeam = 0;
    private JButton buttonFirstTeam = new JButton("AC Milan");
    private JButton buttonSecondTeam = new JButton("Real Madrid");
    private JLabel labelResult = new JLabel("Result: 0 X 0",SwingConstants.CENTER);
    private JLabel labelLastScore = new JLabel("Last Scorer: N/A",SwingConstants.CENTER);
    private Label labelWinner = new Label("Winner: ", SwingConstants.CENTER);

    public MyFrame(){
        this.setBounds(100,100,500, 300); //рахмер формы (координаты, размер)
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane(); //контейнер для объектов frame
        container.setLayout(new BorderLayout());//задаем размер в виде таблицы
        container.add(labelWinner,BorderLayout.NORTH);
        container.getAlignmentX();
        buttonFirstTeam.addActionListener(this);
        buttonSecondTeam.addActionListener(this);
        container.add(buttonFirstTeam,BorderLayout.WEST);
        container.add(buttonSecondTeam,BorderLayout.EAST);
        container.add(labelResult,BorderLayout.CENTER);
        container.add(labelLastScore, BorderLayout.SOUTH);
    }
    public void actionPerformed(ActionEvent e){
        // invoked automatically whenever you click on the registered component.
        if(e.getActionCommand().equals("AC Milan")){
            //equals() - сравнение строк
            //getActionCommand() Returns the command string associated with this action.
            numClicksFirstTeam++;
            labelResult.setText("Result:" + numClicksFirstTeam + "x" + numClicksSecondTeam);
            labelLastScore.setText("Last Scorer: " + buttonFirstTeam.getText().toString());

        }
        else if(e.getActionCommand().equals("Real Madrid")){
            numClicksSecondTeam++;
            labelResult.setText("Result:" + numClicksFirstTeam + "x" + numClicksSecondTeam);
            labelLastScore.setText("Last Scorer: " + buttonSecondTeam.getText().toString());
        }
        if(numClicksSecondTeam == numClicksFirstTeam)
            labelWinner.setText("Winner: no winner");
        else if(numClicksSecondTeam > numClicksFirstTeam)
                labelWinner.setText("Winner: "+buttonSecondTeam.getText().toString());
        else
            labelWinner.setText("Winner: "+buttonFirstTeam.getText().toString());
    }
}
/*Label vs JLabel
*The fundamental difference between the two is that JLabel allows the
*  label to be composed of text, graphics, or both, while the old Label
* class only allowed simple text labels.*/