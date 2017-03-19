package BasicExamMarch2017;

import java.text.NumberFormat;
import java.util.Scanner;

public class ProblemFourBasicExam2017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double points = 0;
        int failedNumbers = 0;
        int invalidNumber = 0;
        int perInvalid = 0;
        int per1 = 0;
        int per2 = 0;
        int per3 = 0;
        int per4 = 0;
        int per5 = 0;

        per1 = per1 - (per1 * 100) / 100;
        per2 = per2 - (per2 * 100) / 100;
        per3 = per3 - (per3 * 100) / 100;
        per4 = per4 - (per4 * 100) / 100;
        per5 = per5 - (per5 * 100) / 100;

        double percentMax = 100;
        int numberOfMove = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < numberOfMove ; i++) {
            int number = Integer.parseInt(sc.nextLine());
            if (number < 0 || number > 50){
                points = points / 2;
                invalidNumber += 1;
                perInvalid += 10;
            }
            if (number >= 0 && number <= 9) {
                points += (number * 20f / 100f);
                per1 += 10;
            }
            if (number >= 10 && number <= 19) {
                points += (number * 30f / 100f);
                per2 += 10;
            }
            if (number >= 20 && number <= 29) {
                points += (number * 40f / 100f);
                per3 += 10;
            }
            if (number >= 30 && number <= 39) {
                points += 50;
                per4 += 10;
            }
            if (number >= 40 && number <= 50) {
                points += 100;
                per5 += 10;
            }
        }
        System.out.printf("%.2f\n", points);
        System.out.printf("From 0 to 9: %d.00%%%n", per1);
        System.out.printf("From 10 to 19: %d%%%n", per2);
        System.out.printf("From 20 to 29: %d%%%n", per3);
        System.out.printf("From 30 to 39: %d.00%%%n", per4);
        System.out.printf("From 40 to 50: %d.00%%%n", per5);
        System.out.printf("Invalid numbers: %d.00%%%n", perInvalid);
    }
}
