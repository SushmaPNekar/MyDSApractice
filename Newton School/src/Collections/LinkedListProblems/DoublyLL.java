package Collections.LinkedListProblems;

public  class DoublyLL {
    private static Node head;

    public static void main(String[] args) {


        DoublyLL doublyLl = new DoublyLL();
        doublyLl.head = addAthead(head,1);
        doublyLl.head = addAthead(head,2);
        Node head3 = addAthead(head,3);
        head = addAthead(head3,4);
        doublyLl.addAfterNode(head.next.next,5);
       // print();
      head = deleteElement(head,1);
        print();

    }

    private static void print(){
        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }

    }
    public static Node deleteElement(Node head,int k) {
        if(head == null){
            return null;

        }

        Node temp = head;
        int len = 0;

        while(temp != null){
            temp = temp.next;
            len++;
        }
        temp = head;
        int index = len - k ;

        if(index == 0){
            head = head.next;
            head.prev = null;





        }
        else if(index == len){
            Node temp1 = head;
            while(temp1.next != null){
                temp1 = temp1.next;
            }
            //temp1 = null;
            temp1.prev.next = null;

        }
        else{

            int tempIndex = 0;
            while(tempIndex < index){
                temp = temp.next;
                tempIndex++;
            }

            temp.prev.next = temp.next;


            if(temp.next != null){
                temp.next.prev = temp.prev;
            }
        }



        return head;
//enter your code here
    }


    private static Node addAthead(Node head,int val){
        Node newNode = new Node(val);
        if(head == null){
            newNode.prev = null;
            newNode.next = null;
            return newNode;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;

        return head;
    }

    private static void addAfterNode(Node prevNode,int val){
        Node newNode = new Node(val);
        if(prevNode == null){
            addAthead(prevNode,val);
        }
        newNode.next = prevNode.next;

        newNode.prev = prevNode;
        prevNode.next = newNode;

        if(newNode.next != null){
            newNode.next.prev = newNode;
        }





    }

    static class Node{
        private Node next;
        private Node prev;
        private int val;
        Node(int val){
            this.val = val;
        }
    }
}
