package my_linked_list_2;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(1);
        linkedList.add('a');
        linkedList.add(3.0f);
        linkedList.add("So 4");
//        System.out.println(linkedList.getSize());
//        linkedList.printList();
//
//        System.out.println("--------------Insert");
//        linkedList.add(0,2);
//        System.out.println(linkedList.getSize());
//        linkedList.printList();

        System.out.println("-------------Remove");
        Integer test = 1;
        System.out.println("Remove: " + linkedList.remove(test));
        linkedList.printList();
    }
}
