package Task4;

public class Task4Test {
    public static void main(String[] args) {
        double radius = 5;
        Circle c = new Circle(radius);

        double P = c.getPerimeter();
        System.out.println(P);

        double  S = c.getArea();
        System.out.println(S);
    }

}
