public class Test {
    public static void main(String[] args) {
        Food hotPot = new HotPot();
        Food tofu = new Tofu(hotPot);
        Food potatoes = new Potatoes(tofu);
        Food meat = new Meat(potatoes);
        System.out.println(meat.getDesc());
        System.out.println(meat.cost() + "元");
    }
}
