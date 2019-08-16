public class Main {
    public static final long MONEY_FOR_LATE = 4000;
    public static final long MONEY_FOR_CAPPUCCINO = 3000;
    public static final long MONEY_FOR_AMERICANO = 2000;

    public static void main(String[] args) {
        MoneyTaker moneyTaker = new Terminal(new CoffeeMachine());
        moneyTaker.start(Recipe.Drink.LATE, MONEY_FOR_LATE);





    }
}
