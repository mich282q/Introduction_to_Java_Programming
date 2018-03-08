package Chapter_5_Loops.DAT1_Lektion6;

import java.util.Scanner;

public class GueassNumber {

    public static void main(String[] args) {


        // Generate a random number to be guessed
        int number = (int) (Math.random() * 101);

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");


        // Prompt the user to guess the number
        System.out.print("\nEnter your guess: ");
        int guess = input.nextInt();

        if (guess == number)
            System.out.println("Yes, the number is " + number);
        else if (guess > number)
            System.out.println("Your guess is too high");
        else
            System.out.println("Your guess is too low");

        while (guess != number) {
            System.out.println("try again");

            guess = input.nextInt();
            if (guess == number)
                System.out.println("Yes, the number is " + number);
            else if (guess > number)
                System.out.println("Your guess is too high");
            else
                System.out.println("Your guess is too low");
        }



    }
}