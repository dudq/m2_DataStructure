package my_linked_list;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("TEST------------------------");
        MyLinkedList linkedList = new MyLinkedList(10);

        linkedList.addFirst(11);
        linkedList.addFirst(12);
        linkedList.addFirst(13);

        linkedList.add(4, 8);
        linkedList.add(4, 9);

        linkedList.printList();
    }
}
