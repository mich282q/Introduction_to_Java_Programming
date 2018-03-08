package Chapter_2_Elementary_Programming;
import java.util.Scanner;

public class Population_projection2_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //scanner

        // Tekst til den tekst vi skriver i scanner
        System.out.print("indtast antal af år:");
        int years = input.nextInt();

        //her beregning vi antal af mennesker om antal år
        //talerne kommer fra http://www.worldometers.info/world-population/

        double pplCurrent = 7589; // antal i mil.
        double pplIncrease = 85; // antal i mil
        double befolkning = (pplCurrent) + (pplIncrease * years);

        String mil, ppl;
        mil = "milioner";
        ppl = "mennesker";

        //visning af resultat
        System.out.println("Nuværende befolkning i verden er: " + pplCurrent + mil + ".");
        System.out.println("Årlige forøgelse er " + pplIncrease + mil + ".");
        System.out.println("verdens befolkning om " + years + " år er: " + befolkning + mil + ppl + ".");
    }
}
