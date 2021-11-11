package Task3;

public class Task3Test {
    public static void main(String[] args) {
        int[]a = new int[10];
        Massive mas = new Massive(a);
        mas.fillMassive();

        mas.calculateSumFor();
        int x = mas.getSumElements();
        System.out.println(x);

        mas.calculateSumWhile();
        x = mas.getSumElements();
        System.out.println(x);

        mas.calculateSumDoWhile();
        x = mas.getSumElements();
        System.out.println(x);
    }
}
