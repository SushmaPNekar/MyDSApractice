package Collections.LinkedListProblems;

public class ReversingLL {

    public static void main(String[] args) {
        Node head ;
        head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fi = new Node(50);
        head.next = second;
        head.next.next = third;
        head.next.next.next = fourth;
        head.next.next.next.next = fi;
        /*while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }*/
        System.out.println("After reversing ");
        System.out.println( );

        head = reverseList(head,2);
        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }




    }

    private static Node reverseList(Node head , int k){
        Node prev = null;
        Node current = head;
        Node next = null;
        int count = 0;
    //  1 2 3 4
        while(current!= null && count < k){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;

        }
        if(next != null){
            head.next = reverseList(next,k);
        }
        head = prev;
        return  head;
    }

    public static class Node{
        private Node next;
        private int val;

        Node(int val){
            this.next = null;
            this.val = val;
        }
    }
}
