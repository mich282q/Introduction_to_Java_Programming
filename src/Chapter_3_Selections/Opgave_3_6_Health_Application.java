package Chapter_3_Selections;

import java.util.Scanner;

public class Opgave_3_6_Health_Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // scanner ved navn input

        //Scanner for at kunne indtaste "pounds" "feet" "inches"
        System.out.print(" put in your wight in pounds: ");
        double weight = input.nextDouble();
        System.out.print(" put in you feet: ");
        double feet = input.nextDouble();
        System.out.print(" put in inches: ");
        double inches = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237; // en konstat
        final double METER_PER_INCH = 0.0254; // en konstat
        final double FEET_PER_INCH = 0.0833333; // en konstat

        //udregning af BMI

        weight *= KILOGRAMS_PER_POUND;
        double height = (inches += feet / FEET_PER_INCH) * METER_PER_INCH;
        double bmi = weight / (Math.pow(height, 2));

        // Viser Resultat af din bmi
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5)
            System.out.println("You are Underweight.");
        else if (bmi < 25)
            System.out.println("You are Normal.");
        else if (bmi < 30)
            System.out.println("You are Overweight.");
        else
            System.out.println("You are Obese.");

    }
}