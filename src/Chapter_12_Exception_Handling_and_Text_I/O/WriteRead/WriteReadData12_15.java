/*
Michael Trans
Date: 26-10-2017
Michael_trans@hotmail.com
 */
package Chapter_12_Exception_Handling_and_Text_I.O.WriteRead;


import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteReadData12_15 {

    public static void main(String[] args) throws java.io.IOException {
        java.io.File file = new java.io.File("Exercise12_15.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }

        // Create a file
        java.io.PrintWriter output = new java.io.PrintWriter(file);

        // Write formatted output to the file
        // creating a random number of scores to test exercise
        int numberOfScores = (int) (Math.random() * 100 + 20);
        try {
            output = new PrintWriter("Exercise12_15.txt");
            output.write(randomNumbers(numberOfScores));
            output.close();
            System.out.println(numberOfScores + " scores to Exercise12_15.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static String randomNumbers(int size) {

        String s = "";
        for (int i = 0; i < size; i++) {
            s += " " + (int) (Math.random() * 100);
        }

        return s;
    }
}




