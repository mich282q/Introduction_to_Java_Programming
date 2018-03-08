package Chapter_9_Objects_and_Classes.Bord_9_10;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello World!");

        Bord bord1 = new Bord();

        bord1.setMateriale("Træ");
        System.out.println("Bord1 er lavet af " + bord1.getMateriale());

        bord1.setAntalBordben(10);
        System.out.println("Bord1 har " + bord1.getAntalBordben() + " ben");
    }
}