public class CuentaBancaria {
    
    private int accountNumber;
    protected boolean activated;

    //Method to change current status of the bank account
    public void setActived(boolean actived) {
        this.activated = actived;
    }

    //Checks wether the account is active or not
    public boolean getActived(){
        return activated;
    }
}