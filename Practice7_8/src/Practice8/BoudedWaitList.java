package Practice8;

import java.util.concurrent.ConcurrentLinkedQueue;

public class BoudedWaitList<E> extends WaitList<E>{

    //имеет ограниченную емкость, указываемую в момент создания
    private int capacity;
    private int amountElements =0;

    public BoudedWaitList(int capacity) {
        super(new ConcurrentLinkedQueue<E>());
        this.capacity = capacity;
    }
    public int getCapacity(){
        return capacity;
    }
    @Override
    public void add(E element){
        if(amountElements < capacity)
            content.add(element);
        amountElements++;
    }

    @Override
    public String toString() {
        return "BoudedWaitList{" +
                "capacity=" + capacity +
                ", content=" + content +
                '}';
    }
}
