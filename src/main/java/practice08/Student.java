package practice08;

public class Student extends Person {
    private Klass klass;
    public Student(int ID, String name, int age, Klass klass){
        super(ID, name,age);
        this.klass = klass;
    }

    public String introduce(){
        return super.introduce() + " I am a Student. I am at Class " + klass.getNumber() + ".";
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

}