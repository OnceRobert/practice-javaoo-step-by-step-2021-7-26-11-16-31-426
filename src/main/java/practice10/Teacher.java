package practice10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {
    public Klass klass;
    public List<Klass> klasses = new ArrayList<>();
    public Teacher(int ID, String name, int age, Klass klass){
        super(ID,name,age);
        klass.setTeacher(this);
        this.klass = klass;
        klasses.add(klass);

    }

    public Teacher(int ID, String name, int age){
        super(ID,name,age);
        klass = null;
        klasses = null;
    }

    public Teacher(int id, String tom, int age, LinkedList<Klass> linkedList) {
        super(id, tom,age);
        klasses = linkedList;
        for(Klass teachingKlasses : klasses){
            teachingKlasses.setTeacher(this);
        }

    }


    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public String introduce(){
        if(klasses==null)
            return super.introduce() + " I am a Teacher. I teach No Class.";
        else {
            String klassesTeach = String.format("%d", klasses.get(0).getNumber());
            for(int i = 1; i<klasses.size();i++){
                klassesTeach += ", " + klasses.get(i).getNumber();
            }
            return super.introduce() + " I am a Teacher. I teach Class " + klassesTeach + ".";
        }
    }

    public String introduceWith(Student student){
        String introduction = super.introduce() + " I am a Teacher.";
        Klass studentClass = student.getKlass();
        if(isTeaching(student))
            return String.format("%s I teach %s.",introduction,student.getName());
        else
            return String.format("%s I don't teach %s.",introduction,student.getName());
    }

    public List<Klass> getClasses() {
        return klasses;
    }

    public boolean isTeaching(Student student) {
        List<Klass> theseKlasses = klasses
                .stream()
                .filter(klass -> klass.getNumber() == student.getKlass().getNumber())
                .collect(Collectors.toList());
        if (theseKlasses.isEmpty()){
            return false;
        }
        else
            return true;
    }
}
