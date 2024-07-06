
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        House nhaMoi = new House();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter type: ");
        String kieuNha = sc.nextLine();
        nhaMoi.setType(kieuNha);
        System.out.print("Enter area: ");
        int dienTich = Integer.parseInt(sc.nextLine());
        nhaMoi.setArea(dienTich);
        System.out.println("1. Test getType()\n2. Test setArea()\nEnter TC (1 or 2): ");
        int luaChon = Integer.parseInt(sc.nextLine());
        if (luaChon == 1) {
            System.out.println("Output: " + nhaMoi.getType());
        } else if (luaChon == 2) {
            System.out.print("Enter new area: ");
            int newArea = Integer.parseInt(sc.nextLine());
            nhaMoi.setArea(newArea);
            System.out.println("Output: " + nhaMoi.getArea());
        } else {
            System.out.println("Your choice invalid.");

        }
        sc.close();
    }
}
