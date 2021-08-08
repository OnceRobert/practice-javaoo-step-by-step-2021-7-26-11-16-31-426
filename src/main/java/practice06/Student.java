package practice06;

import practice03.Person;

public class Student extends Person {
    private Klass klass;
    public Student(String name, int age, Klass klass){
        super(name,age);
        this.klass = klass;
    }

    public String introduce(){
        return super.introduce() + " I am a Student. I am at Class " + klass.getNumber() + ".";
    }

    public Klass getKlass() {
        return klass;
    }

//    public void setKlass(int klass) {
//        this.klass = klass;
//    }
}