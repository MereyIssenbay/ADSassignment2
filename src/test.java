public class test {
    public static void main(String[] args) {
        MyArrayListStack stack = new MyArrayListStack();
        System.out.println(stack.isEmpty()); // true

        stack.push("apple");
        stack.push("banana");
        stack.push("orange");

        System.out.println(stack.peek()); //orange
        System.out.println(stack.pop()); // orange

        System.out.println(stack.peek()); // banana

        stack.push("grape");

        System.out.println(stack.pop()); // grape
        System.out.println(stack.pop()); // banana
        System.out.println(stack.pop()); // apple

        System.out.println(stack.isEmpty()); // true
    }
}
