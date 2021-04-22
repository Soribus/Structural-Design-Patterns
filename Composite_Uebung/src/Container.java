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

    public int calculateWeight(){
        int totalWeight = 0;
        for (Component c:content
             ) {
            totalWeight = totalWeight + c.calculateWeight();
        }
        return totalWeight;
    }

}
