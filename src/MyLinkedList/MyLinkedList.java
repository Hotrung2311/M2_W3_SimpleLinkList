package MyLinkedList;

import javafx.scene.Node;

import java.io.ObjectStreamClass;

public class MyLinkedList {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data){
        head = new Node(data);
    }

    public void add(int index, Object data){
        // Lưu node đầu tiên vào biến trung gian temp
        Node temp = head;

        // Khai báo 1 biến holder có kiểu node
        Node holder;

        // Duyệt mảng từ chỉ số đầu tiên đến vị trí trước chỉ số add và node sau không phải là node cuối cùng
        for (int i = 0; i < index - 1 && temp.next != null; i++){
            // Gán node i = node i+1
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
    public Node get(int index){
        Node temp=head;
        for(int i=0; i<index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data){
            this.data = data;
        }
        public Object getData(){
            return this.data;
        }
    }
}
