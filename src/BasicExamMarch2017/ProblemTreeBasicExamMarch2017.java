package BasicExamMarch2017;

import java.util.Scanner;

public class ProblemTreeBasicExamMarch2017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double budget = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();
        if (budget <= 100) {
            String cl = "Economy class";
            if (season.contains("Summer")) {
                double cabrioPrice = (budget * 35f / 100f);
                System.out.printf("%s\nCabrio - %.2f", cl, cabrioPrice);
            }else if (season.contains("Winter")){
                double JeepPrice = (budget * 65f / 100f);
                System.out.printf("%s\nJeep - %.2f", cl, JeepPrice);
            }
        }

        if (budget > 100 && budget <= 500) {
            String cl = "Compact class";
            if (season.contains("Summer")) {
                double cabrioPrice = (budget * 45f / 100f);
                System.out.printf("%s\nCabrio - %.2f", cl, cabrioPrice);
            }else if (season.contains("Winter")){
                double JeepPrice = (budget * 80f / 100f);
                System.out.printf("%s\nJeep - %.2f", cl, JeepPrice);
            }
        }

        if (budget > 500) {
            String cl = "Luxury class";
                double JeepPrice = (budget * 90f / 100f);
                System.out.printf("%s\nJeep - %.2f", cl, JeepPrice);
            }
        }
}
