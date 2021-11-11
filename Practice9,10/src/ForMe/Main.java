/*package ForMe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public String classicMethod() {
        // проверяемые пользовательские исключения, которые необходимо обрабатывать явно.
        try (Scanner scan = new Scanner(new File("test.txt"))) {
            if (scan.hasNextLine())
                return scan.nextLine();
        } catch(FileNotFoundException e) {
            // Logging, etc
        }
        return null;
    }
    public String myMethod(){
        try (Scanner scan = new Scanner(new File("test2.txt"))) {
            if (scan.hasNextLine())
                return scan.nextLine();
        } catch (FileNotFoundException err) {
            if (!isCorrectFileName("test2.txt")) {
                throw new BadFileNameException("Bad filename : " + "test2.txt",err);
            }

        } catch (IllegalArgumentException err) {
            if (!containsExtension("test2.txt")) {
                throw new BadFileExtensionException(
                        "Filename does not contain extension: " + "test2.txt", err);
            }
        return null;
    }

    public static void main(String[] args) {

    }
}*/
/*Иногда метод, в котором может генерироваться исключение, сам не обрабатывает это исключение. В этом случае в объявлении метода используется оператор throws, который надо обработать при вызове этого метода*/
