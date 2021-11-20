package lab11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TestSolution {
    public static void main(String[] args) {

        Solution s = new Solution();
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        ArrayList<Integer> keys = new ArrayList<>();
        for(int i = 0; i < 6; i++) {
            arrL.add(i+100);
            keys.add(i);
        }
        System.out.println(s.newArrayList(arrL));
        System.out.println(s.newHashSet(arrL));
        System.out.println(s.newHashMap(keys, arrL));

    }
}
