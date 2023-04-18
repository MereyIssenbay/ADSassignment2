public class test {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyArrayList();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        System.out.println("Elements in the list after adding 3 elements: " + myList.size());
        System.out.println("Element at index 1: " + myList.get(1));
        myList.add(4, 1);
        System.out.println("Element at index 1: " + myList.get(1));
    }
}
