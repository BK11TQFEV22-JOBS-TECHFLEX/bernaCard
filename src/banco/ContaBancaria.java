package banco;

public class ContaBancaria {
    private double _saldo;

    public ContaBancaria() {
        _saldo = 0;
    }

    public ContaBancaria(double saldo) {
        _saldo = saldo;
    }

    public void creditar(double valor) {
        _saldo += valor;
    }

    public void debitar(double valor) {
        _saldo -= valor;
    }

    public double getSaldo() {
        return _saldo;
    }
}
