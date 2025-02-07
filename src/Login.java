import java.util.Scanner;

public class Login {
    public  boolean login(HESAP hesap){
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = scanner.nextLine();
        System.out.println("Username : ");
        username = scanner.nextLine();
        System.out.println("Password : ");
        password = scanner.nextLine();
        if (username.equals(hesap.getUsername()) && password.equals(hesap.getPassword())) {
            return true;

        }
        else {
            return false;

        }
    }
}
