public interface MoneyTaker {
    boolean takeMoney(long money, String drink);

    String whatDrink(Recipe.Drink drink);

    boolean validation(long money, long price);

    void start(Recipe.Drink drink, long moneyForDrink);
}
