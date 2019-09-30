public class Potatoes extends FoodDecorator {
    private Food food;
    private final String NAME = "土豆";

    public Potatoes(Food food) {
        this.food = food;
    }

    @Override
    public String getDesc() {
        return this.food.getDesc() + " + "+ NAME;
    }

    @Override
    public double cost() {
        //每份土豆4元
        return this.food.cost() + 4D;
    }
}
