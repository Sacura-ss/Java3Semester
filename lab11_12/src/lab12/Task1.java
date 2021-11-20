package lab12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

//Task1: Реализовать консольное приложение, позволяющее манипулировать строкой, разбив ее
//на элементы путем использования регулярных выражений

public class Task1 {
    public static void main(String[] args) {
        //String enterString = "Acceptissima semper12 munera; sunt, ?auctor quae pretiosa facit";
        //String enterRegex = "s..?a";
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите строку");
            String enterString = reader.readLine();
            System.out.println("Введите регулярное выражение для поиска элементов в строке");
            String enterRegex = reader.readLine();

            Pattern pattern = Pattern.compile(enterRegex);
            Matcher matcher = pattern.matcher(enterString); //поисковик, движок регул в строке
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        } catch (PatternSyntaxException e) {
            System.out.println(e);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
