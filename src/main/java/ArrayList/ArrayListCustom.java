package ArrayList;

import java.io.BufferedReader;

public class ArrayListCustom <T> {
    public static final int DEFAULT_CAPACITY = 10;
    private T[] array;
    private int size;

    public ArrayListCustom(){
        this.array = (T[]) new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }
    public ArrayListCustom(int size){
        this.array = (T[]) new Object[size];
        this.size = 0;
    }
    public void add(T input){
        if(size>= array.length){
            int massSize = size + array.length/2;
            T[] data =  (T[]) new Object[massSize];
            for (int i = 0; i <array.length ; i++) {
                data[i] = array[i];
            }
            array = data;
        }
        array[size] = input;
        size++;
    }
    public void remove(int index){
        if(index<0 || index>=size){
            throw new ArrayIndexOutOfBoundsException();
        } else{
            T[] data = (T[]) new Object[array.length-1];
            for(int i = 0, k =0; i<array.length; i++){
                if(i!=index){
                    data[k]=array[i];
                    k++;
                }else{
                    size--;
                }
            }
            array=data;
        }
    }
    public void clear(){
        size = 0;
        array = null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if(array==null){
            return "array is empty";
        }
        else{
            for(T item : array){
                if(item != null){
                builder
                        .append(item)
                        .append(" ");
            }
            }
        return builder.toString().trim();
        }
    }

    public T get(int index){
        if(index<0 || index>=size){
            throw new ArrayIndexOutOfBoundsException();
        }
        return array[index];
    }
    public int getSize(){
        return size;
    }
}
