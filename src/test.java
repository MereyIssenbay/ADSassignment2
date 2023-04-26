public class test {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyArrayList();
        MyList<Integer> myList1 = new MyLinkedList<>();
        Object arr[] = {4,5,6};
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(7);
        myList.add(8);
        myList.addAllindex(arr, 2);
        myList.printALL();
    }
}
