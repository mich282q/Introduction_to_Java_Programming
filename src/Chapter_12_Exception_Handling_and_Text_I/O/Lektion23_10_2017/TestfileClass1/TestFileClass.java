/*
Michael Trans
Date: 23-10-2017
Michael_trans@hotmail.com
 */

package Chapter_12_Exception_Handling_and_Text_I.O.Lektion23_10_2017.TestfileClass1;

import java.io.File;

public class TestFileClass {
    public static void main(String[] args) {
        File file = new File("images/Træ-med-lyserøde-blomster.jpg");
        System.out.println("Does it exist? " + file.exists());
        System.out.println("The file has " + file.length() + " bytes");
        System.out.println("Can it be read? " + file.canRead());
        System.out.println("Can it be written? " + file.canWrite());
        System.out.println("Is it a directory? " + file.isDirectory());
        System.out.println("Is it a file? " + file.isFile());
        System.out.println("Is it absolute? " + file.isAbsolute());
        System.out.println("Is it hidden? " + file.isHidden());
        System.out.println("Absolute path is " +
                file.getAbsolutePath());
        System.out.println("Last modified on " +
                new java.util.Date(file.lastModified()));
    }
}
