package lab10;
/*
Написать класс, который умеет хранить в себе массив любых типов данных (int,
long etc.).
Реализовать метод, который возвращает любой элемент массива по индексу
*/

import java.util.ArrayList;

public class Task2<T> {
    ArrayList<T> array;

    Task2 (T[] array ) {
        this.array = new ArrayList<T>();
        for(T i:array) this.array.add(i);
    }

   T getElement(int index) {
        return this.array.get(index);
   }

    public static void main(String[] args) {
        //int nums[] = {1, 2, 3, 4};
        //long lnums[] = {5L, 6L, 7L};
        Integer nums[] = {1, 2, 3, 4};
        Long lnums[] = {5L, 6L, 7L};

        Task2<Integer> arr1 = new Task2<Integer>(nums);
        Task2<Long> arr2 = new Task2<Long>(lnums);
        System.out.println(arr1.array);
        System.out.println(arr2.array);
        System.out.println(arr1.getElement(2));
    }
}
