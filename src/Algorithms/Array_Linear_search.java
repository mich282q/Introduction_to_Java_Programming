package Algorithms;

import java.text.BreakIterator;
import java.util.Scanner;

public class Array_Linear_search {
    public static void main(String[] args) {

        boolean test = false;
        Scanner input = new Scanner(System.in);
        System.out.println("indtast navn");
        //String[] navne1 = new String[10];
        String soeg = input.next();
        //laver de forskellige navne
        //soeg = "Lars";
        String[] navne = {"Lars", "Michael", "Lasse", "Thomas", "Benjamin", "Erik", "Lisa", "Kasper", "Johan", "Benny"}; // laver de forskellige korttyper.
        for (int i = 0; i <navne.length; i++) {
            if (soeg.equals(navne[i])) {
                test = true;
                System.out.println("Yes Navnet er fundet " + i + " " + soeg);

            }

            if (test == false) {
                System.out.println("ikke fundet din klovn");
            }
        }





    }
}