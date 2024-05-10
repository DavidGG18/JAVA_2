import java.util.Scanner;

public class Prova {

    public static void main(String[] args) throws Exception {

        System.out.println("Bem-vindo Funcionário(a), por favor, informe seu nome");
        Scanner teclado = new Scanner(System.in);

        String nome = teclado.nextLine();
        System.out.println("Qual seu peso " + nome + "?");

        int peso = teclado.nextInt();
        System.out.println("Quantos litros de água você já tomou hoje " + nome + "?");

        int litros = teclado.nextInt();

        int quantidadeIdeal = Math.round((peso * 35) / 1000);
        int quantidadeIngerir = Math.round(quantidadeIdeal - litros);

        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Peso do funcionário: " + peso + "Kg");

        System.out.println("A quantidade de água ingerida foi: " + litros + " Litros");
        System.out.println("A quantidade de água ideal a ser ingerida: "
                + quantidadeIdeal
                + " Litros de água por dia");

        if (quantidadeIngerir <= 0) {

            System.out.println("Parabéns, você atingiu a meta de hidratação diária");

        } else {

            System.out.println("Continue se hidratando por hoje, ainda faltam " + quantidadeIngerir
                    + " litros! Você consegue!");

        }

    }

}