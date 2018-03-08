package Chapter_2_Elementary_Programming;
import java.util.Scanner;

public class Convert_meters_intro_feet {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //viser en tekst
        System.out.print("indtast antal meter:");

        //jeg laver en variabel, hvor jeg så kan indtaste et tal
        int antalfeet = input.nextInt();

        //viser en tekst
        System.out.println ("antal meter");

        System.out.println(antalfeet/3.2786);
    }
}
