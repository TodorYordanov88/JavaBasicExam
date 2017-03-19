package BasicExamMarch2017;

import java.util.Scanner;

public class ProblemTwoBasicExamMarth2017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hoursNeeded = Integer.parseInt(sc.nextLine());
        int numberOfWorkers = Integer.parseInt(sc.nextLine());
        int workDays = Integer.parseInt(sc.nextLine());

        int hoursNeededTwo = numberOfWorkers * (workDays * 8);


        if (hoursNeededTwo > hoursNeeded) {
            int hoursLeft = hoursNeededTwo - hoursNeeded;
            System.out.println(hoursLeft + " hours left");
        } else if (hoursNeededTwo < hoursNeeded) {
            int needToWorkMore = hoursNeeded - hoursNeededTwo;
            int penalties = needToWorkMore * workDays;
            System.out.printf("%d overtime\nPenalties: %d", needToWorkMore, penalties);
        }

    }
}
