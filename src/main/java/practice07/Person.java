package practice07;

import java.util.Objects;

public class Person {
    public int ID;  //Variable names
    public String name;
    public int age;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;      //use instanceOf
        Person person = (Person) o;
        return ID == person.ID && age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name, age);
    }

}