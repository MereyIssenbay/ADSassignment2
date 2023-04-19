public class MyLinkedList<T> implements MyList{
    private class Node<E> {
        E element;
        Node<E> next;
        Node<E> prev;

        public Node(E element) {
            this.element = element;
            this.next = null;
            this.prev = null;
        }
    }
    private Node<T> head;
    private Node<T> tail;
    private int size;

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public void add(Object item) {
        Node<T> newNode = new Node<T>((T) item);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public void add(Object item, int index) {

    }

    @Override
    public boolean remove(Object item) {
        return false;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public void sort() {

    }

    @Override
    public void printALL() {

    }
}
