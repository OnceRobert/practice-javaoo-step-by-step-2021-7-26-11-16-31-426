package practice07;


public class Student extends Person {
    private int klass;
    public Student(int ID, String name, int age, Klass klass){
        super(ID, name,age);
        this.klass = klass.getNumber();
    }

    public String introduce(){
        return super.introduce() + " I am a Student. I am at Class " + klass + ".";
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }
}