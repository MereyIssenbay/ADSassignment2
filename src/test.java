public class test {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyArrayList();
        MyList<Integer> myList1 = new MyLinkedList<>();
        myList1.add(1);
        myList1.add(2);
        myList1.add(3);
        myList1.printALL();
        myList1.add(4,1);
        myList1.printALL();
        myList1.remove(1);
        System.out.println(myList1.remove(Integer.valueOf("4")));
        myList1.printALL();
    }
}
