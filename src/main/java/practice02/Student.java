package practice02;

import practice01.Person;

public class Student extends Person {
    public int klass;
    public Student(String name, int age, int klass){
        super(name,age);
        this.klass = klass;
    }

    public String introduce(){
        return "I am a Student. I am at Class " + klass + ".";
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }
}
