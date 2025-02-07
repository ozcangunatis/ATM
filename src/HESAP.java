import java.time.temporal.TemporalAmount;

public class HESAP {
    private String username;
    private String password;
    private int Balance;

    public HESAP(String username, String password, int balance) {
        this.username = username;
        this.password = password;
        this.Balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }
    public void deposit(int amount){
        Balance += amount;
        System.out.println("Your new balance: " + Balance);
    }
    public void withdraw(int amount){
        if (Balance - amount < 0) {
            System.out.println("You cannot do that!");
            System.out.println("Your balance: " + Balance);

        }
        else {
            Balance -= amount;
            System.out.println("Your new balance: " + Balance);
        }
    }
}

