package Chapter_2_Elementary_Programming;

import java.util.Scanner;

public class Convert_mile_to_kilometer2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //viser en tekst
        System.out.println("Indtast antal mile");

        //jeg laver en variabel, hvor jeg så kan indtaste et tal
        int mile = input.nextInt();

        //kilomtter til mile
        double kilometer = 1.6;
        double resultat = mile * kilometer;

        String mileTekst;
        mileTekst = " mile omregnet til kilometer";
        //her får jeg vidst resultat
        System.out.println(mile + mileTekst + resultat + ".");
    }
}

