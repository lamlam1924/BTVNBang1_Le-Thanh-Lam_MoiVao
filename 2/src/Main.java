
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SpecLift test = new SpecLift();
        System.out.print("Enter label: ");
        String label = sc.nextLine();
        System.out.print("Enter type: ");
        int type = Integer.parseInt(sc.nextLine());
        System.out.print("Enter load: ");
        int load = Integer.parseInt(sc.nextLine());
        System.out.println("1. Test toString()\n2. Test setData()\n3. Test getValue\nEnter TC (1,2 or 3): ");
        int luaChon = Integer.parseInt(sc.nextLine());
        switch(luaChon){
            case 1:
                test.toString();
                break;
            case 2:
                test.setData();
                break;
            case 3:
                test.getValue();
                break;
            default:
                System.out.println("Invalid!");
                break;
        }
        sc.close();
    }
    
}
