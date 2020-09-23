package kotlin_Java_Interop.keywords;

public class Main {

    public static void main(String[] args) {

        Person p = new Person();
        p.when("angry").shout("What is Happening!");
        p.when("happy").say("This is awesome!!!");

        p.setMood("angry");
        p.setMood("happy");

    }
}
