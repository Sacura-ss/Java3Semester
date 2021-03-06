package lab9;

import java.util.Scanner;

public class ThrowsDemo {

    public ThrowsDemo() {
    }

    public void getKey(){

        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Enter Key");
            String key = myScanner.nextLine();
            printDetails(key);
        } catch (Exception e) {
            System.out.println(e);
            getKey();
        }


    }

    public void printDetails(String key) throws Exception{

        String message = getDetails(key);
        System.out.println( message );

    }

    public String getDetails(String key) throws  Exception  {

        if(key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}

