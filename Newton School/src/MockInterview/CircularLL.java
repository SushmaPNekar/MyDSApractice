package MockInterview;

import java.util.Scanner;

public class CircularLL {
    public static void main(String[] args) {
        Node head;
        Node last;
        head = new Node();
        head.val = 12;
        Node temp = head;
        head.next = temp;
        last = new Node();


        last = insertElements(head);
        last = insertElements(last);
        last = insertElements(last);
        last = insertElements(last);

        Node temp1 = last.next;

        do{
            System.out.print(temp1.val+" ");
            temp1 = temp1.next;
        }
        while(temp1 != last.next);


    }

    public static class Node{
        private Node next;
        private int val;
    }

    private static Node insertElements(Node last){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Node oldLast = last;

        Node newNode = new Node();
        newNode.val = num;

        Node First = last.next;
        newNode.next = First;
        oldLast.next =newNode;
        last = newNode;
        return last;
    }
}
