import java.util.Scanner;

public class imc {

    public static void main(String[] args) {


Scanner input = new Scanner(System.in);

double altura, peso;

System.out.print(" Digite seu peso: ");
peso = input.nextDouble();

System.out.print(" Digite sua altura: ");
altura = input.nextDouble();

double imc = peso / (altura * altura);
int grauobeside=0;
//Scanner.close();


if (imc < 18.5) {
    System.out.printf(" seu IMC é %.2f Abaixo do peso ",imc);
    
} 
else  if (imc >= 18.5 && imc < 25) {
    System.out.printf(" Seu IMC é %.2f  Peso normal ",imc);
    
  }
 else  if (imc >= 25 && imc < 30) {
    System.out.printf(" Seu IMC é %.2f Sobrepeso",imc);
} 
else if (imc >= 30 && imc < 40) {

    System.out.printf(" Seu IMC é %.2f Obesidade NV1 ",imc);

} else {
System.out.printf(" Seu IMC é %.2f Obesidade Grave", imc);
}

}}