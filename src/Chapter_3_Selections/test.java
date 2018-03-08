package Chapter_3_Selections;

public class test {


    public static void main(String[] args)
    {
        int randYear = (int)(Math.random() * 12 + 1);

        System.out.println("*** RANDOM MONTH GENERATOR ***\n");

        switch(randYear)
        {
            case 1: System.out.println("Computer randomly generated: January");
                break;

            case 2: System.out.println("Computer randomly generated: February");
                break;

            case 3: System.out.println("Computer randomly generated: March");
                break;

            case 4: System.out.println("Computer randomly generated: April");
                break;

            case 5: System.out.println("Computer randomly generated: May");
                break;

            case 6: System.out.println("Computer randomly generated: June");
                break;

            case 7: System.out.println("Computer randomly generated: July");
                break;

            case 8: System.out.println("Computer randomly generated: August");
                break;

            case 9: System.out.println("Computer randomly generated: September");
                break;

            case 10: System.out.println("Computer randomly generated: October");
                break;

            case 11: System.out.println("Computer randomly generated: November");
                break;

            case 12: System.out.println("Computer randomly generated: December");
                break;

        }

    }

}