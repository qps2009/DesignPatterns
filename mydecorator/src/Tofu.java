public class Tofu extends FoodDecorator {
    private Food food;
    private final String NAME = "豆腐";

    public Tofu(Food food) {
        this.food = food;
    }

    @Override
    public String getDesc() {
        return food.getDesc() + " + " + NAME;
    }

    @Override
    public double cost() {
        //每份豆腐4元
        return food.cost() + 4D;
    }
}
