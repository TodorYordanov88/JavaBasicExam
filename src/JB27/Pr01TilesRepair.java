package JB27;

import java.util.Scanner;

public class Pr01TilesRepair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double length = Double.parseDouble(sc.nextLine());
        double widthOneTile = Double.parseDouble(sc.nextLine());
        double lenghtOneTile = Double.parseDouble(sc.nextLine());
        double heightPorch = Double.parseDouble(sc.nextLine());
        double lengthPorch = Double.parseDouble(sc.nextLine());

        double totalArea = (length * length) - (heightPorch * lengthPorch);
        totalArea = totalArea / (widthOneTile * lenghtOneTile);
        double timeNeed = totalArea * 0.2;

        System.out.printf("%.11f\n", totalArea);
        System.out.println(timeNeed);



    }
}
