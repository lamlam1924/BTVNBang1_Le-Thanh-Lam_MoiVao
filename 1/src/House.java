
import java.util.Scanner;


public class House {

    private String type;
    private int area;

    public House() {

    }

    public House(String type, int area) {
        this.type = type;
        this.area = area;
    }

    public String getType() {
        if(type==null || type.length()<3){
                return type;
            }
            else{
                String baTuCuoi = type.substring(type.length()-3);    
                return new StringBuilder(baTuCuoi).reverse().toString();
            }
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = 3 * area;
    }

    @Override
    public String toString() {
        return "House{" + "type=" + type + ", area=" + area + '}';
    }

    
}
