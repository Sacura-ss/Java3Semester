package Practice8;

import java.util.concurrent.ConcurrentLinkedQueue;

public interface IWaitList<E> {
    void add(E element);
    E remove();
    boolean contains(E element);
    boolean containsAll(ConcurrentLinkedQueue<E> c);
    boolean isEmpty();
}
