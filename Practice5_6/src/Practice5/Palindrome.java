package Practice5;

public class Palindrome {

    public Palindrome() {
    }

    public boolean itsPalindrome(String word, int i_left, int i_right) {
        if(i_left == i_right)
            return true;
        if(word.charAt(i_left) != word.charAt(i_right))
            return false;
        if(i_left < i_right)
            return itsPalindrome(word, i_left + 1, i_right -1);
        return true;
    }
}
