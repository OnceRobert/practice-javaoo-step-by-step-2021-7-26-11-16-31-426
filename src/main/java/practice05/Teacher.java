package practice05;

public class Teacher extends Person{
    public int klass;

    public Teacher(String name, int age, int klass){
        super(name,age);
        this.klass = klass;
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
}


//public class Worker extends Person {
//    public Worker(String name, int age){
//        super(name,age);
//    }
//
//    public String introduce(){
//        return super.introduce() + " I am a Worker. I have a job.";
//    }
//}