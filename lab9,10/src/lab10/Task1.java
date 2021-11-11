package lab10;
/*Написать метод для конвертации массива строк/чисел в список.*/
import java.util.ArrayList;

public class Task1 {

    public static <E> void ArrayToArrayList(E[] a, ArrayList<E> lst) {
        for (E e : a) lst.add(e);
    }

    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<Integer>();
        Integer[] intArray = {55, 66};
        ArrayToArrayList(intArray, lst);
        for (Integer i : lst) System.out.println(i);

        ArrayList<String> lst2 = new ArrayList<String>();
        String[] strArray = {"one", "two", "three"};
        ArrayToArrayList(strArray, lst2);
        for (String i : lst2) System.out.println(i);
    }
}
