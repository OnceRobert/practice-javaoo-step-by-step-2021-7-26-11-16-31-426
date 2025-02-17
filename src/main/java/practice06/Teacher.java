package practice06;

public class Teacher extends Person {
    public Klass klass;

    public Teacher(String name, int age, Klass klass){
        super(name,age);
        this.klass = klass;
    }

    public Teacher(String name, int age){
        super(name,age);

    }

    public Klass getKlass() {
        return klass;
    }
//
//    public void setKlass(int klass) {
//        this.klass = klass;
//    }

    public String introduce(){
        if(klass!=null)
            return super.introduce() + " I am a Teacher. I teach "+klass.getDisplayName()+".";
        else
            return super.introduce() + " I am a Teacher. I teach No Class.";

    }

    public String introduceWith(Student student){
        String introduction = super.introduce();
        if(student.getKlass().getNumber()==klass.getNumber())
            return String.format("%s I am a Teacher. I teach %s.",introduction,student.getName());
        else
            return String.format("%s I am a Teacher. I don't teach %s.",introduction,student.getName());
    }
}