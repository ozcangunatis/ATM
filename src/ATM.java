import java.util.Scanner;

public class ATM {
    public void calis(HESAP hesap){
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the bank");
        System.out.println("*********");
        System.out.println("User Login");
        System.out.println("*******************");
        System.out.println("Username: ");
        scanner.nextLine();
        System.out.println("Password: ");
        scanner.nextLine();
        int login_rights = 3;
        while (true){
            if(login.login(hesap)){
                System.out.println("Logged in succesfully");
                break;
            }
            else {
                System.out.println("Wrong username or password");
                login_rights-= 1;
                System.out.println("Login rights:"+login_rights);
                if (login_rights == 0) {
                    System.out.println("You have 3 login attempts left");
                    return;
                }
            }
        }
        System.out.println("*********");
        String islemler = "1. Show your BALANCE:\n"
               + "2.Deposit\n"
                + "3.Withdraw\n"
                + "4.Press  q for exit";
        System.out.println(islemler);
        System.out.println("******************");

    while (true){
        System.out.println("Select action: ");
        String islem = scanner.nextLine();
        if(islem.equals("q")){
            System.out.println("Exiting...");
            break;
        }
        else if(islem.equals("1")){

            System.out.println("Your Balance" + hesap.getBalance());

        }
        else if (islem.equals("2")) {
            System.out.print("How much do you want deposit : ");
            int amount = scanner.nextInt();
            scanner.nextLine();
            hesap.deposit(amount);
        }
else if (islem.equals("3")){
    System.out.print("How much do you want withdraw : ");
    int amount = scanner.nextInt();
    scanner.nextLine();
    hesap.withdraw(amount);

}
else {
    System.out.println("Wrong input");
}
    }



    }
}
