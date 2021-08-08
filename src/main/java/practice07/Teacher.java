package practice07;


public class Teacher extends Person {
    public Klass klass;
    public Teacher(int ID, String name, int age, Klass klass){
        super(ID,name,age);
        this.klass = klass;
    }

    public Teacher(int ID, String name, int age){
        super(ID,name,age);
        klass = null;
    }



    public Klass getKlass() {
        return klass;
    }

    public String introduce(){
        if(klass==null)
            return super.introduce() + " I am a Teacher. I teach No Class.";
        else
            return super.introduce() + " I am a Teacher. I teach Class "+klass.getNumber()+".";
    }

    public String introduceWith(Student student){
        String introduction = super.introduce();
        if(student.getKlass().getNumber()==this.klass.getNumber())
            return String.format("%s I am a Teacher. I teach %s.",introduction,student.getName());
        else
            return String.format("%s I am a Teacher. I don't teach %s.",introduction,student.getName());
    }
}