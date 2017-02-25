package JBE24;

import java.util.Scanner;

public class Pro2FlowerShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int magnoliiCount = Integer.parseInt(sc.nextLine());
        int zumbiulCount = Integer.parseInt(sc.nextLine());
        int rossesCount = Integer.parseInt(sc.nextLine());
        int cactusCount = Integer.parseInt(sc.nextLine());

        double presentPrice = Double.parseDouble(sc.nextLine());


        double sum = (magnoliiCount * 3.25) + (zumbiulCount * 4) + (rossesCount * 3.50) + (cactusCount * 8);

        double sumAfterTax = sum - ((sum * 5) / 100);

        double moneyLeft = sumAfterTax - presentPrice;

        if (moneyLeft < 0) {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(Math.abs(moneyLeft)));
        } else {
            System.out.printf("She is left with %.0f leva.", Math.floor(moneyLeft));
        }


    }
}
