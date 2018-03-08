package Chapter_5_Loops.DAT1_Lektion6;

public class MultiplikationsTable {

    public static void main(String[] args) {

        int i, j, resultat;

        for (j = 1; j <= 5; j++) { //kolonner
            for (i = 1; i <= 5; i++) { //rækker

                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
