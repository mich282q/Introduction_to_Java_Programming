/*
Michael Trans
Date: 23-10-2017
Michael_trans@hotmail.com
 */

package Chapter_12_Exception_Handling_and_Text_I.O.Lektion23_10_2017.Read_Write;

public class WriteDataWithAutoCloseOpgave {
        public static void main(String[] args) throws Exception {
            java.io.File file = new java.io.File("scores.txt");
            if (file.exists()) {
                System.out.println("File already exists");
                System.exit(0);
            }

            try (
                    // Create a file
                    java.io.PrintWriter output = new java.io.PrintWriter(file);
            ) {
                // Write formatted output to the file
                output.print("John T Smith ");
                output.println(90);
                output.print("Eric K Jones ");
                output.println(85);
                output.print("Michael T Trans ");
                output.println(25);
            }
        }
    }

