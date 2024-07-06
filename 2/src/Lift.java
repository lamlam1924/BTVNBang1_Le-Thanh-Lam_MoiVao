
public class Lift {
    protected String label;
    protected int type;
    
    public Lift(){
        
    }

    public Lift(String label, int type) {
        this.label = label;
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Lift { " + "Label = " + label + ", Type = " + type +'}';
    }
  
}
