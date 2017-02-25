package JBE24;

import java.util.Scanner;

public class Pr01HousePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double smallRoomSize = Double.parseDouble(sc.nextLine());
        double kitchenSize = Double.parseDouble(sc.nextLine());
        double sqMeterPrce = Double.parseDouble(sc.nextLine());

        double secondRoom = smallRoomSize + ((smallRoomSize * 10) / 100);
        double thirdRoom = secondRoom + ((secondRoom * 10) / 100);
        double kitchen = smallRoomSize / 2;

        double totalSize = smallRoomSize + kitchen + secondRoom + thirdRoom + kitchenSize;
        totalSize = totalSize + ((totalSize * 5) / 100);
        totalSize = totalSize * sqMeterPrce;

        System.out.printf("%.2f", totalSize);
    }
}