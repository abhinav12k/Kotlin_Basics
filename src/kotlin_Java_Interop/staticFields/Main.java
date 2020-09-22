package kotlin_Java_Interop.staticFields;

public class Main {
    public static void main(String[] args) {

        System.out.println(new Human("Adam",18,"male"));
        System.out.println(Human.STANDARD_MALE);

        /**USING KOTLIN CODE**/
        System.out.println(new Person("Adam",18,"male"));
        System.out.println(Person.STANDARD_FEMALE);

    }
}
