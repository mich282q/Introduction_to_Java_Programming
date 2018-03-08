package Chapter_10_Object.Oriented_Thinking.The_MyPoint_Class_10_4_p;

public class MyPoint {
    private double x;
    private double y;

    //No-arg Constructor
    public MyPoint() {
        double x = 0;
        double y = 0;
    }

    //Constructor that creates a specified point
    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //get x
    public double getX() {
        return x;
    }

    //get y
    public double getY() {
        return y;
    }


    //get metoder som retunere distancen mellem x og y
    public double distance() {
        double z = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
        return z;
    }

    public double distance(MyPoint mypoint) {
        return Math.sqrt(Math.pow(mypoint.getX() - x, 2) + Math.pow(mypoint.getY() - y, 2));
    }

    public double distance(double x, double y) {
        return distance(new MyPoint(x, y));

    }
}