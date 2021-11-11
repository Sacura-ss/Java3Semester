package lab5;

import java.awt.*;

public class Circle extends Shape {

    protected int radius;

    public Circle() {}
    public Circle(int radius, boolean filled){
        this.radius = radius;
        this.filled = filled;
    }
    public Circle(int radius, Color color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        super.toString();
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if(filled)
            g.fillOval(0, 0 , radius, radius);
        else
            g.drawOval((int)Math.random()*40, (int)Math.random()*40,radius, radius);
    }
}