package task2;

import task2.Adress;

public class TestAdress {
    public static void main(String[] args) {
        Adress ad = new Adress("USA, MD, Rockvill, PiccardDr, 1350, 1, 1", ",");
        System.out.println(ad.getAddress());

        Adress add = new Adress("USA; MD; Rockvill; PiccardDr; 1350; 1; 1");
        System.out.println(add.getAddress());
        //при тесте верный delim  - это 'пробел'; //
    }
}
