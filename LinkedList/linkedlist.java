package LinkedList;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }        
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        //step 1 =  create new node;
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
        }
        //step 2 - newNode next = head
        newNode.next = head; //link

        //step 3 - head = newNode;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx, int data) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while(i < idx-1) {
            temp = temp.next;
            i++; 
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print() {
        if(head == null) {
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }      
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.addFirst(1);
        l.addFirst(2);
        l.addLast(3);
        l.addLast(4);
        l.add(2,5);
        l.print(); 
    }
}
