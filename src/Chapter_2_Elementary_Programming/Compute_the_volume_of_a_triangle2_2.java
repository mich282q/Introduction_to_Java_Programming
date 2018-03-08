package Chapter_2_Elementary_Programming;
import java.util.Scanner;

public class Compute_the_volume_of_a_triangle2_2 {
    public static void main(String[] args) {
        //de næste tre linjer "scanner" for brugerens indtastning

        Scanner input = new Scanner(System.in);

        System.out.print("indtast længden på siderne:");

        double længde1 = input.nextDouble();

        // her får vi udregnet arealet samt volume
        double area =(Math.sqrt(3)/4)*(længde1*længde1);
        double volume = area * længde1;

        // her får vi vidst Resultat
        System.out.println("Trekantens længder er:" + længde1);
        System.out.println("Arealet er:" + area);
        System.out.println("Volumen af trekants prism er:"+ volume);
    }
}
