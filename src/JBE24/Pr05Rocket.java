    package JBE24;

    import java.util.Scanner;

    public class Pr05Rocket {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = Integer.parseInt(scan.nextLine());
            int firstDots = n + (n / 2) - 1;
            int space = 0;
            int symbolEnd = (n + n) - 2;
            int dotsBelow = n / 2;

            for (int i = 0; i < n; i++) {
                System.out.println(doMagic(".", firstDots) + "/" + doMagic(" ", space) + "\\" + doMagic(".", firstDots));
                firstDots--;
                space+=2;
            }

            System.out.println(doMagic(".", n / 2) +  doMagic("*", n * 2) + doMagic(".", n / 2));

            for (int i = 0; i < n * 2 ; i++) {
                System.out.println(doMagic(".", n / 2) +  doMagic("|", 1) + doMagic("\\", (n + n) - 2) +
                        doMagic("|", 1) + doMagic(".", n / 2));
            }

            for (int i = 0; i < n / 2; i++) {
                System.out.println(doMagic(".", dotsBelow) + doMagic("/", 1) + doMagic("*", symbolEnd) + doMagic("\\", 1)
                +doMagic(".", dotsBelow));
                dotsBelow--;
                symbolEnd+=2;
            }
        }

        public static String doMagic(String text,int repeatCount) {
            String output = "";
            for (int i = 0; i < repeatCount; i++) {
                output = output + text;
            }
            return output;
        }
    }
