package practice07;

public class Person {
    private int ID;
    private String name;
    private int age;
    public Person(int ID, String name, int age) {
        this.ID = ID;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce(){
        return "My name is "+ name +". I am "+ age +" years old.";
    }

}