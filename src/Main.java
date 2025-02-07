public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        HESAP hesap = new HESAP("Özcan Atış", "12345",2000);

        atm.calis(hesap);
        System.out.println("Programdan çıkılıyor...");
    }
}