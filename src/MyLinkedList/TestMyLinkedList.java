package MyLinkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList(0);
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);

        ll.add(2,100);
//        ll.add(4,9);
        ll.printList();
    }
}
