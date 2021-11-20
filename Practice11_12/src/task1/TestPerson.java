package task1;

import task1.Person;

public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person("Буревесник", "Ульфрик", "");
        Person p2 = new Person("Йордис", "Дева", "Меча");
        Person p3 = new Person("Алдуин", "", "");
        Person p4 = new Person("M'Aйк", "", "Лжец");
        System.out.println(p.getFIO());
        System.out.println(p2.getFIO());
        System.out.println(p3.getFIO());
        System.out.println(p4.getFIO());
    }
}
