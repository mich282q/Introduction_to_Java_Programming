package Chapter_12_Exception_Handling_and_Text_I.O;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ProcessScoresInATestFile12_14 {




        public static void main(String[] args) {

            // creating a random number of scores to test exercise
            int numberOfScores = (int) (Math.random() * 100 + 150);
            try {
                PrintWriter output = new PrintWriter("scores.txt");
                output.write(randomNumbers(numberOfScores));
                output.close();
                System.out.println(numberOfScores + " scores to scores.txt");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            //gør at du skal indtaste navnet på den mappe hvor tallen er inde i
            Scanner input = new Scanner(System.in);
            System.out.print("Enter filename: ");
            File filename = new File(input.next());
            input.close();

            if (!filename.exists()) {
                System.out.println(filename + " does not exist.");
                System.exit(1);
            }
            // Creating arrayList to hold an unspecified number of scores
            ArrayList<Integer> scores = new ArrayList<>();
            try {
                input = new Scanner(filename);
                while (input.hasNextInt()) {
                    scores.add(input.nextInt());
                }
                System.out.println("Read12_25 " + scores.size() +" scores from " + filename);
            } catch (FileNotFoundException ex) {

                System.out.println("Error reading " + filename);
                ex.printStackTrace();
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


