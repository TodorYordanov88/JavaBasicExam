package BasicExamMarch2017;

import java.util.Scanner;

public class ProblemOneBasicExamMarch2017 {
    public static void main(String[] args) {
        /*DOGHOUSE*/

        Scanner sc = new Scanner(System.in);

        double lenghSideA = Double.parseDouble(sc.nextLine());
        double heightSideB = Double.parseDouble(sc.nextLine());

        double twoPages = lenghSideA * (lenghSideA / 2) * 2;

        /*Back Wall*/

        double kv = (lenghSideA / 2) * (lenghSideA / 2);
        double tri = (lenghSideA / 2 * (heightSideB - lenghSideA / 2) /2);
        double backWall = kv + tri;

        /*Entrance*/

        double entrance = (lenghSideA / 5) * (lenghSideA / 5);
        double frontWall = backWall - entrance;
        double totalWall = twoPages + backWall + frontWall;

        double greenPaint = totalWall / 3;
        double redPaint = twoPages / 5;
        System.out.printf("%.2f\n%.2f", greenPaint, redPaint);




    }
}
