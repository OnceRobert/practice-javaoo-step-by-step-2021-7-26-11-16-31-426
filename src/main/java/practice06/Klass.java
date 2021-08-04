package practice06;

public class Klass {
    private int klass;
    public Klass(int klass){
        this.klass = klass;
    }
    public int getNumber(){
        return klass;
    }
    public String getDisplayName(){
        return String.format("Class %s", this.klass);
    }
}
