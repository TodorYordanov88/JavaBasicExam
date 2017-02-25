package JBE24;

import java.util.Scanner;

public class Pr03BikeRace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int juniourBikers = Integer.parseInt(sc.nextLine());
        int seniourBiker = Integer.parseInt(sc.nextLine());

        String raceType = sc.nextLine();

        if (raceType.equals("trail")){
            double sumCollected = (juniourBikers * 5.5) + (seniourBiker * 7);
            double sumLeft = sumCollected - ((sumCollected * 5) / 100);
            System.out.printf("%.2f", sumLeft);
        }

    }
}
