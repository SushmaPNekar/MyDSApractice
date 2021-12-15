package Collections.Queue;

public class MyArrayBasedQueue {
    private Integer[] queueArray;
    private int queueSize;
    private int headIndex ;

    public MyArrayBasedQueue(int size){
        this.queueArray = new Integer[size];
        this.queueSize = 0;
        this.headIndex = 0;
    }



    public void enqueue(Integer value){
        queueArray[queueSize] = value;
        this.queueSize++;

    }

    public Integer dequeue(){
        Integer retVal = queueArray[headIndex] ;

        this.queueSize--;
        if(queueSize == 0){
            this.headIndex= 0;
        }else{
            this.headIndex++;
        }

        if(this.headIndex % 10 == 0){
            reclaimSLots();
        }
        return retVal;
    }

    public void reclaimSLots(){
        int loopEnd = this.headIndex + this.queueSize -1;
        for(int i = this.headIndex;i<= loopEnd;i++){
            queueArray[i-this.headIndex] = queueArray[i];

        }
        this.headIndex = 0;
    }


    public Integer peek(){
        return queueArray[headIndex];
    }
}
