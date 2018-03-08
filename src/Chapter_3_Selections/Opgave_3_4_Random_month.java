package Chapter_3_Selections;

public class Opgave_3_4_Random_month {
    public static void main(String[] args) {
        int randomlyMonth = (int) (Math.random() * 12 + 1); // en Random Generator som vælger et tal fra 1 til 12 (+ 1 så den ikke vælger 0)

// her får vi print overskrift ud
        System.out.println("Random print ud of the month");

        // månenderne
        switch (randomlyMonth) {
            case 1:
                System.out.println("Januar");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("Marts");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("Maj");
                break;
            case 6:
                System.out.println("Juni");
                break;
            case 7:
                System.out.println("Juli");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("oktober");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;


        }
    }
}