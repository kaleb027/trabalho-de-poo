public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("12345-6", "Kaleb Victor");
        ContaBancaria conta2 = new ContaBancaria("98765-4", "Marlucia Rocha");

        conta1.depositar(500.00);
        conta1.consultarSaldo();
        conta1.sacar(200.00);
        conta1.consultarSaldo();
        conta1.sacar(400.00); 

        conta2.depositar(1000.00);
        conta2.consultarSaldo();
        conta2.sacar(300.00);
        conta2.consultarSaldo();
        conta2.sacar(800.00); 
    }
}
