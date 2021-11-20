package lab12;

/*Проверить, надежно ли составлен пароль. Пароль считается надежным, если он состоит из 8 или
более символов. Где символом может быть цифр, английская буква, и знак подчеркивания. Пароль
должен содержать хотя бы одну заглавную букву, одну маленькую букву и одну цифру.
– пример правильных выражений: F032_Password, TrySpy1.
– пример неправильных выражений: smart_pass, A007.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите пароль: ");
        String password = reader.readLine();

        Pattern pattern0 = Pattern.compile(".{8,}");
        Matcher matcher0 = pattern0.matcher(password); //из 8 символов
        Pattern pattern1 = Pattern.compile("[A-Z]+");
        Matcher matcher1= pattern1.matcher(password); //хотя бы одна заглавная
        Pattern pattern2 = Pattern.compile("[a-z]+");
        Matcher matcher2= pattern2.matcher(password); //хотя бы одна строчная
        Pattern pattern3 = Pattern.compile("\\d+");
        Matcher matcher3= pattern3.matcher(password); //хотя бы одня цифра
        Pattern pattern4 = Pattern.compile("^\\w+&");
        Matcher matcher4= pattern4.matcher(password); //буквенно-цифровой символ или знак подчёркивания

        if( matcher0.find()
                && matcher1.find()
                && matcher2.find()
                && matcher3.find()
                && matcher4.find() ) {
            System.out.println("Верный пароль");
        }
        else
            System.out.println("Слишком простой пароль");
    }
}
