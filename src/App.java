import banco.ContaBancaria;
import cartoes.Impl.CartaoCredito;
import cartoes.Impl.CartaoDebito;

public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.creditar(100);

        CartaoDebito cartaoDebito = new CartaoDebito(contaBancaria);
        cartaoDebito.realizarPagamento(50);
        System.out.println("Limite: " + cartaoDebito.getSaldo());
        System.out.println("Saldo da conta: " + cartaoDebito.getContaBancaria().getSaldo());

        cartaoDebito.realizarPagamento(30);
        System.out.println("Limite: " + cartaoDebito.getSaldo());
        System.out.println("Saldo da conta: " + cartaoDebito.getContaBancaria().getSaldo());

        CartaoCredito cartaoCredito = new CartaoCredito(contaBancaria, 300);
        cartaoCredito.realizarPagamento(50);
        System.out.println("Limite: " + cartaoCredito.getSaldo());
        System.out.println("Saldo da conta: " + cartaoCredito.getContaBancaria().getSaldo());
        System.out.println("Milhas: " + cartaoCredito.getMilhas());

        cartaoCredito.realizarPagamento(150);
        System.out.println("Limite: " + cartaoCredito.getSaldo());
        System.out.println("Saldo da conta: " + cartaoCredito.getContaBancaria().getSaldo());
        System.out.println("Milhas: " + cartaoCredito.getMilhas());

        cartaoCredito.pagarFatura(150);

        cartaoCredito.realizarPagamento(200);
        System.out.println("Limite: " + cartaoCredito.getSaldo());
        System.out.println("Saldo da conta: " + cartaoCredito.getContaBancaria().getSaldo());
        System.out.println("Milhas: " + cartaoCredito.getMilhas());
    }
}
