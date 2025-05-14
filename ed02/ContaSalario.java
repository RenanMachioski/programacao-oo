/**
 * Conta Salário que não aplica juros.
 */

public class ContaSalario extends Conta {
    public ContaSalario(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    @Override
    public void aplicarJurosDiarios() {
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Salário:");
        super.imprimirExtrato();
    }
}
