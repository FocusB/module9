package ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayListCustom<Integer> arrayInteger = new ArrayListCustom<>();
        ArrayListCustom<String> arrayString = new ArrayListCustom<>(10);
        System.out.println("Adding 49 elements");
        for(int i =1; i<15; i++){
            arrayInteger.add(i);
        }
        for(int i =0; i<arrayInteger.getSize(); i++){
            System.out.println(i + " " + arrayInteger.get(i));
        }

        System.out.println("Array length - " + arrayInteger.getSize());

        System.out.println("Removing 5-th element");
        arrayInteger.remove(4);
        for(int i =0; i<arrayInteger.getSize(); i++){
            System.out.println(i + " " + arrayInteger.get(i));
        }
        System.out.println("Array length after first removing - " + arrayInteger.getSize());

        System.out.println("Removing 10-th element");
        arrayInteger.remove(10);
        for(int i =0; i<arrayInteger.getSize(); i++){
            System.out.println(i + " " + arrayInteger.get(i));
        }
        System.out.println("Array length after second removing - " + arrayInteger.getSize());

        System.out.println("arrayInteger.toString() = " + arrayInteger.toString());

        arrayInteger.clear();
        System.out.println("Clearing the array");
        System.out.println("arrayInteger.toString() = " + arrayInteger.toString());
        System.out.println("arrayInteger.getSize() = " + arrayInteger.getSize());

        arrayString.add("Hello");
        arrayString.add("My");
        arrayString.add("Name");
        arrayString.add("Is");
        arrayString.add("Artem");
        for(int i =0; i< arrayString.getSize();i++){
            System.out.println(arrayString.get(i));
        }

        System.out.println("Removing third word");
        arrayString.remove(2);
        for(int i =0; i< arrayString.getSize();i++){
            System.out.println(arrayString.get(i));
        }

        System.out.println("arrayString.toString() = " + arrayString.toString());

        System.out.println("Clearing the array");
        arrayString.clear();
        System.out.println("arrayString.toString() = " + arrayString.toString());




    }
}
