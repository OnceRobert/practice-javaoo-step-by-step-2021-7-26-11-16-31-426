package practice10;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int klass;
    private Student leader = null;
    private List<Integer> Students = new ArrayList<Integer>();
    private Teacher teacher = null;
    public Klass(int klass){
        this.klass = klass;

    }
    public int getNumber(){
        return klass;
    }
    public String getDisplayName(){
        return String.format("Class %s", this.klass);
    }

    public void assignLeader(Student leader) {
        if(Students.contains(leader.getID())) {
            if (teacher!=null)
                System.out.print(String.format("I am %s. I know %s become Leader of Class %d.\n",teacher.getName(),leader.getName(),leader.getKlass().getNumber()));
            this.leader = leader;
        }
        else {
            System.out.print("It is not one of us.\n");
            //System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student newStudent){
        newStudent.setKlass(this);
        if (teacher!=null)
            System.out.print(String.format("I am %s. I know %s has joined Class %d.\n",teacher.getName(),newStudent.getName(),newStudent.getKlass().getNumber()));
        Students.add(newStudent.getID());
    }

    public Teacher getTeacher(){
        return teacher;
    }

    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
    }

}

