package Stack;

public class Demo {
    public static void main(String[] args) {
        StackCustom<Integer> stackInteger = new StackCustom<>();
        stackInteger.push(1);
        stackInteger.push(2);
        stackInteger.push(3);
        stackInteger.push(4);
        stackInteger.push(5);

        System.out.println("stackInteger.peek() = " + stackInteger.peek());
        System.out.println("stackInteger.pop() = " + stackInteger.pop());
        System.out.println("stackInteger.peek() = " + stackInteger.peek());
        stackInteger.remove(3);
        System.out.println("stackInteger.peek() = " + stackInteger.peek());
        stackInteger.clear();
        System.out.println("stackInteger.peek() = " + stackInteger.peek());
    }
}
