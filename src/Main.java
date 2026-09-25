public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.addCustomer("Nadine", "Desvita");
        bank.addCustomer("Potaa", "Alicia");

        Customer c1 = bank.getCustomer(0);
        c1.setAccount(new Account(100000));
        c1.setAccount(new Account(250000));

        Customer c2 = bank.getCustomer(1);
        c2.setAccount(new Account(500000));

        c1.getAccount(0).deposit(50000);
        c2.getAccount(0).withdraw(100000);

        System.out.println("=== DATA NASABAH BANK ===");
        System.out.println("Jumlah Customer: " + bank.getNumOfCustomers());

        for (int i = 0; i < bank.getNumOfCustomers(); i++) {
            Customer c = bank.getCustomer(i);

            System.out.println("\nNama: " +
                    c.getFirstName() + " " + c.getLastName());

            for (int j = 0; j < c.getNumOfAccounts(); j++) {
                System.out.println("Akun " + (j + 1)
                        + " | Saldo: Rp" + c.getAccount(j).getBalance());
            }
        }
    }
}