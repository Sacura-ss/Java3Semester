package Practice5;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class TestPalindrome {

    public static void main(String[] args) throws IOException { //выбросить исключения
        System.out.println("Enter word: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();
        Palindrome p = new Palindrome();
        boolean answer = p.itsPalindrome(word,0,word.length() -1);
        if(answer)
            System.out.println("is Palindrome");
        else
            System.out.println("is not Palindrome");

    }
}
