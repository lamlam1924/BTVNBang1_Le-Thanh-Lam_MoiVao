
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class MyLift implements ILift {

    private boolean checkSoNguyento(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int f1(List<SpecLift> lifts) {
        int maxLoad = Integer.MIN_VALUE;
        for (SpecLift lift : lifts) {
            if (checkSoNguyento(lift.getLabel().length())) {
                maxLoad = Math.max(maxLoad, lift.getLoad());
            }
        }
        return maxLoad;
    }

    @Override
    public void f2(List<SpecLift> lifts) {
        int n = Math.min(5, lifts.size());
        for (int i = 0; i < n / 2; i++) {
            SpecLift temp = lifts.get(i);
            lifts.set(i, lifts.get(n - 1 - i));
            lifts.set(n - 1 - i, temp);
        }
    }

    @Override
    public void f3(List<SpecLift> lifts) {
        int count = 0;
        for (int i = 0; i < lifts.size(); i++) {
            if (lifts.get(i).getLoad() < 20) {
                count++;
                if (count == 2) {
                    lifts.remove(i);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<SpecLift> lifts = new ArrayList<>();
        lifts.add(new SpecLift(10, "modern1", 1));
        lifts.add(new SpecLift(15, "modern12", 1));
        lifts.add(new SpecLift(25, "modern123", 1));
        lifts.add(new SpecLift(30, "modern1234", 1));
        lifts.add(new SpecLift(20, "modern 12345", 1));
        lifts.add(new SpecLift(5, "modern", 1));

        MyLift myLift = new MyLift() {
        };
        System.out.println(lifts);
        System.out.println();
        System.out.println("Enter TC(1-f1; 2-f2; 3-f3; 0-Exit");
        int n;
        do {
            
            n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1: {
                    myLift.f1(lifts);
                    System.out.println(myLift.f1(lifts));
                }
                case 2: {
                    myLift.f2(lifts);
                    System.out.println("List after f2: " + lifts);
                }
                case 3: {
                    myLift.f3(lifts);
                    System.out.println("List after f3: " + lifts);
                }
            }

        } while (n > 0 && n < 4);
        sc.close();
    }
}
