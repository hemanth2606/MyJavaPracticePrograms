package collection;

public class enums {
    enum Week{
        Monday, Tuesday,Wednesday,Thursday,Friday,Saturday,sunday;
        //this are enums constants
        // public ,static and final;
        //since its final you can create child enums
        // type is week
        Week(){
            System.out.println("Constructor called for "+this);
        }
        //this is not public or protected,only private or default;
        //why? we don't want to create new objects
        // this is not the enums concepts ,thats why
        //internally:public static final week Monday == new week();
        //it can implements the interface and can't extends classes
    }

    public static void main(String[] args) {
        Week weeks = Week.Thursday;
//        for (Week day: Week.values()) {
//            System.out.println(day);
//
//        }
        System.out.println(weeks.ordinal());

    }

}
