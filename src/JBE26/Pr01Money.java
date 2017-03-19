package JBE26;

import java.math.BigDecimal;
import java.util.Scanner;

public class Pr01Money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float numberOfBitCoin = Float.parseFloat(sc.nextLine());
        float chineaseUan = Float.parseFloat(sc.nextLine());
        float comission = Float.parseFloat(sc.nextLine());

        numberOfBitCoin = (float) (numberOfBitCoin * 1168.00);
        chineaseUan = (float) (chineaseUan * 0.15);
        float dollarsToLv = (float) (chineaseUan * 1.76);
        float lvToEuro = (numberOfBitCoin + dollarsToLv);
        lvToEuro = (float) (lvToEuro / 1.95);
        float afterCommision = lvToEuro - (lvToEuro * comission);
        float total = lvToEuro - afterCommision;
        total = lvToEuro - total;
        System.out.println((double)total);


    }
}