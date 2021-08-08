package practice07;

public class Klass {
    private int klass;
    private Student Leader;//use Student
    public Klass(int klass){
        this.klass = klass;
    }
    public int getNumber(){
        return klass;
    }
    public String getDisplayName(){
        return String.format("Class %s", this.klass);
    }

    public void assignLeader(Student Leader) {
        this.Leader = Leader;
    }

    public Student getLeader() {
        return Leader;
    }
}