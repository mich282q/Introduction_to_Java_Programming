package Chapter_9_Objects_and_Classes.Bord_9_10.Animals;

public class Test_Animals {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Alfred", 3);
        System.out.println(dog1.getName() + " har alderen " + dog1.getDogYears());

        System.out.println("");

        Cat k1 = new Cat();
        Cat k2 = new Cat("Missemor");
        Cat k3 = new Cat(7);
    }
}