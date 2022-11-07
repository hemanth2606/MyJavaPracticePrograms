package dataStructure;

public class StackDA {
    protected int[] data;
    int top= -1;
    private static final int DEFAULT_SIZE  =10;
    public StackDA(){
        this(DEFAULT_SIZE);
    }

    public StackDA(int size) {
        this.data = new int[size];
    }
    public boolean push(int item)
    {
        if (isFull())
        {
            System.out.println("Stack is full");
        }
        top++;
        data[top] = item;
        return true;
    }

    private boolean isFull() {
        return top == data.length-1;
    }
    private boolean isEmpty() {
        return top == -1;
    }

    public int pop() throws stackException
    {
        if (isEmpty())
        {
            throw new stackException("Cannot pop from an empty stack!!");
        }
        return data[top--];
    }
    public int peek() throws Exception {
        if (isEmpty())
        {
            throw new Exception("Cannot pop from an empty stack!!");
        }
        int item  = data[top];
        return item;
    }

    public void display(){
        for (int i = 0 ;i<=top ; i++)
        {
            System.out.print(data[i]+"\n_________\n");
        }
    }


}
