package JB27;

import java.util.Scanner;

public class Pr03Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = Integer.parseInt(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());
        String symbol = sc.nextLine();
        if (symbol.contains("+")) {
            int sum = num1 + num2;
            if (sum % 2 == 0){
                System.out.println(num1 + " + " + num2 + " " + "=" + " " + sum + " - " + "even");
            }else{
                System.out.println(num1 + " + " + num2 + " " + "=" + " " + sum + " - " + "odd");
            }
        } else if (symbol.contains("-")){
            int sum = num1 - num2;
            if (sum % 2 == 0){
                System.out.println(num1 + " - " + num2 + " " + "=" + " " + sum + " - " + "even");
            }else{
                System.out.println(num1 + " - " + num2 + " " + "=" + " " + sum + " - " + "odd");
            }
        } else if (symbol.contains("*")) {
            int sum = num1 * num2;
            if (sum % 2 == 0) {
                System.out.println(num1 + " * " + num2 + " " + "=" + " " + sum + " - " + "even");
            } else {
                System.out.println(num1 + " * " + num2 + " " + "=" + " " + sum + " - " + "odd");
            }
        } else if (symbol.contains("/")) {
            if (num2 == 0) {
                System.out.printf("Cannot divide %d by zero", num1);
            } else {
                double sum = (double)num1 / num2;
                System.out.printf(num1 + " / " + num2 + " " + "=" + " " + "%.2f",sum);
            }
        } else if (symbol.contains("%")) {
            if (num2 == 0) {
                System.out.printf("Cannot divide %d by zero", num1);
            } else {
                int sum = num1 % num2;
                System.out.println(num1 + " % " + num2 + " " + "=" + " " + sum);
            }
        }
    }
}
