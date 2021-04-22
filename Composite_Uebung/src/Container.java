import java.util.List;

public class Container implements Component{

    /**
     * The content of the Container
     */
    private List<Component> content;

    public void add(Component c){
        content.add(c);
    }

    public void remove(Component c){
        content.remove(c);
    }

    /**
     * calculates the weight of the Container
     * @return
     */
    public int calculateWeight(){
        //every box has a base weight of 1 gram
        int totalWeight= 1;
        for (Component c:content
             ) {
            totalWeight = totalWeight + c.calculateWeight();
        }
        return totalWeight;
    }

}
