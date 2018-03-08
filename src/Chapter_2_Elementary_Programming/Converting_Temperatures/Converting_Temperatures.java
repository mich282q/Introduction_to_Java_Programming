package Chapter_2_Elementary_Programming.Converting_Temperatures;

// et lille program, hvor vi kan indtaste et antal sekunder, og det udskriver hvor mange minutter og sekunder det
// svarer til, "500 SEKUNDER SVARER TIL 8 MINUTTER OG 20 SEKUNDER."

public class Converting_Temperatures {

    public static void main(String [] args){
        //Det skal være "double" fordi det er 5.0/9 bliver et decimatal
        double celsius; //Deklarerer variablen
        double fahrenheit = 0; // Deklarerer variablen

        fahrenheit = 100; //Her kan jeg indtaste en tilfældig grad
        celsius = (5.0/9)*(fahrenheit -32); //omregner celsius til fahrenheit
        System.out.println(fahrenheit + " Fahrenheit. =" + celsius + " Celsius.");
        //her har jeg skrevet den tekst som dukker frem, når vi kører programmet

    }

}