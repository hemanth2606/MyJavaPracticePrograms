package cloning;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{12,3,4,5,5};
    }

//    public Human(Human other) {
//        this.age = other.age;
//        this.name = other.name;
//        int[] arr = {12,3,4,5,5};
//    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        //this is shallow copy
//        //it is not copy for the object
//        //only for the premitive it will copy
//        return super.clone();
//    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Human twins=  (Human)super.clone();
        //make a deep copy
        twins.arr = new int[twins.arr.length];
        for (int i = 0; i < twins.arr.length; i++) {
            twins.arr[i] = this.arr[i];
        }
        return twins;
    }
}
