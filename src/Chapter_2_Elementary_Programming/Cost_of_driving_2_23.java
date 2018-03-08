package Chapter_2_Elementary_Programming;

import java.util.Scanner;

public class Cost_of_driving_2_23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Scanner der spørg om hvor langt der er blevet kørt, hvor langt bilen kører pr liter og hvad en liter koster.
        System.out.print("Hvor langt er der blevet kørt: ");

        double afstand = input.nextDouble();

        System.out.print("Kilometer pr Liter: ");

        double kmPerLiter = input.nextDouble();

        System.out.print("Pris pr Liter: ");

        double prisPerKm = input.nextDouble();


        // Beregning af pris på tur.
        double omkostning = (afstand / kmPerLiter) * prisPerKm;
        int intOmkostning = (int) omkostning;

        // Visning af Resultat
        System.out.println("Den totale pris for køre turen er " + intOmkostning + " kr.");
    }
}