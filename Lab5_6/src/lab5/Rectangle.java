package lab5;

import java.awt.*;

public class Rectangle extends Shape {
        protected int width;
        protected int length;

        public Rectangle (int width, int length, boolean filled) {
                this.width = width;
                this.length = length;
                this.filled = filled;
        }
        public Rectangle(int width, int length, Color color, boolean filled){
                this.width = width;
                this.length = length;
                this.color = color;
                this.filled = filled;
                }
        public int getWidth() {
                return width;
                }
        public void setWidth(int width) {
                this.width = width;
                }
        public int getLength() {
                return length;
                }
        public void setLength(int length) {
                this.length = length;
                }

        @Override
        public double getArea() {
                return width*length;
        }

        @Override
        public void paint(Graphics g) {
                super.paint(g);
                if(filled)
                        g.fillRect((int)Math.random()*400,(int)Math.random()*400,width, length);
                else
                        g.drawRect((int)Math.random()*400,(int)Math.random()*400,width,length);
        }

        @Override
        public String toString() {
                super.toString();
                return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
        }
}
