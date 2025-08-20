public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0; 
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$%.2f realizado com sucesso na conta %s.\n", valor, numeroConta);
        } else {
            System.out.println("Valor de depósito deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$%.2f realizado com sucesso na conta %s.\n", valor, numeroConta);
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para realizar o saque.");
        } else {
            System.out.println("Valor de saque deve ser positivo.");
        }
    }

    public void consultarSaldo() {
        System.out.printf("Saldo atual da conta %s: R$%.2f\n", numeroConta, saldo);
    }
}
