package practice07;

public class Klass {
    private int klass;
    private String Leader;//use Student
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
        this.Leader = Leader.getName();
    }

    public String getLeader() {
        return Leader;
    }
}