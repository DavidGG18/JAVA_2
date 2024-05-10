public class aluno {
    // Atributos da classe aluno
    String nome;
    int idade;
    String curso;

    // Método para exibir informações do aluno
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
    }

    // Outros métodos da classe aluno
    public void assistiraula() {
        System.out.println("Assistir aula...");
    }

    public void fazerprova() {
        System.out.println("Fazer prova...");
    }

    public void calculanota() {
        System.out.println("Calculando nota...");
    }
}
