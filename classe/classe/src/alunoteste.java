
public class alunoteste {
    public static void main(String[] args) {

        aluno aluno1 = new aluno();

        // Declaração dos valores dos atributos
        aluno1.nome = "David Gabriel";
        aluno1.idade = 20;
        aluno1.curso = "Ciência da computação";

        aluno1.mostrarInformacoes();

        // métodos = ação
        aluno1.assistiraula();
        aluno1.fazerprova();
        aluno1.calculanota();
    }
}
