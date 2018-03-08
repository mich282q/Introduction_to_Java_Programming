package Chapter_9_Objects_and_Classes;

public class Opgave9_1 {
    public static void main(String[] args) {
        // her bruger jeg de Class som jeg laver ned under.

        Rectangle square1 = new Rectangle();
        System.out.println("The area of the square of is : " + square1.getArea());

        Rectangle square2 = new Rectangle(4, 40);
        System.out.println("The area of the square is : " + square2.getArea());


        Rectangle square3 = new Rectangle(3.5, 35.9);
        System.out.println("The area of the square is : " + square3.getArea());
    }
}
// Define the circle class with two constructors
class Rectangle {
    double width;
    double height;

    /**
     * giver de standart værdier
     */
    Rectangle() {height = 1; width = 1;}


    /**
     * her får de lov til at indtaste deres værdier
     */
    Rectangle(double newRadius, double newHeight) {
        height = newHeight;
        width = newRadius;
    }

    /**
     * Return the area of this Rectangle
     */
    double getArea() {
        return height * width;
    }
}