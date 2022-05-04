package cartoes;

import banco.ContaBancaria;

public abstract class Cartao {
    private ContaBancaria _contaBancaria;

    protected Cartao(ContaBancaria contaBancaria) {
        _contaBancaria = contaBancaria;
    }

    public double getSaldo() {
        return getContaBancaria().getSaldo();
    }    

    public abstract void realizarPagamento(double valor) throws Exception;

    public ContaBancaria getContaBancaria() {
        return _contaBancaria;
    }
}
