package lab7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        int amount = 4;
        Integer i;
        ArrayList<Integer> array = new ArrayList<Integer>(amount);

        for(i = 0; i <amount; i++ ) {
            array.add(i,i);
        }
        System.out.println(array);

        ArrayList<Integer> array2 = new ArrayList<Integer>(array);
        array2.addAll(i,array);
        System.out.println(array2);

        System.out.println(array2.get(3));
        System.out.println(array2.indexOf(2));
        System.out.println(array2.lastIndexOf(2));
        array2.remove(5);
        System.out.println(array2);
        array2.set(4,8);
        System.out.println(array2);
        array2.sort(Comparator.naturalOrder());
        System.out.println(array2);
        System.out.println(array2.subList(2, 5));


    }

}
