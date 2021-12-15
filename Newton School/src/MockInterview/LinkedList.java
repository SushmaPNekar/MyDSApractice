package MockInterview;

public class LinkedList {
    public static void main(String[] args) {
        Node head;

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node((3));
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node((5));

        head = deleteATIndex(head,2);

        while(head != null){
            System.out.print(head.val+ " ");
            head = head.next;
        }
    }

    // 1 2 3 4 5
    private static Node deleteATIndex(Node head, int index){
        Node temp = head;
       // int len = 1;
       /* while(temp.next != null){
            temp = temp.next;
            len++;

        }*/

        int tempIndex = 1;



        while (tempIndex < index){
            temp = temp.next;
            tempIndex++;
        }

        temp.next = temp.next.next;

        return head;
    }


    public static class Node{
        private Node next;
        private int val;
        Node(int val){
            this.val =val;
        }
    }
}
