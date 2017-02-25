package JBE23December;

import java.util.Scanner;

public class Pr02ChangeTiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double moneyCollected = Double.parseDouble(sc.nextLine());
        double floarWeigh = Double.parseDouble(sc.nextLine());
        double floarLengn = Double.parseDouble(sc.nextLine());
        double triangleSide = Double.parseDouble(sc.nextLine());
        double triangleHeigh = Double.parseDouble(sc.nextLine());
        double priceForPlate = Double.parseDouble(sc.nextLine());
        double priceForMaster = Double.parseDouble(sc.nextLine());

        double floarArea = floarWeigh * floarLengn;
        double plateArea = triangleSide * (triangleHeigh / 2);

        double totalPlateNeeded = floarArea / plateArea;
        totalPlateNeeded = Math.ceil(totalPlateNeeded) + 5;
        double totalSum = (totalPlateNeeded * priceForPlate) + priceForMaster;

        if (totalSum <= moneyCollected){
            double left = moneyCollected - totalSum;
            System.out.printf("%.2f lv left.",left);
        } else if (totalSum > moneyCollected) {
            double moneyNeeded = totalSum - moneyCollected;
            System.out.printf("You'll need %.2f lv more.",moneyNeeded);
        }
    }
}
