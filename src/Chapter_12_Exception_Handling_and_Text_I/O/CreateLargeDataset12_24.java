/*
Michael Trans
Date: 26-10-2017
Michael_trans@hotmail.com
 */
package Chapter_12_Exception_Handling_and_Text_I.O;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CreateLargeDataset12_24 {

        public static void main(String[] args) throws FileNotFoundException {
            //laver en fil som hedder Salary.txt
            File file = new File("Salary.txt");

            //hvis den allerede findes fortæller den det.
            if (file.exists()){
                System.out.println("Files " + file.getName() + " findes allerede");
                System.exit(0);
            }
            String rank = "";
            double Salary;
            try(
                    PrintWriter output = new PrintWriter(file);
            ) {
                //laver 1000 personer
                for (int i = 1; i <= 1000; i++){
                    output.print("FirstName" + i + " LastName" + i);
                    rank = getRank();
                    Salary = getLøn(rank);
                    output.printf(" " + rank + " %.2f\n", Salary);
                }
            }
        }

        public static String getRank(){
            String[] ranks = {"assistant", "associate", "full"};
            return ranks[(int)(Math.random()*ranks.length)];
        }

        //giver løn til person random så de ikke få det samme.
        public static double getLøn(String rank) {
            if (rank.equals("assistant"))
                return 50000 + (double)(Math.random()*30001);

            else if (rank.equals("associate"))
                return 60000 + (double)(Math.random()*50001);

            else
                return 75000 + (double)(Math.random()*55001);
        }
    }

