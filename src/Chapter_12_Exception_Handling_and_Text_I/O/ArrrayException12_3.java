/*
Michael Trans
Date: 26-10-2017
Michael_trans@hotmail.com
 */
package Chapter_12_Exception_Handling_and_Text_I.O;

import java.io.File;
import java.util.Scanner;

public class ArrrayException12_3 {


    public static void main(String[] args) {

        // creating a random number of scores to test exercise
        int numberOfScores = (int) (Math.random() * 100 +20);


        //gør at du skal indtaste navnet på den mappe hvor tallen er inde i
        Scanner input = new Scanner(System.in);
        System.out.print("put in the index of the array ");
        File filename = new File(input.next());
        input.close();

        if (!filename.exists()) {
            System.out.println(filename + " out of bounds.");
            System.exit(1);
        }

        }
    }
