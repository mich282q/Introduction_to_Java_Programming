package Chapter_2_Elementary_Programming.arealet_af_en_cirkel_2;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        System.out.println("Welcome.Java");

// de næste tre linjer "scanner" for brugerens indtastning

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for radius:");

        double radius = input.nextDouble();

        System.out.println("Radius er" + radius); // det udskriver radius

        System.out.println(radius*radius*3.14);
    }
}