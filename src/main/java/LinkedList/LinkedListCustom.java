package LinkedList;

import java.util.Objects;

public class LinkedListCustom <T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

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
    public void remove(int index){
        Objects.checkIndex(index, size);
        Node<T> current = head;
        if(index == 0){
            head = current.next;
            current.next.previous=null;
        }
        else if(index==size-1){
            tail.previous.next = null;
            tail = tail.previous;
        }
        else{
            for(int i =0; i<index; i++){
            current = current.next;
        }
        current.previous.next=current.next;
        current.next.previous=current.previous;
        }
        size--;
    }
    public void clear() {
        if (size == 0) {
            return;
        } else if (size == 1) {
            head = null;
            tail = null;
        } else {
            Node<T> current = head;
            while (current != null) {
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
    public boolean isEmpty(){
        return tail==null;
    }
    public T get(int index){
        Objects.checkIndex(index, size);
        Node<T> current = head;
        for(int i =0; i<index; i++){
            current = current.next;
        }
        return current.value;
    }

    public int size() {
        return size;
    }

    private static class Node<T>{
        T value;
        Node<T> previous;
        Node<T> next;
        public Node(T value){
            this.value = value;
        }
    }
}
