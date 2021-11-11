package Practice52;

public class WithoutRepeat {
    public static int numberSequence(int a, int b) {
        if(a>b+1)
            return 0;
        if(a ==0 || b == 0)
            return 1;
        return numberSequence(a, b-1) + numberSequence(a-1, b-1); //1 в концеб 0 в конце
    }
    public static void main(String[] args) {
        System.out.println(numberSequence(2, 1));
    }
}
