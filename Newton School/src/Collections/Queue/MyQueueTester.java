package Collections.Queue;

import java.util.Iterator;

public class MyQueueTester {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue= new MyQueue<Integer>();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        System.out.println("size : " + myQueue.getSize()  );

        Integer removedEl =  myQueue.dequeue();
        System.out.println(  " Removed Element "+removedEl);
        System.out.println("size : " + myQueue.getSize()  );

        Integer peekEl = myQueue.peek();
        System.out.println("Peek element: " + peekEl);

        Iterator myIter = myQueue.iterator();
        System.out.println("Elements in queue are : ");

        while(myIter.hasNext()){
            System.out.println(myIter.next());
        }



    }
}
