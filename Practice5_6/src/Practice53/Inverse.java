package Practice53;

public class Inverse {
    public static int inverse(int n, int i){
        return (n == 0)? i:inverse(n/10, i*10 + n%10);
    }
    public static void main(String[] args) {
        System.out.println(inverse(158, 0));
    }
}
