public class Driver {

    public static void main(String[] args) {
        BankAccount ali = new BankAccount("Ali");
        BankAccount maria = new BankAccount("Maria");


        ali.getCredentials();
        ali.deposit();

        ali.withdraw();
        ali.withdraw();

        maria.getCredentials();
        maria.deposit();
        ali.transfer(maria);

        ali.payCreditCardBill(45);
        maria.payCreditCardBill(100);




    }
}

