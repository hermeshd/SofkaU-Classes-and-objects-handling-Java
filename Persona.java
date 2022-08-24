import java.util.Date; //Import necessary Java utilities

public class Persona {
    
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;

    //Method to set the name of the created Persona object
    public void setName(String name) {
        this.name = name;
    }
    //Returns the name of the Persona object
    public String getName() {
        return this.name;
    }
}