package Chapter_2_Elementary_Programming.Sekunder_til_minutter_sekunder;

// et lille program, hvor vi kan indtaste et antal sekunder, og det udskriver hvor mange minutter og sekunder det
// svarer til, "500 SEKUNDER SVARER TIL 8 MINUTTER OG 20 SEKUNDER."

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // viser en tekst
        System.out.print(" Indtast Antal sekunder:");

        //jeg laver en variabel, hvor jeg så kan indtaste et tal
        int antalsekunder = input.nextInt();

        //viser en tekst
        System.out.println ("antal minutter");

        //det antal sekunder som jeg indtaster bliver divideret med 60
        System.out.println(antalsekunder/60);

        //viser en tekst
        System.out.println ("antal Sekunder");

        //viser en tekst og viser det resterende antal sekunder
        System.out.println(antalsekunder %60);

    }
}