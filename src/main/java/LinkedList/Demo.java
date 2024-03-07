package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        LinkedListCustom<Integer> linkedInteger = new LinkedListCustom<>();
        linkedInteger.add(1);
        linkedInteger.add(2);
        linkedInteger.add(3);
        linkedInteger.add(4);
        linkedInteger.add(5);
        linkedInteger.add(6);
        for(int i = 0; i< linkedInteger.size();i++){
            System.out.println(linkedInteger.get(i));
        }
        linkedInteger.remove(5);
        System.out.println("Removing");
        for(int i = 0; i< linkedInteger.size();i++){
            System.out.println(linkedInteger.get(i));
        }
        System.out.println("Clearing");
        linkedInteger.clear();
        System.out.println("linkedInteger.isEmpty() = " + linkedInteger.isEmpty());

    }
}
