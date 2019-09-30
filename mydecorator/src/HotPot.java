public class HotPot extends Food {
    public HotPot() {
        this.setDesc("火锅");
    }

    @Override
    public double cost() {
        return 20D;
    }
}
