//This class describes a few of the possible attributes every game has
import java.util.ArrayList; //Import necessary Java utilities

public class Game {
    
    public String title; //Game title
    public String genre; //Game genre: i.e. FPS, MOBA, Racing
    public ArrayList<String> platforms = new ArrayList<>(); //Avaliable platforms for the game: i.e. PC, PS5, Xbox One
    public int maxPlayers; //Maximum number of players per game

    //Method to set the platforms in which the game can run
    public void setPlatforms(String platformName) {
        platforms.add(platformName);
    }

    //Returns a list of platforms in which the game can run
    public ArrayList<String> getPlatforms() {
        return platforms;
    }
}
