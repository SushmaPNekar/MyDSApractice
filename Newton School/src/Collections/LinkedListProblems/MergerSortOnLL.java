package Collections.LinkedListProblems;

public class MergerSortOnLL {
    public static void main(String[] args) {
        Node head = null;
        head = addEl(head,1);
        head = addEl(head,2);
        head = addEl(head,7);
        head = addEl(head,3);
        head = addEl(head,8);
        head = addEl(head,5);
        head = addEl(head,6);
        head = addEl(head,4);


        printEl(head);
        Node mid = findingMid(head);
        System.out.println();
        head= mergeSort(head);
        printEl(head);
      //  System.out.println("MIddle element is " + mid.val);
    }

    private static void printEl(Node head){
        while (head != null){
            System.out.print(head.val+" ");
            head = head.next;
        }
    }
    private static Node mergeSort(Node head){

        if(head.next == null){
            return head;
        }
// 1 2 7 3 8 5 6 4
        Node mid = findingMid(head);
        Node head2 = mid.next;
        mid.next = null;

        Node newHead1 = mergeSort(head);
        Node newHead2 = mergeSort(head2);
        return merge(newHead1,newHead2);

    }
    private static Node merge(Node h1, Node h2){
        Node merged = new Node(-1);
        Node temp = merged;

        while (h1!= null && h2 != null){
            if(h1.val < h2.val){
                temp.next = h1;
                h1 = h1.next;
            }
            else{
                temp.next = h2;
                h2= h2.next;
            }
            temp = temp.next;
        }

        while(h1 != null){
            temp.next = h1;
            h1 = h1.next;
            temp = temp.next;
        }
        while(h2 != null){
            temp.next = h2;
            h2 = h2.next;
            temp = temp.next;
        }
        return merged.next;
    }


      // 1 2 3 4
    private static Node findingMid(Node head){
        Node slow= head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }



    private static Node addEl(Node head,int val){
        Node newNode =  new Node(val);
        if(head == null){
            head = newNode;
            return head;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }

        temp.next=newNode;
        return head;
    }

    public static class Node{
        private Node next;
        private int val;
        Node(int val){
            this.val = val;
            this.next= null;
        }
    }
}
