package dataStructure.LinkList;

public class singleLinkList {
    public static void main(String[] args) {
//        dataStructure.LinkList list = new dataStructure.LinkList();
//        list.insertFirst(12);
//        list.insertFirst(32);
//        list.insertFirst(42);
//        list.insertFirst(52);
//        list.insertFirst(62);
//        list.insertRear(0);
//        list.display();
//        System.out.println(list.size());
//        System.out.println(list.delete(2));
//        list.display();
//        System.out.println(list.find(0));
//        System.out.println(list.size());
//        DoubleLL DLL = new DoubleLL();
//        DLL.insertFirst(12);
//        DLL.insertFirst(32);
//        DLL.insertFirst(42);
//        DLL.insertFirst(52);
//        DLL.insertFirst(62);
//        DLL.insertFirst(12);
//        DLL.insertFirst(92);
////        DLL.display();
////        DLL.displayRev();
////        DLL.insertRear(43);
////        DLL.insertRear(32);
//        DLL.display();
//        DLL.insert(21,5);
//        DLL.display();
//        System.out.println(DLL.deleteRear());
//        System.out.println(DLL.deleteRear());
//        System.out.println(DLL.deleteRear());
//        DLL.display();
//        DLL.displayRev();
//        System.out.println(DLL.find(2));
        circular cll = new circular();
        cll.insertRear(34);
        cll.insertRear(43);
        cll.insertRear(100);
        cll.insertRear(32);
        cll.insertRear(54);
        cll.display();
        cll.insert(3,355);
        cll.insert(4,2);
        cll.insertRear(32);
        cll.insertRear(33);
        cll.display();
        cll.delete(2);
        cll.display();


    }
}
