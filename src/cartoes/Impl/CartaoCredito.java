package cartoes.Impl;

import banco.ContaBancaria;
import cartoes.Cartao;

public class CartaoCredito extends Cartao {
    private int _limite;
    private double _milhas;
    private double _saldoDevedor;    

    public CartaoCredito(ContaBancaria contaBancaria, int limite) {
        super(contaBancaria);
        _limite = limite;
        _milhas = 0;
        _saldoDevedor = 0;
    }

    public int getLimite() {
        return _limite;
    }	

    public double getMilhas() {
        return _milhas;
    }

    public double getSaldoDevedor() {
        return _saldoDevedor;
    }

    @Override
    public double getSaldo() {
        return getLimite() - getSaldoDevedor();
    }

    @Override
    public void realizarPagamento(double valor) throws Exception {
        double limiteRestante = getSaldo() - valor;        
        if (limiteRestante < 0) {
            throw new Exception("Excedeu o limite de crédito");
        }

        _milhas += valor;
        _saldoDevedor += valor;
    }

    public void pagarFatura(double valor) {
        _saldoDevedor -= valor;
    }
}
