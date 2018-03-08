package Chapter_9_Objects_and_Classes;

public class Stock_Opgave9_2 {
    public static void main(String[] args){
        //laver en Class og en stock
        Stock test = new Stock("Oracle Corporation","ORCL", 34.35,34.50);
        System.out.println("A New Stock with the name" + test.name + "and symbol" + test.symbol +"has been made.");
        System.out.println("It has a pricechange of " +test.getChangePrice()+" %.");
    }
    static class Stock {
        String symbol;
        String name;
        double previousClosingPrice;
        double currentPrice;

        // her får vi tillades til at skrive værdierne i classen

        Stock(String newName, String newSymbol, double newPrices, double oldPrice){
            name=newName;
            symbol=newSymbol;
            currentPrice=newPrices;
            previousClosingPrice=oldPrice;

        }
        //her laver man en udregner, der tillader person at få forskelle i procent
        double getChangePrice(){
            return currentPrice / previousClosingPrice;
        }
    }
}