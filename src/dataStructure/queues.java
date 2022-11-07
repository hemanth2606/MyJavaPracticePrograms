package dataStructure;

import javax.swing.text.LayoutQueue;

public class queues {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = - 1;
    public queues(){
        this.data = new int[DEFAULT_SIZE];
    }
    public queues(int size){
        this.data = new int[size];
    }
    private boolean isFull() {
        return end == data.length-1;
    }
    private boolean isEmpty() {
        return end == -1;
    }
    public boolean insert(int value){
       if (isFull())
       {
           return false;
       }
       data[++end] = value;
       return true;
    }
    public int delete() {
        if (isEmpty()) {
            return -1;
        }
        int removed = data[0];
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        --end;
        return removed;
    }
    public void display(){
        if (isEmpty()){
            System.out.println("queue is empty");
        }
        for (int i = 0;i<=end;i++){
            System.out.print(data[i]+"|");
        }
        System.out.println();
    }

}
