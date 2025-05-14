public class Conta {
    protected String cliente;
    protected double saldo;

    public Conta(String cliente, double saldoInicial) {
        this.cliente = cliente;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) saldo -= valor;
    }

    public void transferir(Conta destino, double valor) {
        if (valor > 0 && saldo >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void imprimirExtrato() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Saldo: R$" + saldo);
    }

    public void aplicarJurosDiarios() {
        // Implementado nas subclasses
    }
}

