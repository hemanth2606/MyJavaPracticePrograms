package oops;


import java.util.Arrays;
import java.util.List;
public class CustomArrayList<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;
    public CustomArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if (isFull())
        {resize();}
        data[size++] = num;
    }

    private void resize() {
        Object[] temp  = new Object[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    public T remove()
    {
        T removed  = (T)data[--size];
        return removed;
    }
    public int size(){
        return size;
    }
    public T add(int index , T value){
        if (data.length<=index){
            return null;
        }
        this.data[index]  = value;
        size++;
        return value;
    }
    public T get(int index)
    {
        return (T)data[index];

    }
    public void getList(List<? extends Number>list)
    {
        // this is wild card
        //do something
        //here you can only pass Number type
    }
    private boolean isFull() {
        return size==data.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(data) + " :size=  "+ size;
    }

    public static void main(String[] args) {
       CustomArrayList<Integer> c = new CustomArrayList<>();
       c.add(4);
       c.add(43);
       c.add(5);
        System.out.println(c.add(10,3));
        System.out.println(c);
        c.remove();
        System.out.println(c);
        System.out.println(c.get(5));
    }

}
