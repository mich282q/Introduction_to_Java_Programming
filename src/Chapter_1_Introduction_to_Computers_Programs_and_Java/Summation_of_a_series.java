package Chapter_1_Introduction_to_Computers_Programs_and_Java;

public class Summation_of_a_series {
    public static void main(String[] args) {
        // int start = 1;
        int end = 10;
        System.out.println(sumGauss(end));
    }
    public static int sumGauss(int cap){
        return (cap * (cap +1 )/2);
    }
}
