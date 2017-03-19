package JB27;

import java.util.Scanner;

public class Pr02SleepyTomCat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int freeDays = Integer.parseInt(sc.nextLine());
        int timeToPlayWhenWorking = (365 - freeDays);
        timeToPlayWhenWorking = timeToPlayWhenWorking * 63;
        int timeToPlayWhenFree = freeDays * 127;
        int total = timeToPlayWhenFree + timeToPlayWhenWorking;

        if (total < 30000){
            int reminder = 30000 - total;
            int hours =  reminder / 60;
            int min = reminder % 60;
            System.out.printf("Tom sleeps well\n%d hours and %d minutes less for play", hours, min);
        } else if (total > 30000) {
            int more = total - 30000;
            int hours =  more / 60;
            int min = more % 60;
            System.out.printf("Tom will run away\n%d hours and %d minutes more for play", hours, min);

        }








    }
}
