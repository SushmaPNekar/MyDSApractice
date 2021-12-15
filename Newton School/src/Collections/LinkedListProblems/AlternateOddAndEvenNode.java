package Collections.LinkedListProblems;

import java.util.Stack;

public class AlternateOddAndEvenNode {
    public static void main(String[] args) {
        AlternateOddAndEvenNode m = new AlternateOddAndEvenNode();
        Node head = null;
        head = addElements(head,1);
        head = addElements(head,2);
        head = addElements(head,3);
        head = addElements(head,5);
        head = addElements(head,6);
        head = addElements(head,7);
        head = addElements(head,8);
        head = addElements(head,9);
        head = addElements(head,10);
        head = addElements(head,11);
        head = addElements(head,12);
        head = addElements(head,13);
        head = addElements(head,14);
     //   head = addElements(head,15);



        System.out.println("Before");
        printEl(head);
        System.out.println();
        System.out.println("After");
        head = rearrangeOddANdEven(head);
        printEl(head);

        // 1 2 3 6 5 8 7
        // 1 2 3 6 5 8 7


    }

    private static void printEl(Node head){
        while(head != null){
            System.out.print(head.val+" ");
            head = head.next;

        }
    }

    private  static  Node createNewLinkedList(Node head,int i, int val){
        Node newNode = new Node(val);
        if(head == null && i == 1){

            head = newNode;
            return head;
        }
        Node temp = head;
        newNode.next = head;
        head = newNode;


        return head;
    }

    private static Node rearrangeOddANdEven(Node head){
        Stack odd = new Stack();
        Stack even = new Stack();
        int len = 1;
        int i = 1;


        while(head != null){
            int val = head.val;
            if(val % 2 == 0){
                even.push(val);
            }else{
                odd.push(val);
            }
            len++;
            head = head.next;
        }
        Node newNode = null;

        while(i < len){
            if(i % 2 == 0){
                int val = (int) even.peek();
                even.pop();
                newNode = createNewLinkedList(newNode,i,val);

            }else{
                int val = (int) odd.peek();
                odd.pop();
                newNode = createNewLinkedList(newNode,i,val);
            }

            i++;
        }
        return  newNode;
    }

    private static Node addElements(Node head, int val){
        Node newNode = new Node(val);
        if(head == null){

            head = newNode;
            return head;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;

    }


    public static class Node{
        private Node next;
        private int val;

        Node(int val){
            this.val= val;
            this.next = null;
        }
    }
}
