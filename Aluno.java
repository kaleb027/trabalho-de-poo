public class Aluno {
    private String nome;
    private int matricula;
    private double notaAv1;
    private double notaAv2;

    public Aluno(String nome, int matricula, double notaAv1, double notaAv2) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaAv1 = notaAv1;
        this.notaAv2 = notaAv2;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
        System.out.printf("Nota AV1: %.2f\n", this.notaAv1);
        System.out.printf("Nota AV2: %.2f\n", this.notaAv2);
    }

    public double calcularMedia() {
        return (this.notaAv1 + this.notaAv2) / 2;
    }

    public void verificarAprovacao() {
        double media = calcularMedia();
        if (media >= 7.0) {
            System.out.println(this.nome + " está aprovado com média: " + media);
        } else {
            System.out.println(this.nome + " está reprovado com média: " + media);
        }
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João Silva", 12345, 8.5, 7.0);
        Aluno aluno2 = new Aluno("Maria Oliveira", 67890, 6.0, 5.5);

        System.out.println("\n--- Atualizando a nota de Maria Oliveira ---");
        aluno2.notaAv1 = 7.5; 
        System.out.println("\n--- Dados Atualizados de Maria Oliveira ---");
        aluno2.mostrarDados();
        System.out.println("\n--- Verificando aprovação ---");
        aluno2.verificarAprovacao();
        System.out.println("\n--- Verificando aprovação de João Silva ---");
        aluno1.verificarAprovacao();
    }
}
