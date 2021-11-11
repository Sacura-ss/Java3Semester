package Practice9;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int getAmountNumber(Long l) {
        int n = 0;
        while(l != 0) {
            l = l/10;
            n++;
        }
        return n;
    }
    public static void main(String[] args) {
        //создаем нового клиента и добавляем его туда
        Client client = new Client();
        System.out.println("Ordering:");
        System.out.println("Type in full name: ");
        Scanner scan = new Scanner(System.in);
        client.setiD(scan.nextLine());
        System.out.println("Type in INN: ");
        String str = (scan.next());
        try {
            try {
                Long l = Long.valueOf(str);
                client.setINN(l);
                int n = getAmountNumber(l);
                if(n != 10 && n != 12)
                    throw new IncorrectInnException("Не соответствует колличеству цифр в ИНН!");
            } catch (NumberFormatException e) {
                System.err.println("Неверный формат строки!");
            }
        }catch (Throwable err) {
            System.out.println(err);
            System.out.println("\nСтек вызовов");
            err.printStackTrace();
        }
    }
}
