public class DoublyLinkedList {
    // Node class
    public static class Node {
        int data;
        Node next;
        Node prev;

        // Constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    // Add first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // Add last
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // Add at specific index
    public void add(int index, int data) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size) {
            addLast(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
        size++;
    }

    // Remove first
    public int removeFirst() {
        if (size == 0) {
            throw new RuntimeException("Doubly linked list is empty");
        }
        int val = head.data;
        if (size == 1) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return val;
    }

    // Remove last
    public int removeLast() {
        if (size == 0) {
            throw new RuntimeException("Doubly linked list is empty");
        }
        int val = tail.data;
        if (size == 1) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return val;
    }

    // Remove at specific index
    public int removeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if (index == 0) {
            return removeFirst();
        }
        if (index == size - 1) {
            return removeLast();
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        int val = temp.data;
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        size--;
        return val;
    }

    // Print the doubly linked list
    public void print() {
        if (head == null) {
            System.out.println("Doubly linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        System.out.println("Adding elements at the beginning and end of the doubly linked list:");
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(3);
        dll.addLast(4);
        dll.print();  // 1 <-> 2 <-> 3 <-> 4 <-> null

        System.out.println("Adding elements at specific positions:");
        dll.add(2, 5);
        dll.add(4, 6);
        dll.print();  // 1 <-> 2 <-> 5 <-> 3 <-> 6 <-> 4 <-> null

        System.out.println("Removing the first element:");
        dll.removeFirst();
        dll.print();  // 2 <-> 5 <-> 3 <-> 6 <-> 4 <-> null

        System.out.println("Removing the last element:");
        dll.removeLast();
        dll.print();  // 2 <-> 5 <-> 3 <-> 6 <-> null

        System.out.println("Removing elements at specific positions:");
        dll.removeAt(1);
        dll.removeAt(2);
        dll.print();  // 2 <-> 3 <-> null
    }
}
