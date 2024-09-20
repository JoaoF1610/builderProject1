import builder.Meal;
import builder.MealBuilder;


public class Principal {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegetal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total cost: " + vegMeal.getCost());

        Meal nonVegetal = mealBuilder.prepareNonVegetal();
        System.out.println("Chicken Meal");
        nonVegetal.showItems();
        System.out.println("Total cost: " + nonVegetal.getCost());
    }
}
