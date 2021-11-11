package Practice8;

import java.util.concurrent.ConcurrentLinkedQueue;

public class UnfairWaitList<E> extends WaitList<E>{
    public UnfairWaitList() {
        super(new ConcurrentLinkedQueue<E>());
    }
    /**
     * <p>можно удалить элемент, который не является первым в очереди, первое вхождение</p>
     * @param element
     */
    public void remove(E element){
        E e = content.peek();//извлекает заголовок
        if(element == e) {
            moveToBack(element);
        }
        content.remove(element);
    }
    //первый элемент будет отправлен обратно в конец списка
    public void moveToBack(E element){
        //offer вставляет указанный элемент в конец этой очереди
        content.offer(element);
    }
}
