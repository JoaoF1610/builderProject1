package builder;

public class VegBurger extends Burger {
    
    @Override
    public float price() {
        return 2.0f;
    }

    @Override
    public String name() {
        return "Vegan Burger";
    }

}
