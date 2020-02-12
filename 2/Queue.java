public class Queue {

        static Node head;

        static class Node {

            int data;
            Node next;


            Node(int d) {
                data = d;
                next = null;
            }
        }

        public static Queue insert(Queue list, int data) {

            Node new_node = new Node(data);
            new_node.next = head;
            head = new_node;



            return list;
        }

        public static void printList(Queue list) {
            Node currNode = list.head;

            System.out.print("Queue: ");
//            System.out.println(currNode.data);
//            System.out.println(currNode.next.data);

            while (currNode != null) {
                System.out.print(currNode.data + " ");
                currNode = currNode.next;
            }
        }

        static Node removeLastNode(Node head)
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

        public static void main(String[] args) {
            Queue list = new Queue();

            list.insert(list, 6);
            list.insert(list, 7);
            list.insert(list, 8);
            removeLastNode(head);
            printList(list);


        }
    }




