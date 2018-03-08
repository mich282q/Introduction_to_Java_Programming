package Chapter_7_Single.Dimensional_Arrays;

public class DeckOfCards {
    public static void main(String[] args) {
        int[] deck = new int[52]; //laver et array med 52 kort
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"}; // laver de forskellige korttyper.
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"}; //laver en array med kortnummerne.

        //Initialize the cards
        for (int i = 0; i < deck.length; i++) // et loop som får 'i' til at starte i 0 og går frem til længde af deck arry hvor den går 1 op hver gang
            deck[i] = i; // vælger i som er et tilfældigt kort

        //Shuffle the cards
        for (int i = 0; i < deck.length; i++) { // et loop som får 'i' til at starte i 0 og går frem til længde af deck arry hvor den går 1 op hver gang
            //the Generate an index randomly
            int index = (int) (Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
        //Display the first four cards
        for (int i = 0; i < 4; i++) //4 fortæller om du får 4 kort eller hvis der stod 2 så fik du 2 kort.
        {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Card Number " + deck[i] + " : " + rank + " of " + suit); //skriver en tekst
        }
    }
}