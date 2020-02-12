import java.util.LinkedList;

public class Stack<E> {
     Node head;

     class Node {

        E data;
        Node next;


        Node(E d) {
            data = d;
            next = null;
        }
    }

    public Stack insert(Stack list, E data) {

        Node new_node = new Node(data);
        new_node.next = null;


        if (list.head == null) {
            list.head = new_node;
        } else {

            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }


            last.next = new_node;
        }

        return list;
    }

    public void printList(Stack list) {
        Node currNode = list.head;

        System.out.print("Stack: ");


        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

     Node removeLastNode()
    {
        if (head == null)
            return null;

        if (head.next == null) {
            return null;
        }


        Node second_last = head;
        while (second_last.next.next != null)
            second_last = second_last.next;


        second_last.next = null;

        return head;
    }


}


