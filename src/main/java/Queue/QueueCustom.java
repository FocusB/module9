package Queue;

public class QueueCustom <T>{
    Node<T> head;
    Node<T> tail;
    int size;
    public void add(T value){
        Node<T> node = new Node<>(value);
        if(head==null){
        head = node;
        tail = node;
        }else{
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
        size++;
    }
    public void clear(){
        if(size == 0){
            return;
        }
        else if(size==1){
            head = null;
            tail = null;
        }
        else{
            Node<T> current = head;
            while(current!=null){
                Node<T> next = current.next;
                current.previous = null;
                current.next = null;
                current = next;
            }
            head = null;
            tail = null;
        }
        size = 0;
    }
    public T peek(){
        if(size==0){
            throw new ArrayIndexOutOfBoundsException("Queue is empty");
        }
        return head.value;
    }
    public T poll() {
        Node<T> currentHead = head;
        Node<T> node = head;
        if(size == 0){
            throw new ArrayIndexOutOfBoundsException("Queue is empty");
        }
        else if(size==1){
            head=null;
            tail=null;
        }
        else {
            head = node.next;
            node.next.previous = null;
        }
        size--;
        return currentHead.value;
    }
    public int size(){
        return size;
    }
    private static class Node<T>{
        T value;
        Node<T> next;
        Node<T> previous;
        public Node(T value){
            this.value = value;
        }
    }
}
