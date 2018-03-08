package Chapter_1_Introduction_to_Computers_Programs_and_Java;

public class I_Love_Java {

    public static void main(String[] args) {
        //udskriver Hello World og skifter linje
        System.out.println("Hello World");
        //to variabler den første er tal, den anden er tekst
        String enTekst = "i love Java.";
        //et loop (løkke) som starter i 0 og går til mindre end 5
        for (int i = 0; i <=4; i++){
            System.out.println(enTekst);//OBS println skifter til ny linje
        }
    }
}