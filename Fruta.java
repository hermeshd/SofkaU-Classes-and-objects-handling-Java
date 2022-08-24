import java.util.ArrayList; //Import necessary Java utilities

public class Fruta {

    public String name;
    private float averageWeight;
    public ArrayList<String> colors = new ArrayList<>();
    
    //Method that takes a color name and adds it to the possible colors this fruit can have
    public void setColor(String name) {
        colors.add(name);
    }

    //Returns all possible names for this fruit
    public ArrayList<String> getColors() {
        return colors;
    }
}