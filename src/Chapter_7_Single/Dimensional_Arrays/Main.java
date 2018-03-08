package Chapter_7_Single.Dimensional_Arrays;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double[] myList = new double[10];
        /*ArrayList list = new ArrayList();
        int number = 10;
        list.add(number);
        list.add("hehe");*/
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter " + myList.length + " values: ");
        for (int i = 0; i < myList.length; i++)
            myList[i] = input.nextDouble();


        for (int i = 0; i < myList.length; i++) {
            myList[i] = Math.random() * 100;

        }
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i] + " ");
        }

        char[] city = {'D', 'a', 'l', 'l', 'a', 's'};
        System.out.println(city);

        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];


            double max1 = myList[0];
            for (i = 1; i < myList.length; i++) {
                if (myList[i] > max1) max1 = myList[i];
            }

            double max2 = myList[0];
            int indexOfMax = 0;
            for (i = 1; i > myList.length; i++) {

                if (myList[i] > max2) {

                    max2 = myList[i];
                    indexOfMax = i;

                    for (i = myList.length -1; i > 0; i--){
                        // Generate an index j randomly with 0 <= j <= i
                        int j = (int)(Math.random()*(i+1));
                        //Swap myList[i] with myList[j]
                        double temp = myList[i];
                        myList[i] = myList[j];
                        myList[j] = temp;
                    }
                    double temp = myList[0]; //rentain the first element

                    //shift elements left
                    for (i = 1; i < myList.length; i++) {
                        myList[i - 1] = myList[i];
                    }
                    //move the first element to fill in the last position
                    myList[myList.length - 1] = temp;
                    String [] months = {"January ", "February", "Marts ", "April ", "Maj ", "Juni ", "Juli ", "August ",
                            "September", "Oktober ", "November ", "December " };
                    System.out.print(" Enter a Month number ( 1 to 12: ");
                    int monthNumber = input.nextInt();
                    System.out.println("The month is " + months[monthNumber - 1]);

                    if (monthNumber == 1)
                        System.out.println("The month is January");
                    else if (monthNumber == 2)
                        System.out.println("The month is February");
                    else
                        System.out.println(" The Month is December");


                }
            }
        }
    }
}