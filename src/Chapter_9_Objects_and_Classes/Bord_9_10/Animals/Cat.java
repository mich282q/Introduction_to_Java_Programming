package Chapter_9_Objects_and_Classes.Bord_9_10.Animals;

public class Cat {
    protected int lives;

    public Cat(){
        System.out.println("Ny misser objekt er lavet.");
    } //k1 = new Cat();

    public Cat(String navn) {
        System.out.println("Katteobjekt er oprettet: " + navn);
    } //k2 = new Cat("Misser);

    public Cat(int antalLiv){
        System.out.println("Kat er oprettet, antal liv er: " + antalLiv);
    } // k3 = new Cat(6);
}