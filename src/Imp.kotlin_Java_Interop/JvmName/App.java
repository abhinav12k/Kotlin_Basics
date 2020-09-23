package kotlin_Java_Interop.JvmName;

public class App {

    public static void main(String[] args) {
        //Using kotlin function in a java file
        String greeting = Greet.greeter("Abhinav");
        System.out.println(greeting);
    }

}
