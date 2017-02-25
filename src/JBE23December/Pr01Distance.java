package JBE23December;

import java.util.Scanner;

public class Pr01Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double initialSpeed = Double.parseDouble(sc.nextLine());
        double firstTimeMin = Double.parseDouble(sc.nextLine());
        double secondTimeMin = Double.parseDouble(sc.nextLine());
        double thirdTimeMin = Double.parseDouble(sc.nextLine());

        double disWithInSpeed = initialSpeed * (firstTimeMin / 60);
        double afterProcentInc = initialSpeed + (initialSpeed * 10) / 100;
        double afterProcentIncSecondMin = afterProcentInc * (secondTimeMin / 60);
        double afterProcentDic = afterProcentInc - (afterProcentInc * 5) / 100;
        double afterProcentDicThirdMin = afterProcentDic * (thirdTimeMin / 60);
        double totalKm = disWithInSpeed + afterProcentIncSecondMin + afterProcentDicThirdMin;

        System.out.printf("%.2f",totalKm);
    }
}
