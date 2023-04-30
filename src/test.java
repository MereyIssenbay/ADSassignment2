public class test {
    public static void main(String[] args) {
        MyArrayListQueue<Integer> queue = new MyArrayListQueue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.size()); // 3

    }
}
