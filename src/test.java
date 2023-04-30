public class test {
    public static void main(String[] args) {
        MyArrayListStack stack = new MyArrayListStack();
        System.out.println(stack.isEmpty());

        stack.push("apple");
        stack.push("banana");
        stack.push("orange");
        System.out.println(stack.size());

        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack.peek());

        stack.push("grape");
        System.out.println(stack.size());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.isEmpty());
    }
}
