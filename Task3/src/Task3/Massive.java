package Task3;

public class Massive {
    private int[]a;
    private int sumElements = 0;

    public Massive(int[] a) {
        this.a = a;
    }

    public void fillMassive() {
        for(int i = 0; i<a.length; i++) {
            a[i] = i;
        }
    }
    public void printMassive() {
        for(int i = 0; i<a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public void calculateSumFor(){
        sumElements = 0;
        for(int i = 0; i<a.length; i++) {
            sumElements=sumElements+a[i];
        }
    }
    public void calculateSumWhile(){
        sumElements = 0;
        int i = 0;
        while ( i < a.length) {
            sumElements=sumElements+a[i];
            i++;
        }
    }
    public void calculateSumDoWhile(){
        sumElements = 0;
        int i = 0;
        do {
            sumElements += a[i];
            i++;
        } while(i<a.length);
    }

    public int getSumElements() {
        return sumElements;
    }
}
