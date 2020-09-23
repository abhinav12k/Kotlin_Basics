package kotlin_Java_Interop.statics;

public class Main {
    public static void main(String[] args) {

        System.out.println("For 10 people to travel 100 kms we need");
        System.out.println(Vehicle.createFor(10,100));

        System.out.println("For 1 people to travel 8 kms we need");
        System.out.println(Vehicle.createFor(1,8));

        /****Using Kotlin Code***/

        //Kotlin Doesn't create static functions when we use companion object rather it creates
        //a companion class inside the parent class which is accessed in java by first referencing to
        //Companion class and then to the function inside it THIS CAN BE AVOIDED BY USING
        //JvmStatic annotation in Kotlin code to make the function inside companion object as static

        System.out.println("For 10 people to travel 100 kms we need");
        System.out.println(Automobile.Companion.createFor(10,100));

        System.out.println("For 1 people to travel 8 kms we need");
        System.out.println(Automobile.createFor(1,8));
    }
}
