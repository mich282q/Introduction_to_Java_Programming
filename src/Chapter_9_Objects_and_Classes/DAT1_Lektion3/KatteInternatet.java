package Chapter_9_Objects_and_Classes.DAT1_Lektion3;

import java.util.*;

public class KatteInternatet {
    public static void main(String[] args) {
        System.out.println("Hello internat!");

        Kat kat1; // Deklarer kat1 variablen
        kat1 = new Kat("Garfield"); // Initierer variablen
        kat1.sov();
        kat1.setAlder(3);
        kat1.hvorGammel();

        Kat kat2; // Deklarer kat2 variablen
        kat2 = new Kat("Misser"); // Initierer variablen
        kat2.sov();

        Kat kat3 = new Kat("Pølse"); // Initierer og deklarerer variablen
        kat3.hop();

        // Viser kat1 og kat2s alder
        kat1.hvorGammel();
        kat2.hvorGammel();

        // Slette kat3
        kat3 = null;

        // En lækker anvendelse af Dato klassen
        Date dato = new Date();
        System.out.println(dato.toString());
        // Her kan du se, hvorn kan man gøre datoen til dansk
        // http://www.linuxbog.dk/java/bog/java-i18n-formatering-dato.html

        // En lækker anvendelse af Random klassen
        Random random1 = new Random(3);
        System.out.print("From random1: ");
        for (int i = 0; i < 10; i++)
            System.out.println(random1.nextInt(1000) + " ");
        Random random2 = new Random(3);
        System.out.print("\nFrom random2: ");
        for (int i = 0; i < 10; i++)
            System.out.println(random2.nextInt(1000) + " ");
        // Her kan du se, hvordan vi kan lave tilfældige numre
        // https://www.tutorialspoint.com/java/lang/math_random.htm

        Dog dog1; // Deklarer kat1 variablen
        dog1 = new Dog("blå"); // Initierer variablen

        Dog dog2;
        dog2 = new Dog(10);

        dog1.setAntalBen(4);
        System.out.println(" hund 1 har " + dog1.getAntalBen() + " ben ");

        System.out.println(" hun 2 har " + dog2.getAntalBen() + " ben ");

        Enum_farve n, l, d, e, f, g, s, y, w;
        n = Enum_farve.sort;
        l = Enum_farve.blå;
        d = Enum_farve.rød;
        e = Enum_farve.creme;
        f = Enum_farve.sortT;
        g = Enum_farve.blåT;
        s = Enum_farve.sølv;
        y = Enum_farve.guld;
        w = Enum_farve.hvid;

        System.out.println(" katten har farven " + n );
        System.out.println(" hund og katten har en underlige farve " + y );
        System.out.println(" hun har både farven " + n + " , "+ e + " og " + w);

    }
}