package JBE24;

import java.util.Scanner;

public class Pr04Logistics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lenght = Integer.parseInt(scan.nextLine());

        int counter = 1;
        int tons = 0;
        int microbus = 0;
        int truck = 0;
        int train = 0;

        for (int i = 0; i < lenght; i++) {
            tons = Integer.parseInt(scan.nextLine());
            if (tons <= 3) {
                microbus += tons;

            } else if (tons >= 4 && tons <= 11) {
                truck +=tons;

            } else if (tons >= 12) {
                train += tons;
            }
        }

        double sumVecicles = (microbus + truck + train);
        double sumCargo = ((microbus * 200) + (truck * 175) + (train * 120));
        double middleTons = sumCargo / sumVecicles;
        System.out.printf("%.2f\n", middleTons);

        double printMicrobus = ((microbus / sumVecicles) * 100);
        double printTruck = ((truck / sumVecicles) * 100);
        double printTrain = ((train / sumVecicles) * 100);

        System.out.printf("%.2f%%\n", printMicrobus);
        System.out.printf("%.2f%%\n", printTruck);
        System.out.printf("%.2f%%\n", printTrain);
    }
}
