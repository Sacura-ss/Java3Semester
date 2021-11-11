package lab9;

import java.util.Scanner;

public class Exception2 {

    public void exceptionDemo() {

        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Enter an integer");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2/i);
        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Throwable e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Always execute after try/catch");
        }
    }
}
