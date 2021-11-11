package lab10;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

/*Написать функцию, которая сохранит содержимое каталога в список и
выведет первые 5 элементов на экран. */
public class Task4 {

    public static void FileToList(String path) {
        ArrayList<String> list = null;
        try {
            File file = new File(path);
            if(file.isDirectory()) {
                list = new ArrayList<String>(Arrays.asList(file.list()));
            }
            else System.out.println("No directory");
            for (int i = 0; i < list.size(); i++) 
                System.out.println(list.get(i));
        } catch (Exception o) {
            System.out.println(o);
        }
    }
    public static void main(String[] args) {
          FileToList("/home/luba/Книги");
    }
}
