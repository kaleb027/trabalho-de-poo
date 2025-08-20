public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void mostrarInformacoes() {
        System.out.println("Informações do Carro:");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
    }

    public void ligar() {
        System.out.println("\nO carro " + this.marca + " " + this.modelo + " está ligado!");
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro("Skyline", "Nissan", 2000);
        Carro carro2 = new Carro("Honda", "Civic", 2020);

        System.out.println("Carros Criados");
        carro1.mostrarInformacoes();
        System.out.println(); 
        carro2.mostrarInformacoes();

        System.out.println("Modificando o Carro 1");
        carro1.marca = "Ford";
        carro1.modelo = "Mustang";
        carro1.ano = 2023;

        System.out.println("Valores após modificação:");
        carro1.mostrarInformacoes();

        System.out.println("Testando Funcionalidades");
        carro1.ligar();
        carro2.ligar();
    }
}
