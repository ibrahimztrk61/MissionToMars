public class Roket implements UzayGemisi {
    public int currentWeight;
    private int cost;
    private int maxWeight;
    private int weight;



    //Constructor for Rocket Class


    public Roket(int cost, int weight, int maxWeight) {
        this.cost = cost;
        this.weight = weight;
        this.maxWeight = maxWeight;
    }
    // Getter methods
    public int getCost() {
        return cost;
    }
    public int getMaxWeight() {
        return maxWeight;
    }

    public int getWeight(){
        return weight;
    }

    @Override
    public boolean launch() {
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Item item) {
        return false;
    }

    @Override
    public void carry(Item item) {

    }
}
