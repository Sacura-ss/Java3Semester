package Practice8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class MainClass {
    public static void main(String[] args) {

        ConcurrentLinkedQueue list1 = new ConcurrentLinkedQueue() {};
        WaitList<Integer> list = new WaitList<Integer>(list1);
        BoudedWaitList<Integer> boundedList = new BoudedWaitList<Integer>(4);
        UnfairWaitList<Double> unfairList = new UnfairWaitList<Double>();
        for(int i = 0; i < 6; i++) {
            list.add(i);
            boundedList.add(i);
            unfairList.add((double)5-i);
        }
        System.out.println(list);
        System.out.println(boundedList);
        System.out.println(unfairList);
        System.out.println("\n");


        list.remove();
        boundedList.remove();
        unfairList.remove(3.0);
        System.out.println(list);
        System.out.println(boundedList);
        System.out.println(unfairList);
        System.out.println("\n");

        double num = 8.0;
        if (unfairList.contains(num)) System.out.println(num +" is in list");
        else System.out.println(num +" is not in list");

        if (list.containsAll(boundedList.getContent())) System.out.println("this list is in list");
        else System.out.println("this list is not in list");

    }
}
