package Chapter_3_Selections;

import java.util.Scanner;

public class Opgave_3_17_Game_Scissor_rock_Paper {
    public static void main(String[] args) {
        int randomGames = (int) (Math.random() * 3); // her definer jeg min random value variable som jeg kalder RandomGames
        Scanner input = new Scanner(System.in); // her søger for min scanner virker


        System.out.println(" scissor (0), rock (1), paper (2)");

        int choose = input.nextInt();

        if (choose == randomGames) {
            System.out.println(" it is a draw ");
        } else {
            boolean outcome = (choose == 0 && randomGames == 2)
                    || (choose == 1 && randomGames == 0) ||
                    (choose == 2 && randomGames == 1);
            if (outcome == true) {
                System.out.println(" du er heldig du har vundet ");
            } else {
                System.out.println(" you lose ");
            }

        }

    }
}