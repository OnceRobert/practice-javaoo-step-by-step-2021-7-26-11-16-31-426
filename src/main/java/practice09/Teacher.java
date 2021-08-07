package practice09;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {
    public Klass klass;
    public List<Klass> klasses = new ArrayList<Klass>();
    public Teacher(int ID, String name, int age, Klass klass){
        super(ID,name,age);
        this.klass = klass;
    }

    public Teacher(int ID, String name, int age){
        super(ID,name,age);
        klass = null;
    }

    public Teacher(int id, String tom, int age, LinkedList<Klass> linkedList) {
        super(id, tom,age);
        klasses = linkedList;

    }


    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce(){
        if(klasses==null)   // .empty()
            return super.introduce() + " I am a Teacher. I teach No Class.";
        else {
            String klassesTeach = String.format("%d", klasses.get(0).getNumber());
            for(int i = 1; i<klasses.size();i++){
                klassesTeach += ", " + klasses.get(i).getNumber();
            }   //Java stream
            return super.introduce() + " I am a Teacher. I teach Class " + klassesTeach + ".";
        }
    }

    public String introduceWith(Student student){
        String introduction = super.introduce() + " I am a Teacher.";
        Klass studentClass = student.getKlass();
        if(klasses.contains(studentClass)||klass==studentClass)
            return String.format("%s I teach %s.",introduction,student.getName());
        else
            return String.format("%s I don't teach %s.",introduction,student.getName());
    }

    public List<Klass> getClasses() {
        return klasses;
    }

    public boolean isTeaching(Student jerry) {
        if (klasses.contains(jerry.getKlass())){
            return true;
        }
        else
            return false;
    }
}
