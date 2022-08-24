
public class Main {
    public static void main(String[] args) {
     
        Computer test = new Computer();
        test.setLoginInfo("admins", "password");
        boolean isAuthorized = test.isAuthorized();
        System.out.println(isAuthorized);

    }
}