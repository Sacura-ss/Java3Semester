package lab12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

//Task2: Написать   регулярное   выражение,   определяющее   является   ли   данная   строка
//строкой "abcdefghijklmnopqrstuv18340" или нет.

public class Task2 {
    public static void main(String[] args) {
        String str2 = "abcdefghijklmnopqrstuv18340";
        String regex2 = "^abcdefghijklmnopqrstuv18340$";//регулярное выражения для str2
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите строку для проверки");
            String enterString = reader.readLine();

            //Task2
            boolean match = Pattern.matches(regex2, enterString);
            System.out.println("Строка " + enterString + " является " + str2 + "?");
            if(match)
                System.out.println("Да");
            else
                System.out.println("Нет");
        } catch (PatternSyntaxException e) {
            System.out.println(e);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
