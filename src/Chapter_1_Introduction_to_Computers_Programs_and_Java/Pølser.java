package Chapter_1_Introduction_to_Computers_Programs_and_Java;

public class Pølser {
    public static void main(String[] args) {
        //udskriver Hello World og skifter linje
        System.out.println("Hello World");
        //to variabler den første er tal, den anden er tekst
        int etTal = 4;
        String enTekst = "pølse.";
        //et loop (løkke) som starter i 0 og går til mindre end 5
        for (int i = 0; i <=3; i++){
            System.out.print(i+1); // OBS print skifter ikke til nye linje
            System.out.println(enTekst);//OBS println skifter til ny linje
        }
    }
}