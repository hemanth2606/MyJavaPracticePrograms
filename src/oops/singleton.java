package oops;

import org.jetbrains.annotations.ApiStatus;

public class singleton {
    private singleton(){
        super();

    }
    private static singleton instance;
    public static singleton getInstance(){
        if (instance==null)
            instance = new singleton();
        return instance;
    }
}
