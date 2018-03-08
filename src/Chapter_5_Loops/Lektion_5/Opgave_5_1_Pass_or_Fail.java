package Chapter_5_Loops.Lektion_5;

import java.util.Scanner;

public class Opgave_5_1_Pass_or_Fail {
    public static void main(String[] args) {
        Scanner score = new Scanner(System.in);
        int eScore = 0;
        while (eScore != -1) {
            System.out.println(" indtast din eksam karakter her ");
            eScore = score.nextInt();

            if (eScore < 60){
                System.out.println(" You did not pass the Exam");
            }
            if (eScore >= 60) {
                System.out.println(" You Passed the exam");
            }
        }
    }
}