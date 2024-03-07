package Queue;

public class Demo {
    public static void main(String[] args) {
        QueueCustom<Integer> queueCustom = new QueueCustom<>();
        queueCustom.add(1);
        queueCustom.add(2);
        queueCustom.add(3);
        queueCustom.add(4);
        System.out.println("queueCustom.size() = " + queueCustom.size());
        System.out.println("First peek() = " + queueCustom.peek());
        System.out.println("First poll() = " + queueCustom.poll());
        System.out.println("Second peek() = " + queueCustom.peek());
        System.out.println("Second poll() = " + queueCustom.poll());
        queueCustom.clear();
        System.out.println("Last peek() = " + queueCustom.peek());


    }
}
