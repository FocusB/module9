package HashMap;

public class Demo {
    public static void main(String[] args) {
        HashMapCustom<Integer, String> mapContainer = new HashMapCustom<>();
        mapContainer.put(1, "Hello");
        mapContainer.put(2, "My");
        mapContainer.put(3, "World");
        System.out.println("mapContainer.get(1) = " + mapContainer.get(1));
        System.out.println("mapContainer.get(2) = " + mapContainer.get(2));
        System.out.println("mapContainer.get(3) = " + mapContainer.get(3));
        System.out.println("size: " + mapContainer.size());
        mapContainer.remove(3);
        System.out.println("mapContainer.get(1) = " + mapContainer.get(1));
        System.out.println("mapContainer.get(2) = " + mapContainer.get(2));
        System.out.println("mapContainer.get(3) = " + mapContainer.get(3));
        System.out.println("size: " + mapContainer.size());
        mapContainer.clear();
        System.out.println("Clearing");
        System.out.println("mapContainer.get(1) = " + mapContainer.get(1));
    }
}
