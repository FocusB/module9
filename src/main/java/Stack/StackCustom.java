package Stack;

import java.util.Objects;

public class StackCustom <T>{

    Node<T> head;
    Node<T> tail;
    int size;
    public void push(T value){
        Node<T> node = new Node<>(value);
        if(head==null){
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
        size++;
    }
    public void remove(int index){
        Objects.checkIndex(index,size);
        Node<T> current = head;
        if(index == 0){
            head = current.next;
            current.next.previous=null;
        }
        else if (index == size-1){
            tail.previous.next = null;
            tail = tail.previous;
        }
        else{
            for(int i=0; i<index; i++){
                current=current.next;
            }
            current.previous.next=current.next;
            current.next.previous=current.previous;
        }
        size--;
    }
    public void clear(){
        if(size==0){
            throw new ArrayIndexOutOfBoundsException("Stack is empty");
        }
        else if(size==1){
            head = null;
            tail = null;
        }
        else{
            Node<T> current = head;
            while(current!=null){
                Node<T> next = current.next;
                current.next=null;
                current.previous = null;
                current = next;
            }
            head = null;
            tail = null;
        }
        size=0;
    }
    public int size() {
        return size;
    }
    public T peek(){
        if(size==0){
            throw new ArrayIndexOutOfBoundsException("Stack is empty");
        }
        else{
            return tail.value;
        }
    }
    public T pop(){
        Node<T> currentTail = tail;
        Node<T> node = tail;
        if(size==0){
            throw new ArrayIndexOutOfBoundsException("Stack is empty");
        }
        else if(size == 1){
            head = null;
            tail = null;
        }
        else{
            tail = node.previous;
            node.previous.next = null;
        }
        size--;
        return currentTail.value;
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
