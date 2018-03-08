package Chapter_5_Loops.Lektion_5;

import java.util.Scanner;

public class Opgave_5_4_Conversion_from_Inch_to_Centumetre {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //viser en tekst
        System.out.println(" Indtast antal Inch ");

        //jeg laver en variabel, hvor jeg så kan indtaste et tal
        int Centimeters = input.nextInt();

        //kilomtter til mile
        double Inch = 2.54;
        double resultat = Centimeters * Inch;

        String mileTekst;
        mileTekst = " Inch omregnet til Centimeters ";
        //her får jeg vidst resultat
        System.out.println(Centimeters + mileTekst + resultat + ".");
    }
}