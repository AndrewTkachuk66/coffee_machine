public class Terminal implements MoneyTaker {
    DrinkMaker drinkMaker;
    private long cappuccinoPrice = 3000;
    private long americanoPrice = 2000;
    private long latePrice = 4000;

    public long getDrinkPrice(Recipe.Drink drink) {
        switch (drink) {
            case CAPPUCCINO:
                return cappuccinoPrice;
            case AMERICANO:
                return americanoPrice;
            case LATE:
                return latePrice;
        }
        return 0;
    }

    public Terminal(DrinkMaker drinkMaker) {
        this.drinkMaker = drinkMaker;
    }

    @Override
    public boolean takeMoney(long money, String drink) {
        if (drink.equals("AMERICANO") && money == americanoPrice)
            return true;
        else if (drink.equals("CAP") && money == cappuccinoPrice)
            return true;
        else if (drink.equals("LATE") && money == latePrice)
            return true;
        return false;
    }

    @Override
    public String whatDrink(Recipe.Drink drink) {
        switch (drink) {
            case AMERICANO:
                return "AMERICANO";

            case CAPPUCCINO:
                return "CAP";

            case LATE:
                return "LATE";

        }
        return null;
    }

    public boolean validation(long money, long drinkPrice) {
        if (money == drinkPrice)
            return true;
        return false;
    }

    public void start(Recipe.Drink drink, long moneyForDrink) {
        takeMoney(moneyForDrink, whatDrink(drink));
        if (validation(moneyForDrink, getDrinkPrice(drink))) {
            drinkMaker.doDrink(drink);
        } else System.out.println("Something was wrong");
    }
}
