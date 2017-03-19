package JB27;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Pr05STOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int dots = n + 1;
        int dotsMiddle = n;
        int underScoreSM  = n + n + 1;
        int underScoreSMMiddle = (n + n) - 1;
        int bottomDot = 1;
        int bottomDash = (n * 4) - 3;
        System.out.println(drawThatShit(".", dots) +
                            drawThatShit("_", underScoreSM) +
                            drawThatShit(".", dots));

        for (int i = 0; i < n ; i++) {
            System.out.println(drawThatShit(".", dotsMiddle) +
                    drawThatShit("/", 2) +
                    drawThatShit("_", underScoreSMMiddle) +
                    drawThatShit("\\", 2) +
                    drawThatShit(".", dotsMiddle));
            dotsMiddle--;
            underScoreSMMiddle+=2;
        }

        System.out.println(drawThatShit("/", 2) +
                            drawThatShit("_", n + n - 3) +
                            drawThatShit("STOP!", 1) +
                            drawThatShit("_", n + n - 3) +
                            drawThatShit("\\", 2));
        System.out.println(drawThatShit("\\", 2) +
                             drawThatShit("_", (n * 4) - 1) +
                            drawThatShit("/", 2));
        for (int i = 0; i < (n + 1) - 2 ; i++) {
            System.out.println(drawThatShit(".", bottomDot) +
                                drawThatShit("\\", 2) +
                                drawThatShit("_", bottomDash) +
                                drawThatShit("/", 2) +
                                drawThatShit(".", bottomDot));
            bottomDot++;
            bottomDash-=2;
        }
    }

    public static String drawThatShit(String text, int repeatCount) {
        String output = "";
        for (int i = 0; i < repeatCount; i++) {
            output = output + text;
        }
        return output;
    }
}
