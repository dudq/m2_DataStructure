package my_array_list_2;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        System.out.println("-------------ArrayList");
        arrayList.printList();
//        System.out.println("\n-----------------Insert");
//        arrayList.add(0,5);
//        arrayList.printList();

//        System.out.println("\n--------------Remove");
//        arrayList.remove(0);
//        arrayList.printList();

//        System.out.println("\n------------------Contains");
//        int testContain =5;
//        System.out.println("array list "
//                + (arrayList.contains(testContain)?"contain ":"not contain ")+testContain);

//        System.out.println("\n---------------Clone");
//        MyArrayList cloneArrayList = arrayList.clone();
//        cloneArrayList.printList();
//        System.out.println("\n--------Array change");
//        arrayList.add(4,5);
//        arrayList.printList();
//        System.out.println("\n------------Clone array now");
//        cloneArrayList.printList();

//        int testIndex = 2;
//        System.out.println("index of "+testIndex+": "+arrayList.indexOf(testIndex));

        System.out.println("\n------------Clear");
        arrayList.clear();
        arrayList.printList();

    }
}
