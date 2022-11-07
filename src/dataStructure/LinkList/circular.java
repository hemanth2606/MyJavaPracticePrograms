package dataStructure.LinkList;

public class circular {
    private Node head;
    private Node tail;
    private int size = 0;
    public void insertFirst(int value){
        Node node = new Node(value);
        if (tail==null&&head==null)
        {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next  = head;
        tail  =node;
        size++;
    }
    public void insertRear(int value){
        Node node = new Node(value);
        if (tail==null&&head==null)
        {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next=head;
        head = node;
        size++;
    }
    public void display(){
          Node temp = head;
//        while (temp != tail){
//            System.out.print(temp.value+" -> ");
//            temp= temp.next;
//        }
//        System.out.print(temp.value+" -> ");
//        System.out.print("END");
//        System.out.println();
        if (head!= null)
        {
            do {
                System.out.print(temp.value+" -> ");
                temp = temp.next;
            }while (temp!=head);
        }
        System.out.println("HEAD");

    }
    public int deleteFirst(){
        int value = head.value;
        if (head ==null)
        {
            System.out.println("list is empty");
            return -1;
        }
        if (head.next == tail)
        {
            head = null;
            tail = null;
        }
        head = head.next;
        tail.next = head;
        size--;
        return value;
    }
    public void insert(int index,int value)
    {
        Node node = new Node(value);
        if (head==null)
        {
            head=node;
            tail=node;
            return;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        node.next=temp.next;
        temp.next = node;
    }
    public int delete(int val){
        Node node = head;
        int value = head.value;
        if (node ==null)
        {
            System.out.println("list is empty");
            return -1;
        }
        if (node.value == val)
        {
            head = head.next;
            tail.next = head;
            return node.value;
        }
       do {
           Node n = node.next;
           if (n.value == val){
               node.next = n.next;
               break;
           }
           node= node.next;
       }while (node!=head);
        size--;
        return -1;
    }
    private class Node{
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
