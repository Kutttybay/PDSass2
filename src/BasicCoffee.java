class BasicCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Zebra Coffee";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}