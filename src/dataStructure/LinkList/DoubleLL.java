package dataStructure.LinkList;

public class DoubleLL {
    private Node head;
    private Node tail;
   public int size;
    public void insertFirst(int val)
    {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head!=null)
        {
            head.prev = node;
        }
        if (tail==null){
            tail = head;
        }
        head=node;
        size++;
    }
    public void insertRear(int val)
    {
        Node node = new Node(val);
        node.next = null;
        if (head==null)
        {
            insertFirst(val);
            return;
        }
        if (tail==null){
            tail = head;
        }
        tail.next =node;
        node.prev = tail;
        tail = node;
        size++;
    }
    public void insert(int value,int index)
    {
        if (index==0)
        {
            insertFirst(value);
            return;
        }
        if (index==size)
        {
            insertRear(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
       Node node = new Node(value);
        node.next = temp.next;
        temp.next = node;
        node.prev = temp;
        node.next.prev = node;
        size+=1;

    }
    public int find(int Value){
        Node node = head;
        int count = 0;
        while (node!=null)
        {
            if (node.value== Value)
            {
                System.out.printf("The element %d found at %d\n",node.value, count);
                return count;
            }
            node  = node.next;
            count++;
        }
        System.out.print("the element was not found\n");
        return -1;
    }
    public int deleteFront(){
        if (head==null)
        {
            return -1;
        }
        int value = head.value;
        head = head.next;
        head.prev = null;
        if (tail==null)
        {
            tail=head;
        }
        size-=1;
        return value;
    }
    public int deleteRear(){
        if (head==null)
        {
            return -1;
        }
        int value = tail.value;
        if (head.next==null)
        {
            head=null;
            tail=null;
            size-=1;
            return value;
        }
        tail=tail.prev;
        tail.next=null;
        size-=1;
        return value;

    }
    public Node getNode(int index)
    {
        Node node  = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public void display(){
        Node temp  = head;
        if (head==null)
        {
            return;
        }
        while (temp!=null)
        {
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }

        System.out.println("END\n");
    }
    public void displayRev(){
        Node temp  =  tail;

        while (temp!=null)
        {
            System.out.print(temp.value+" -> ");
            temp = temp.prev;
        }
        System.out.print("START\n");
    }
    private class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
