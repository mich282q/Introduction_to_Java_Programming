package Chapter_9_Objects_and_Classes.Bord_9_10.Animals;

public class Dog {


    String name = "";
    double age = 0;


    Dog(String newName, double newAge){
        name = newName;
        age = newAge;
    }

    String getName(){
        return name;
    }

    double getDogYears() {
        return age;
    }

}