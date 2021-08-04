package practice06;

import practice05.Person;

public class Teacher extends Person {
    public int klass;

    public Teacher(String name, int age, Klass klass){
        super(name,age);
        this.klass = klass.getNumber();
    }

    public Teacher(String name, int age){
        super(name,age);
        klass = 0;
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public String introduce(){
        if(klass==0)
            return super.introduce() + " I am a Teacher. I teach No Class.";
        else
            return super.introduce() + " I am a Teacher. I teach class "+klass+".";
    }

    public String introduceWith(Student student){
        String introduction = super.introduce();
        if(student.getKlass()==this.klass)
            return String.format("%s I am a Teacher. I teach %s",introduction,student.getName());
        else
            return String.format("%s I am a Teacher. I don't teach %s",introduction,student.getName());
    }
}