package DoublyLinkedList;

public class DoublyLL {
    public class Node {
        int data = 0;
        Node next;
        Node prev; 

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //add
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = new Node(data);
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //print
    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "<-");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //remove - last
    public int removeFirst() {
        if(head == null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;

        return val;
    }

    //add - last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    //remove - last
    public int removeLast() {
        if(head == null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }

        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;

        return val;
    }

    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(4);
        System.out.println(dll.removeLast());

        dll.print();
        System.out.println(dll.size);
    }
}
