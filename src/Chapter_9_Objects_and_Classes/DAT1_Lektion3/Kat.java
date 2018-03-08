package Chapter_9_Objects_and_Classes.DAT1_Lektion3;

/* En klasse er en slags opskrift på, hvordan vi laver katte */
public class Kat {

    /* DATA FIELDS - Klassens data fields */
    int alder = -100;
    String navn = "NONAME";

    /* KONSTRUKTOR
     * Jubii, constructoren kaldes hver gang, der laves et nyt objekt.
     * Vi har besluttet, at alle katte SKAL have et navn ved oprettelsen
     * Derfor er der ingen Kat() konstruktor uden et navn som argument */
    Kat(String kattensNavn) {
        navn = kattensNavn;
        System.out.println("Ny kat er avlet: " + navn);
    }

    /* METODER - Her er de ting, som katterne kan gøre */
    public void hop() {
        System.out.println(navn + " hopper.");
    }

    public void sov() {
        System.out.println(navn + " sover.");
    }

    public void setAlder(int kattensAlder) {
        alder = kattensAlder;
        System.out.println("Kattens har nu fået sin alder oprettet.");
    }

    public void hvorGammel() {
        System.out.println(navn + " er " + alder + " år gammel.");
    }

    private void breath() {
        System.out.println("Katten trækker vejret.");
    }

}