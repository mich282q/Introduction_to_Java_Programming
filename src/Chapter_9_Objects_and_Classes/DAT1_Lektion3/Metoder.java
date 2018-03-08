package Chapter_9_Objects_and_Classes.DAT1_Lektion3;

public class Metoder {

    public int x;

    public static void main(String[] args) {
        System.out.println(1+2);

        Metoder m = new Metoder();
        int resultat = m.sum(10, 20);
        System.out.println(resultat);
        resultat = m.sum(15, 25);
        System.out.println(resultat);

        Metoder.udskrivHej();
        udskrivHej();
        udskrivHej();

        lassesNavn("Lasse");

        double skabnen = (int) 6*Math.random()+1;
        System.out.println(skabnen);

        System.out.println(m.sum3(8, 5 , 10));

        indtastOgVisNavn("András");
        ditnavn("Daniel");

    }
    private static void ditnavn(String daniel) {
    }

    public Metoder() {

    }

    public int sum(int a, int b) {
        // Her implementer jeg metoder
        int resultat = a + b;
        return resultat;
        /*
        1
        2
        3
        4
        5
        6
        7
         */
    }

    public static void udskrivHej() {
        System.out.println("Hej");
    }

    public int sum3(int a, int b,int c) {
        return a + b +c;
    }

    public static void indtastOgVisNavn(String navn) {
        System.out.println("Hej " + navn);
    }

    public static void hejThomas() {
        System.out.println("Hej Thomas :i");
    }

    public static void MegetBeskrivendeMetodeMadsN() {
        System.out.println("Hej Mads Nielsen");
    }

    public static void lassesNavn(String navn){
        System.out.println(navn + " har lavet sin metode");
    }


    public static void indtastDitNavn(String ditNavn) {
        System.out.println("Jeg hedder " + ditNavn);
    }

    public static void hejLiselotte() {
        System.out.println("Hej Liselotte");
    }

    public static void navnMikkel() {
        System.out.println("Mit navn er Mikkel Sørensen. ");
    }

    public static void hejErik() {
        System.out.println("Hej Erik");
    }

    public static void hejMichaelH(){
        System.out.println("Hej Michael");
    }

    public static void nameNiels() {
        System.out.println("My name is Niels");
    }


    public static void hejmichael(){
        System.out.println("Hej Michael");
    }

}
