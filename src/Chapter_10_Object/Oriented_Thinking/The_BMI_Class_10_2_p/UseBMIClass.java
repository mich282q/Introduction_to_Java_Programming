package Chapter_10_Object.Oriented_Thinking.The_BMI_Class_10_2_p;

public class UseBMIClass {

    public static void main(String[] args) {
        BMI bmi1 = new BMI(" Kim Yang ", 18 , 70, 1.70);
        System.out.println(" The BMI for " + bmi1.getName()+ " is " + bmi1.getBMI()+ " " + bmi1.getStatus());

        BMI bmi2 = new BMI(" Susan King ", 70 , 1.70);
        System.out.println(" The BMI for " + bmi2.getName()+ " is " + bmi2.getBMI()+ " " + bmi2.getStatus());

        BMI bmi3 = new BMI(" Michael Trans ", 77 , 1.78);
        System.out.println(" The BMI for " + bmi3.getName()+ " is " + bmi3.getBMI()+ " " + bmi3.getStatus());

    }
}
