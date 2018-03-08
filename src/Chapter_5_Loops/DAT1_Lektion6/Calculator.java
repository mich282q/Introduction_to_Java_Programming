package Chapter_5_Loops.DAT1_Lektion6;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("indtast et tal");
        int numb = input.nextInt();

        //jeg har lavet en if som gør at hvis det gå op i 5 så får du highfive
        if (numb % 5 == 0){
            System.out.println("HighFive you has been good in school");
        }
        //jeg har lavet en if som gør at hvis det gå op i 2 så får du HighTwo
        if (numb % 2 == 0) {
            System.out.println("HighTwo you has been good in school");
        }
        boolean KanDelesMed2, KanDelesMed5;
        KanDelesMed2 = (numb % 5 ==0);
        KanDelesMed5 = (numb % 2 ==0);

        //hvis ingen af mine tal er rigtigt
        if(numb % 2 !=0 && numb % 5 !=0) {
            System.out.println("Hinothing Wrong go back to school and lean matematik");


        }
    }
}