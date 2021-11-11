package Practice8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E>  implements IWaitList<E> {

    //Неограниченная потокобезопасная очередь на основе связанных узлов.
    protected ConcurrentLinkedQueue<E> content;

    public WaitList() {}
    public WaitList(ConcurrentLinkedQueue<E> c) {
        content = c;
    }

    public ConcurrentLinkedQueue<E> getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }

    @Override
    public void add(E element) {
        content.add(element);
    }

    @Override
    public E remove() {
        E element = content.remove();
        return element;
    }

    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(ConcurrentLinkedQueue<E> c) {
        return content.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }
}
