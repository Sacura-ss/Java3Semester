package lab5;
/*Создать окно, нарисовать в нем 20 случайных фигур, случайного
цвета.  Классы  фигур  должны  наследоваться  от  абстрактного  класса
Shape, в котором описаны свойства фигуры: цвет, позиция. */

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MyFrame extends JFrame {
    public MyFrame() {
        super("shapes");
        this.setBounds(100, 100, 500, 500); //рахмер формы (координаты, размер)
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout layout = new GridLayout(4,5);
        setLayout(layout);
        boolean filled = (Math.random() * 255) > 64;
        for(int i = 0; i < 20; i++){
            if(i % 3 == 0)
                add(new Circle((int)Math.random()*100+50, getRandomColor(), true));
            else if(i % 2 == 0)
                add(new Rectangle((int)Math.random()*100+50,(int)Math.random()*100+50,getRandomColor(),true));
            else
                add(new Circle((int)Math.random()*100+50,false));
                //add(new (getRandomColor(),filled,(int)Math.random()*100+50,(int)Math.random()*100+50,(int)Math.random()*100+50));
        }
        setVisible(true);
        }
    public Color getRandomColor() {
        Random rand = new Random();
        // Java 'Color' class takes 3 floats, from 0 to 1.
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        Color randomColor = new Color(r, g, b);
        return randomColor;
    }
}