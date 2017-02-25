package JB24Morning;

import java.util.Scanner;

public class Pr01FishMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double priceKgMackerel = Double.parseDouble(sc.nextLine());
        double priceKgSprat = Double.parseDouble(sc.nextLine());
        double kgBeltedBonito = Double.parseDouble(sc.nextLine());
        double kgScad = Double.parseDouble(sc.nextLine());
        double kgMidi = Double.parseDouble(sc.nextLine());

        double totalSum = (priceKgMackerel + (priceKgMackerel * 60) / 100) * kgBeltedBonito +
                (priceKgSprat + (priceKgSprat * 80) / 100) * kgScad +
                kgMidi * 7.50;

        System.out.printf("%.2f", totalSum);
    }
}
