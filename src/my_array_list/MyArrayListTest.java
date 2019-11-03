package my_array_list;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> listInteger = new MyArrayList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);

        System.out.println("Element 4: " + listInteger.get(3));

        listInteger.get(-1);
        System.out.println("Element 5: " + listInteger.get(-1));
    }
}
