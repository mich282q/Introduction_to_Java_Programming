/*
Michael Trans
Date: 23-10-2017
Michael_trans@hotmail.com
 */

package Chapter_12_Exception_Handling_and_Text_I.O.OpgaveInputMismatchException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.print("Enter an integer: ");
                int number = input.nextInt();

                //display the result
                System.out.println(" The Number entered is " + number);

                continueInput = false;

            }
            catch (InputMismatchException ex) {
                System.out.println("Try again. (" + "incorret input: an integer is required)");
            input.nextLine(); //discard input
            }

        }while (continueInput);

    }
}
