package JB28;

import java.util.Scanner;

public class Pr01Pipes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double v = Double.parseDouble(sc.nextLine());
        double p1 = Double.parseDouble(sc.nextLine());
        double p2 = Double.parseDouble(sc.nextLine());
        double hours = Double.parseDouble(sc.nextLine());
        double hoursAfterCheck = 0;

        double p1H = p1 * hours;
        double p2h = p2 * hours;
        double total = p1H + p2h;
        if (total < v) {
            double p1Pr = (p1H / total) * 100;
            double p2Pr = (p2h / total) * 100;
            double totalProcentsFull = (total / v) * 100;
            System.out.printf("The pool is %d%% full. Pipe 1: %d%%. Pipe 2: %d%%.", (int)totalProcentsFull , (int)p1Pr, (int)p2Pr);
        }else if (total > v) {
            double p1Pr = (p1H / total) * 100;
            double p2Pr = (p2h / total) * 100;
            double overFlow = total - v;
            if (hours % 1 == 0){
                hoursAfterCheck = (int)hours;
                System.out.printf("For " + (int)hoursAfterCheck + " hours the pool overflows with %d liters.", (int)overFlow);
            } else if (overFlow % 1 == 0){
                hoursAfterCheck = hours;
                double overflowAfter = overFlow;
                System.out.printf("For " + hoursAfterCheck + " hours the pool overflows with " + overflowAfter + " liters.");
            }
        }

    }
}
