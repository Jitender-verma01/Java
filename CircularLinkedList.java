public class CircularLinkedList {
    // Node class
    public static class Node {
        int data;
        Node next;

        // Constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
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
            tail.next = head; // Make it circular
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head; // Update tail to point to new head
        }
        size++;
    }

    // Add last
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            tail.next = head; // Make it circular
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // Update tail to point to head
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
        temp.next = newNode;
        size++;
    }

    // Remove first
    public int removeFirst() {
        if (size == 0) {
            throw new RuntimeException("Circular linked list is empty");
        }
        int val = head.data;
        if (size == 1) {
            head = tail = null;
        } else {
            head = head.next;
            tail.next = head; // Update tail to point to new head
        }
        size--;
        return val;
    }

    // Remove last
    public int removeLast() {
        if (size == 0) {
            throw new RuntimeException("Circular linked list is empty");
        }
        int val = tail.data;
        if (size == 1) {
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            tail = temp;
            tail.next = head; // Update tail to point to head
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
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = temp.next.next;
        size--;
        return val;
    }

    // Print the circular linked list
    public void print() {
        if (head == null) {
            System.out.println("Circular linked list is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(head)");
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        System.out.println("Adding elements at the beginning and end of the circular linked list:");
        cll.addFirst(2);
        cll.addFirst(1);
        cll.addLast(3);
        cll.addLast(4);
        cll.print();  // 1 -> 2 -> 3 -> 4 -> (head)

        System.out.println("Adding elements at specific positions:");
        cll.add(2, 5);
        cll.add(4, 6);
        cll.print();  // 1 -> 2 -> 5 -> 3 -> 6 -> 4 -> (head)

        System.out.println("Removing the first element:");
        cll.removeFirst();
        cll.print();  // 2 -> 5 -> 3 -> 6 -> 4 -> (head)

        System.out.println("Removing the last element:");
        cll.removeLast();
        cll.print();  // 2 -> 5 -> 3 -> 6 -> (head)

        System.out.println("Removing elements at specific positions:");
        cll.removeAt(1);
        cll.removeAt(2);
        cll.print();  // 2 -> 3 -> 6 -> (head)
    }
}
