/*This class describes a few of the possible attributes every Computer has 
 * It takes into account only the main attributes most people care about when
 * buying a new PC
*/

public class Computer {

    private String username; //All computers have a user
    protected String password; //All computers have a login password (it may be an empty value)
    public String storageCapacity; //Storage capacity
    public double amountGbRAM; //Amoung of RAM expressed in Gigabytes i.e. 4, 8, 16
    private boolean authorized = false; //This variable states wether the user is allowed to login or not, based on a set condition

    //Method to get the username and the password when turning on the PC
    public void setLoginInfo(String username, String password){
        this.username = username;
        this.password = password;
    }

    //This method is for internal use only. It displays the entered username to double check it was entered correctly
    private void checkCredentials() {
        String check = String.format("Username: ", this.username);
        System.out.println(check);
    }

    //Executes private method to check username input
    public static void main(String[] args) {
        Computer checkCredentials = new Computer();
        checkCredentials.checkCredentials();
    }

    //Method to determine if the user is authorized to login based on the entered username and password
    public boolean isAuthorized() {
        if (this.username == "admin" && this.password == "password") {
            authorized = true;
        } else {
            authorized = false;
        }
        return authorized;
    }
    
}
