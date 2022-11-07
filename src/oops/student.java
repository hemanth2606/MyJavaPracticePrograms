package oops;

import org.jetbrains.annotations.NotNull;

public class student implements Comparable<student>{
    int rollNo;
    float mark;

    public student(int rollNo, float mark) {
        this.rollNo = rollNo;
        this.mark = mark;
    }
    @Override
    public int compareTo(@NotNull student o) {
        int diff = (int)(this.mark - o.mark);
        return diff;
    }

    public static void main(String[] args) {
        student s =new student(13,32.1f);
        student s1 = new student(100,343.1f);
        if (s.compareTo(s1)<0)
        {
            System.out.println(s.compareTo(s1));
            System.out.println("s1 has mark marks");
        }
    }

}
