public class Recipe {

    enum Drink {
        AMERICANO,
        CAPPUCCINO,
        LATE
    }

    public Recipe() {
    }

    static class Ingredient {
        private static final int WATER = 50;
        private static final int DOUBLE_WATER = 100;
        private static final int SEED = 50;
        private static final int DOUBLE_SEED = 100;
        private static final int MILK = 50;
        private static final int DOUBLE_MILK = 100;

     }

   public void doAmericano(){
       System.out.println("Ingredients: " + "water = " + Ingredient.WATER + ", seed = " + Ingredient.SEED);
       System.out.println("Your americano, please");
    }

    public void doCappuccino(){
        System.out.println("Ingredients: " + "water =" + Ingredient.WATER + ", seed = " + Ingredient.SEED + ", milk = " + Ingredient.MILK);
        System.out.println("Your cappuccino, please");
    }
    public void doLate(){
        System.out.println("Ingredients: " + "water =" + Ingredient.DOUBLE_WATER + ", seed = " + Ingredient.DOUBLE_SEED + ", milk = " + Ingredient.DOUBLE_MILK);
        System.out.println("Your late, please");
    }
}
