package kotlin_Java_Interop.getSet;

public class Creator {
    public static void main(String[] args) {

        System.out.println("Let's create something!");
        Man adam = new Man();
        Woman Eve = new Woman();

        //For using kotlin code in java file we need to specify the line in kotlin file with
        //annotations like @JvmField so that the function remains public and kotlin doesn't
        //convert that automatically to private method
        adam.name = "Adam";
        Eve.name = "Eve";
    }
}
