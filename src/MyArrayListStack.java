import java.util.EmptyStackException;
public class MyArrayListStack<E> {
    private MyArrayList<E> array;
    public MyArrayListStack() {
        array = new MyArrayList<>();
    }
    public void push(E element) {
        array.add(element);
    }
    public E pop() {
        if (array.size() == 0) {
            throw new EmptyStackException();
        }
        return (E) array.remove(array.size() - 1);
    }
    public E peek() {
        checkEmpty();
        return (E) array.get(array.size() - 1);
    }
    public void checkEmpty(){
        if (array.size() == 0) {
            throw new EmptyStackException();
        }
    }
}
