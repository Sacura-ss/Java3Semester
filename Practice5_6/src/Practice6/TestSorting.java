package Practice6;

public class TestSorting {
    public static void main(String[] args) {
        int n = 10;
        Student[] array = new Student[10];
        for(int  i=0; i<n; i++) {
           array[i] = new Student(i+100);
        }
        Sorting s = new Sorting(array);
        for(int j = 0; j < array.length; j++){
            System.out.println(array[j]);
        }
        s.sort();
        System.out.println();
        for(int j = 0; j < array.length; j++){
            System.out.println(array[j]);
        }

    }
}
