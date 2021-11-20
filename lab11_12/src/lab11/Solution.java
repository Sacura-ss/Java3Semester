package lab11;

import java.util.*;

public class Solution {

    public Solution() {}

    public <E> ArrayList<E> newArrayList(ArrayList<E> arrL) {
        Collection<E> arrayList = arrL;
        return arrL;
    }
    public <E> Set<E> newHashSet(ArrayList<E> arrL) {
        Set<E> hashSet = new HashSet<>(arrL);
        return hashSet;
    }
    public <K,V> Map<K,V> newHashMap(ArrayList<K> keys,ArrayList<V> arrL) {
        Map<K,V> hMap = new HashMap<>();
        try {
            for(int i = 0; i < arrL.size(); i++) {
                hMap.put(keys.get(i), arrL.get(i));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return hMap;
    }
}
