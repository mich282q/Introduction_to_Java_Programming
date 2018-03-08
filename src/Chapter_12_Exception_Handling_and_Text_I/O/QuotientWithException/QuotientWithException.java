/*
Michael Trans
Date: 23-10-2017
Michael_trans@hotmail.com
 */

package Chapter_12_Exception_Handling_and_Text_I.O.QuotientWithException;

import java.util.Scanner;

public class QuotientWithException {

    public static double quotient(double number1, double number2){
        if (number2 ==0)
            throw new ArithmeticException("Divisor cannot be zero ");
        return number1 / number2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt the user to enter to integers
        System.out.print("Enter two integers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();

        try  {
            double result = (double)(quotient(number1, number2));
        System.out.println(number1 + " / " + number2 + " is " + (number1 / number2));
        }
        catch (ArithmeticException ex) {
            System.out.println("Exception: an integer " + "cannot be divided by zero ");
        }
        System.out.println("Excution continues ... ");
    }
}
