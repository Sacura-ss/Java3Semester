package lab8;

import java.io.*;
import java.util.Scanner;

public class TestFile {
    public static void main(String[] args) {
        File file = new File("testfile.txt");
        try(FileWriter fileW = new FileWriter(file, false)) {
            String text = "ХОчууу спать";
            fileW.write(text);
            fileW.append('\n');
            //ввод в файл с клавиатуры
            Scanner scanner = new Scanner(System.in);
            text = scanner.nextLine();
            fileW.write(text);
            fileW.append('\n');
            fileW.flush();//очистить файл
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        try(FileReader fileR = new FileReader(file)) {
            // читаемпосимвольно
            int c;
            while((c=fileR.read()) != -1){
                System.out.print((char)c);
            }
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}
