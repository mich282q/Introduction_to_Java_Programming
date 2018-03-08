package Chapter_7_Single.Dimensional_Arrays;

public class Java_Calculator {
    public static void main(String[] args) {
        // Check number of strings passed

        if (args.length !=3){ // der skal være 3 variable ellers kan den ikke regne det ud

            System.out.println("Usage: Java Calculator operand1 operator operand2 ");
            System.exit(0);

        }
        //The result of the operation
        int result = 0;

        //determine the operator
        switch (args[1].charAt(0)){
            case '+': result = Integer.parseInt(args[0])+ Integer.parseInt(args[2]);

                break;
            case '-': result = Integer.parseInt(args[0])- Integer.parseInt(args[2]);

                break;
            case '.': result = Integer.parseInt(args[0])* Integer.parseInt(args[2]);

                break;
            case '/': result = Integer.parseInt(args[0])/ Integer.parseInt(args[2]);
        }
        //Display result som hænger samme med variable at der er 3.
        System.out.println(args[0]+ ' ' + args[1] + ' ' +args[2]+ " = " + result);
    }
}