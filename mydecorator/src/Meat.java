public class Meat extends FoodDecorator {
    private Food food;
    private final String NAME = "肉";

    public Meat(Food food) {
        this.food = food;
    }

    @Override
    public String getDesc() {
        return this.food.getDesc() + " + " + NAME;
    }

    @Override
    public double cost() {
        //肉10元一份
        return this.food.cost() + 10D;
    }
}
