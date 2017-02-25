package JB2EMorning;

import java.util.Scanner;

public class Pr05Fox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int asterixTop = 1;
        int slash = 1;
        int dash = (n + n) - 1;
        int middleAsterixLeftRight = n / 2;
        int middleAsterix = n;
        int dashBottom = 1;
        int asterixBottom = (n + n) - 1;

        for (int i = 0; i < n ; i++) {
            System.out.println(drawThatShit("*", asterixTop) + drawThatShit("\\", slash) +
                                drawThatShit("-", dash) + drawThatShit("/", slash) +
                                drawThatShit("*", asterixTop));
            asterixTop++;
            dash -= 2;
            if (i == n - 1){
                for (int j = 0; j < (n - 3) / 2; j++) {
                    System.out.println(drawThatShit("|", 1) + drawThatShit("*", middleAsterixLeftRight) +
                            drawThatShit("\\", 1) + drawThatShit("*", middleAsterix) +
                            drawThatShit("/", 1) + drawThatShit("*", middleAsterixLeftRight) +
                            drawThatShit("|", 1));
                    middleAsterixLeftRight++;
                    middleAsterix -= 2;
                }
            }
            if (i == n - 1){
                for (int j = 0; j < n ; j++) {
                    System.out.println(drawThatShit("-", dashBottom) + drawThatShit("\\", slash) +
                            drawThatShit("*", asterixBottom) + drawThatShit("/", slash) +
                            drawThatShit("-", dashBottom));
                    dashBottom++;
                    asterixBottom -= 2;
                }
            }
        }
    }

    public static String drawThatShit(String text,int repeatCount) {
        String output = "";
        for (int i = 0; i < repeatCount; i++) {
            output = output + text;
        }
        return output;
    }
}
