/**
 * Conta Poupança que aplica 0.08% de juros ao dia.
 */

public class ContaPoupanca extends Conta {
    public ContaPoupanca(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    @Override
    public void aplicarJurosDiarios() {
        saldo *= 1.0008; // 0.08%
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Poupança:");
        super.imprimirExtrato();
    }
}
