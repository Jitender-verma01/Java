import java.util.Scanner;

public class linledlist {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        linledlist linkedList = new linledlist();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers to add to the linked list (type 'exit' to stop):");

        while (sc.hasNextInt()) {
            int data = sc.nextInt();
            linkedList.add(data);
        }

        System.out.println("The linked list is:");
        linkedList.display();
    }
}
