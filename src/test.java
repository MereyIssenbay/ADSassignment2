public class test {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyArrayList();
        MyList<Integer> myList1 = new MyLinkedList<>();
        myList1.add(1);
        myList1.add(2);
        myList1.add(3);
        myList1.printALL();
    }
}
