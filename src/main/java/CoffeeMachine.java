import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoffeeMachine implements DrinkMaker {

    public Coffee doDrink(Recipe.Drink recipe) {
        switch (recipe){
            case AMERICANO: new Recipe().doAmericano();
            break;
            case CAPPUCCINO: new Recipe().doCappuccino();
            break;
            case LATE: new Recipe().doLate();
            break;
        }
        return null;
    }
}
