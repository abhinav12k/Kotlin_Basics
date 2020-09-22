package kotlin_Java_Interop.staticFields;

public class Human {
    String name;
    int age;
    String gender;

    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static final Human STANDARD_MALE = new Human("John Doe",18,"male");
    public static final Human STANDARD_FEMALE = new Human("Jane Doe",18,"female");

}
