
public class SpecLift extends Lift {

    private int load;

    public SpecLift() {
    }

    public SpecLift(String label, int type, int load) {
        super(label, type);
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return "SpecLift [ " + super.toString() + ", Load = " + load + ']';
    }

    public int getValue() {
        if (!label.contains(String.valueOf(type))) {
            return load;
        } else {
            return type + load;
        }
    }
    
    public void setData() {
        StringBuilder newLable = new StringBuilder();
        for (int i = 0; i < label.length(); i++) {
            if (i % 2 == 0) {
                newLable.append(label.charAt(i));
            }
        }
        label = newLable.toString();
    }
}
