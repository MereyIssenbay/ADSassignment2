public class MyLinkedList<T> implements MyList{
    private class Node<E> {
        E element;
        Node<E> next;
        Node<E> prev;

        Node(E element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
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
        Node newNode = new Node(item, null, tail);
        if (tail != null) {
            tail.next = newNode;
        } else {
            head = newNode;
        }
        tail = newNode;
        size++;
    }

    @Override
    public void add(Object item, int index) {
        checkIndex(index);
        if (index == size) {
            add(item);
        } else {
            Node curNode;
            if (index < size / 2) {
                curNode = head;
                for (int i = 0; i < index; i++) {
                    curNode = curNode.next;
                }
            } else {
                curNode = tail;
                for (int i = size - 1; i > index; i--) {
                    curNode = curNode.prev;
                }
            }
            Node prevNode = curNode.prev;
            Node newNode = new Node(item, curNode, prevNode);
            curNode.prev = newNode;
            if (prevNode != null) {
                prevNode.next = newNode;
            } else {
                head = newNode;
            }
            size++;
        }
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
    public void checkIndex(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public void printALL() {
        Node<T> node = head;
        System.out.print("[ ");
        while (node != null) {
            System.out.print(node.element + " ");
            node = node.next;
        }
        System.out.println("]");
    }

}
