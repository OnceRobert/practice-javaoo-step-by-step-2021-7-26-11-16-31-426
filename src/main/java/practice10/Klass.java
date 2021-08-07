package practice10;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int klass;
    private Student leader;
    private List<Integer> Students = new ArrayList<Integer>();
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

        Students.add(newStudent.getID());
    }

}

