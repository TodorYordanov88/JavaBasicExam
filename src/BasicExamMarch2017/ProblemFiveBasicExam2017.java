package BasicExamMarch2017;

import java.util.Scanner;

public class ProblemFiveBasicExam2017 {
    public static void main(String[] args) {
        /*SOFTUNI Logo*/

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int dotsLeftRightTop = (n * 12) - 5;
        dotsLeftRightTop = dotsLeftRightTop / 2;
        int dotsMidle = dotsLeftRightTop - 3;
        int symbol = 1;
        int symbolTwo = 7;

        int dotsBelowL = 2;
        int dotsBelowR = 3;

        int dotsEndT = (n + n) + 1;

        int symbolBelowM = (n * 12) - 5;
        symbolBelowM = symbolBelowM - 6;
        int symbolBelowR = (6 * n) + 1;




        System.out.println(drawThatShit(".", dotsLeftRightTop) +
                drawThatShit("#",1) + drawThatShit(".", dotsLeftRightTop));

        for (int i = 0; i < (n * 2) - 2 ; i++) {
            System.out.println(drawThatShit(".", dotsMidle) +
                            drawThatShit("#",symbolTwo) + drawThatShit(".", dotsMidle));
            dotsMidle -= 3;
            symbolTwo += 6;
        }

        System.out.println(drawThatShit("#", (n * 12) - 5));

        for (int i = 0; i < n - 2 ; i++) {
            System.out.println(drawThatShit("|", 1) + drawThatShit(".", dotsBelowL) +
                                drawThatShit("#", symbolBelowM) + drawThatShit(".", dotsBelowR));
            dotsBelowL += 3;
            dotsBelowR += 3;
            symbolBelowM -= 6;
        }

        for (int i = 0; i < n - 1 ; i++) {
            System.out.println(drawThatShit("|", 1) + drawThatShit(".", (n * 3) - 4) +
                    drawThatShit("#", symbolBelowR) + drawThatShit(".", (n * 3) - 3));
        }

        System.out.println(drawThatShit("@", 1) + drawThatShit(".", (n * 3) - 4) +
                drawThatShit("#", symbolBelowR) + drawThatShit(".", (n * 3) - 3));


    }

    public static String drawThatShit(String text,int repeatCount) {
        String output = "";
        for (int i = 0; i < repeatCount; i++) {
            output = output + text;
        }
        return output;
    }
}
