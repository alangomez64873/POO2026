package Talleres.Taller01;

public class TestBankAccount {
    public static void main(String[] args) {
       var account = new BankAccount();

        // Depósito válido
        if (account.deposit(500) == true) {
            System.out.println("The deposit is accepted");
        } else {
            System.out.println("The deposit is not accepted");
        }

        // Retiro válido
        if (account.withdraw(200) == true) {
            System.out.println("The withdrawal is accepted");
        } else {
            System.out.println("The withdrawal is not accepted");
        }

        // Retiro inválido (monto superior al saldo)
        if (account.withdraw(1000) == true) {
            System.out.println("The withdrawal is accepted");
        } else {
            System.out.println("The withdrawal is not accepted");
        }
    }
}
