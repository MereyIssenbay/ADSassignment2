public class test {
    public static void main(String[] args) {
        MyArrayListQueue<Integer> queue = new MyArrayListQueue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.size()); // 3
        System.out.println(queue.peek()); // 1
        System.out.println(queue.dequeue()); // 1
        System.out.println(queue.dequeue()); // 2
        System.out.println(queue.size()); // 1
        System.out.println(queue.isEmpty()); // false
        System.out.println(queue.dequeue()); // 3
        System.out.println(queue.size()); // 0
        System.out.println(queue.isEmpty()); // true
    }
}
