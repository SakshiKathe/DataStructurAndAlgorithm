//Swapping Nodes in a linked list

package LinkedList;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class Ass3 {
    Node head;

    public void swapNode(int x, int y) {
        if (x == y) {
            return;
        }

        Node prevX = null, currX = head;
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        Node prevY = null, currY = head;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        if (currX == null || currY == null) {
            return;
        }
        if (prevX != null) {
            prevX.next = currY;
        } else {
            head = currX;
        }

        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

    public void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        Node tNode = head;
        while (tNode != null) {
            System.out.print(tNode.data + " ");
            tNode = tNode.next;
        }
    }

    public static void main(String[] args) {
        Ass3 list = new Ass3();

        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
        System.out.print("\n Linked list before ");
        list.printList();

        list.swapNode(2, 4);
        System.out.print("\n Linked list after ");
        list.printList();
    }
}
