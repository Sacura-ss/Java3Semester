package lab3;

public class TestDish {
    public static void main(String[] args) {
        Cup c = new Cup("pink","ceramics",false,true);
        Plate p = new Plate("blue","ceramics",true, 15);
        System.out.println(c);
        System.out.println(p);
        if(!c.isFullness()){
            c.fill();
        }
        if (c.isHandle()) {
            c.Drink();
        }
        p.Eat();
        System.out.println(c.clear());
        System.out.println(p.clear());

    }
}
