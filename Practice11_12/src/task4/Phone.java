package practice11_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//+<Код страны><Номер 10 цифр>, например “+79175655655”
//8<Номер 10 цифр> для России, например “89175655655”
//Получить +<Код страны><Три цифры>–<Три цифры>–<Четыре цифры>
public class Phone {
    private StringBuilder number;

    public Phone(StringBuilder num) {
        number = num;
    }
    public StringBuilder getNumber()  {
        if(number.length() == 11) { //номер с 8
            number.deleteCharAt(0);//удаляем 8
            System.out.println("Enter code of the country ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                String codeCountry = reader.readLine();
                number.insert(0, codeCountry); //добавляем код страны
            } catch (IOException e) {
                e.printStackTrace();
            }
            number.insert(0,'+'); // добавляем +
        }
        number.insert(5,'-');
        number.insert(9,'-');
        number.insert(2," ");
        return number;
    }

    public static void main(String[] args) {

        Phone p1 = new Phone(new StringBuilder("+79175655655"));
        Phone p2 = new Phone(new StringBuilder("89175655655"));

        System.out.println(p1.getNumber());
        System.out.println(p2.getNumber());

    }
}
