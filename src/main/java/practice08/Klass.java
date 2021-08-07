package practice08;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int klass;
    private Student leader;
    private List<Student> Students = new ArrayList<>();
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
        if(Students.contains(leader)) {
            this.leader = leader;
            return;
        }
            System.out.print("It is not one of us.\n");

    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student newStudent){
        Students.add(newStudent);
    }

}