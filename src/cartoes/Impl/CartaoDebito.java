package cartoes.Impl;

import banco.ContaBancaria;
import cartoes.Cartao;

public class CartaoDebito extends Cartao {
    public CartaoDebito(ContaBancaria contaBancaria) {
        super(contaBancaria);
    }

    @Override
    public void realizarPagamento(double valor) throws Exception {
        double saldoFuturo = getSaldo() - valor;        
        if (saldoFuturo < 0) {
            throw new Exception("Saldo insuficiente");
        }

        getContaBancaria().debitar(valor);
    }
}
