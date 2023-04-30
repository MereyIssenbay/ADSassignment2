import java.util.NoSuchElementException;
public class MyArrayListQueue<E> {
    private MyArrayList<E> array;
    public MyArrayListQueue() {
        array = new MyArrayList<E>();
    }
    public void enqueue(E element) {
        array.add(element);
    }
}
