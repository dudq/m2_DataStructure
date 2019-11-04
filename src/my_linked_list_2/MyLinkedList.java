package my_linked_list_2;

public class MyLinkedList<E> {
    private int size = 0;
    private Node head;
    private Node<E> tail;

    public MyLinkedList() {
    }

    public int getSize() {
        return size;
    }

    public void printList() {
        Node temp = this.head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.next;
        }
    }

    public void addFirst(E element) {
        Node temp = this.head;
        this.head = new Node(element);
        this.head.next = temp;
        this.size++;
    }

    public void add(E element) {
        Node temp = this.head;
        Node last = new Node(element);
        if (this.size == 0) addFirst(element);
        else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = last;
            this.size++;
        }
    }

    public void add(int index, E element) {

        Node holder;
        checkOutOfBound(index);
        if (index == 0) addFirst(element);
        else {
            Node temp = getNode(index);
            holder = temp.next;
            temp.next = new Node(element);
            temp.next.next = holder;
            this.size++;
        }
    }

    private void checkOutOfBound(int index) {
        if (index < 0 || index > this.size)
            throw new IndexOutOfBoundsException(" Index: " + index + " out of bounds");
    }

    public Node getNode(int index) {
        Node temp = this.head;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public Node removeFirst() {
        Node temp = this.head;
        if (this.head != null)
            this.head = this.head.next;
        return temp;
    }

    public Node remove(int index) {
        checkOutOfBound(index);
        Node removed;
        if (index == 0) removed = removeFirst();
        else {
            Node temp = getNode(index);
            removed = temp.next;
            if (index < size)
                temp.next = temp.next.next;
        }
        this.size--;
        return removed;
    }

    public boolean remove(E element) {
        Node temp = this.head;
        if (element.equals(temp.getData())) {
            removeFirst();
            return true;
        } else {
            while (temp.next != null) {
                if (element.equals(temp.next.getData())) {
                    temp.next = temp.next.next;
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }

//    public boolean isContain (E element) {
//        Node temp = this.head;
//        while (temp.next != null) {
//            if (temp.data.equals(element) )
//                return true;
//        }
//        return false;
//    }

    class Node<E> {
        Node<E> next;
        E data;

        Node(E data) {
            this.data = data;
        }

        public E getData() {
            return this.data;
        }
    }
}
