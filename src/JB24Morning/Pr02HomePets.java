package JB2EMorning;

import java.util.Scanner;

public class Pr02HomePets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfDays = Integer.parseInt(sc.nextLine());
        int foodLeftKg = Integer.parseInt(sc.nextLine());
        double foodPerDayDogKg = Double.parseDouble(sc.nextLine());
        double foodPerDayCatKg = Double.parseDouble(sc.nextLine());
        double foodPerDayTurtleGrams = Double.parseDouble(sc.nextLine());

        double totalFoodNeeded = (numberOfDays * foodPerDayDogKg) + (numberOfDays * foodPerDayCatKg) +
                (numberOfDays * (foodPerDayTurtleGrams / 1000));

        if (totalFoodNeeded <= foodLeftKg){
            System.out.printf("%d kilos of food left.", (int)Math.floor(foodLeftKg - totalFoodNeeded));
        }else if (totalFoodNeeded >= foodLeftKg) {
            double foodNeeded = (totalFoodNeeded - foodLeftKg);
            System.out.printf("%d more kilos of food are needed.", (int)Math.ceil(foodNeeded));
        }
    }
}
