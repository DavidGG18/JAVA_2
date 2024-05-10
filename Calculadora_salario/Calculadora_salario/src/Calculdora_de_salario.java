// Aluno : David Gabriel
// RA : 32312961
// Data : 30/05/2023
// Linguagem de programação Bom e velho Java

import java.util.Scanner;

public class Calculdora_de_salario { 
public static void main(String []args){
Scanner teclado = new Scanner(System.in);

 
System.out.println(" Digite seu nome ");
String nome = teclado.nextLine();

System.out.println(" Digite  seu regime de pagamento ");
String regime = teclado.nextLine();


if (regime.contains("CLT")){ // variavel.contains para if else dar certo com String
    System.out.println(" Digite seu salário mensal"); 
    Double sm = teclado.nextDouble();
    System.out.printf(" Professor %s seu salário é de %.2f ", nome, sm); 
}

else if (regime.contains("Horista")){ // variavel.contains para if else dar certo com String
    System.out.println(" Digite o valor da hora "); 
    Double valor_hora = teclado.nextDouble();
    System.out.println(" Digite o valor de horas que você trabalhou ");
    int  horas = teclado.nextInt();
    Double salario_h = valor_hora * horas;
    System.out.printf(" Professor %s seu salário é de %.2f ", nome, salario_h);

}

else if (regime.contains("PJ")){ // variavel.contains para if else dar certo com String
    System.out.println(" Digite o valor do seu contrato");
    Double valorpj = teclado.nextDouble();
    System.out.printf(" Professor %s seu salário é de %.2f ", nome, valorpj); 
}

else{
    System.out.println(" Tente novamente apos bip");
    System.out.println(" bip");
}

    
}}