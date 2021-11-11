package lab5;

import javax.swing.*;
import java.awt.*;

public abstract class Shape extends JComponent {

    protected Color color;
    protected boolean filled;

    public Shape() {}
    public Shape(Color color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    @Override
    public void paint(Graphics g){
        g.setColor(color);
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    };

}
