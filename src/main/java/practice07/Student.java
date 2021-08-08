package practice07;


public class Student extends Person {
    private Klass klass;
    public Student(int ID, String name, int age, Klass klass){
        super(ID, name,age);
        this.klass = klass;
    }

    public String introduce(){
        String introduction = super.introduce() + " I am a Student. ";
        if(this.klass.getLeader()==this)
            return introduction + "I am Leader of Class " + klass.getNumber()+".";
        else
            return introduction + "I am at Class " + klass.getNumber() + ".";
    }

    public Klass getKlass() {
        return klass;
    }
}