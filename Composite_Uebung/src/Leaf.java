public class Leaf implements Component{

    private int weight;

    public Leaf(int weight) {
        this.weight = weight;
    }

    public int calculateWeight() {
        return weight;
    }
}
