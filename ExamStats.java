import java.sql.SQLOutput;
import java.util.Scanner;

public class ExamStats {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("How many exam scores?");
        int size = scnr.nextInt();

        double[] numScores = new double[size];
        System.out.println("Enter the " + size + " exam scores:");

        for (int i = 0; i < numScores.length; i++) {
            numScores[i] = scnr.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < numScores.length; i++) {
            sum = sum + numScores[i];
        }
        double average = sum / size;
        System.out.printf("Average score: %.2f", average);
        System.out.println();
        System.out.println("Grade - Count:");

        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;
        int gradeF = 0;
        for (int i = 0; i < size; i++) {
            if (numScores[i] >= 90) {
                ++gradeA;
            } else if (numScores[i] >= 80) {
                ++gradeB;
            } else if (numScores[i] >= 70) {
                ++gradeC;
            } else if (numScores[i] >= 60) {
                ++gradeD;
            } else {
                ++gradeF;
            }
        }
        System.out.println("A - " + gradeA);
        System.out.println("B - " + gradeB);
        System.out.println("C - " + gradeC);
        System.out.println("D - " + gradeD);
        System.out.println("F - " + gradeF);
    }
}
