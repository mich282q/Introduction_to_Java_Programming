package Chapter_2_Elementary_Programming;
import java.util.Scanner;
public class Geometry_distance_of_two_points2_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Scanner der beder om indtastning af 4 punkter
        System.out.print("Indtast x1 og y1: ");
        double x1 = input.nextDouble();

        double y1 = input.nextDouble();
        System.out.print("Indtast x2 og y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Beregning af afstanden mellem de 2 punkter.
        double afstand = Math.pow(Math.pow(x2 - x1, 2) +

                Math.pow(y2 - y1, 2), 0.5);

        // Visning af Resultat
        System.out.println("Afstanden mellem de 2 punkter er: " + afstand);

    }
}
