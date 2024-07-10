public class linkedlist {
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

    public Node head;
    public Node tail;
    public int size;

    // Add first
    public void addFirst(int data) {
        // Create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add last
    public void addLast(int data) {
        // Create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Print the linked list
    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Add to the middle
    public void add(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove First
    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty ");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // Remove last
    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty ");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // previous : i = size - 2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // Remove at any position
    public int removeAtAny(int index) {
        if (size == 0) {
            System.out.println("LL is empty ");
            return Integer.MIN_VALUE;
        } else if (index == 0) {
            return removeFirst();
        } else if (index >= size) {
            System.out.println("Index out of bounds");
            return Integer.MIN_VALUE;
        }
        Node prev = head;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    // Search value
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        // key is empty
        return -1;
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        
        System.out.println("The linkedList is : ");
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.add(2, 6);
        ll.print();  // 1 -> 2 -> 3 -> 3 -> 5 -> 6 -> 7 -> null
        
        System.out.println("After removing First element : ");
        ll.removeFirst();
        ll.print();
        
        System.out.println("After removing Last element : ");
        ll.removeLast();
        ll.print();

        System.out.println("After removing element at index 2: ");
        ll.removeAtAny(2);
        ll.print();

        System.out.println("The size of ll is: " + ll.size);

        System.out.println("Element is present at index: " + ll.itrSearch(3));
        System.out.println("Search for element 10: " + ll.itrSearch(10));
    }
}
