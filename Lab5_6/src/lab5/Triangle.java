package lab5;

import java.awt.*;

public class Triangle extends Shape {

    protected int a,b,c;

    public Triangle(boolean filled, int a, int b, int c) {
        this.filled = filled;
        checkABC();
    }
    public Triangle(Color color, boolean filled, int a, int b, int c) {
        super(color, filled);
        checkABC();
    }
    public void checkABC() {
        /*while (a+b < c || a+c < b || b+c < a) {
            if(a+b < c) {
                a +=10;
                b+=5;
            }
            if(a+c < b) {
                a +=10;
                c+=5;
            }
            if(b+c < a) {
                b +=10;
                c+=5;
            }
        }*/
        this.a = a;
        this.b = b;
        this.c = c;
    }
    /*public double getMedian() {
        double m = 0.5 * Math.sqrt(2*b*b+2*c*c - a*a);
        return m;
    }*/

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String toString() {
        super.toString();
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Polygon p = new Polygon();
        p.addPoint(0, 0);
        p.addPoint(a, b);
        p.addPoint(a, 0);
        //int x = (int)Math.random()*400;
        //int y = (int)Math.random()*400;
        if(filled)
            g.fillPolygon(p);
            //g.fillPolygon(new int [] {x,x-(a/2),x-(a/2)}, new int [] {y, y+(int)getMedian(), y+(int)getMedian()}, 3);
        else
            g.drawPolygon(p);
            //g.drawPolygon(new int [] {x,x-(a/2),x-(a/2)}, new int [] {y, y+(int)getMedian(), y+(int)getMedian()}, 3);
    }
}
