import java.util.Scanner;

public class imcmetodo {
    public static void main(String[] args) {

        double altura, peso, imc;
        // metodo sem retorno e sem parâmetro
        saudacao();

        Scanner teclado = new Scanner(System.in);
        System.out.println(" Digite sua altura ");
        altura = teclado.nextDouble();
        System.out.println(" Digite seu peso");
        peso = teclado.nextDouble();
        // imc = peso / (altura * altura);
        // método com retorno e com parâmetros
        imc = calculaIMC(peso, altura);

        if (imc < 18.5) {
            System.out.println("Você encontra-se com peso baixo");
        } else if ((imc >= 18.5) && (imc < 25)) {
            System.out.println("Você está no peso ideal");
        } else if ((imc >= 25) && (imc < 30)) {
            System.out.println("Você está com sobrepeso");
        } else if ((imc >= 30) && (imc < 35)) {
            System.out.println("Você está com obesidade grau 1");
        } else if ((imc >= 35) && (imc <= 39.9)) {
            System.out.println("Você está com obesidade grau 2");
        } else {
            System.out.println("Você está com obesidade mórbida");
        }

        saudacao();

    }

    static void saudacao() {
        System.out.println("Este é o programa de calculo do IMC do Davidw");
        System.out.println("Programação de Soluções Computacionais");
    }

    static double calculaIMC(double peso, double altura) {
        double imcTemp;
        imcTemp = peso / (altura * altura);
        return imcTemp;
    }

}