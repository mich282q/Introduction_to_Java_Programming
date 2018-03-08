/*
Michael Trans
Date: 26-10-2017
Michael_trans@hotmail.com
 */
package Chapter_12_Exception_Handling_and_Text_I.O.WriteRead;

import java.util.Scanner;

public class Read {
    public static void main(String[] args) throws Exception {
        // Create a File instance
        java.io.File file = new java.io.File("Exercise12_15.txt");

        // Create a Scanner for the file
        Scanner input = new Scanner(file);

        // Read12_25 data from a file
        while (input.hasNext()) {
            int numberOfScores = input.nextInt();
            System.out.println(
                    numberOfScores);
        }

        // Close the file
        input.close();
    }

}
