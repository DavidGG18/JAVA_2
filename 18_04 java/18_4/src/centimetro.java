import java.util.Scanner;

public class centimetro {

/**
 * @param args
 */
public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
   

/* Nome do Aluno: David Gabriel
* RA: 32312961
* Nome do Programa: 6)  usúario
* Data: 22/04/23
*/

int contador = 1;
int soma=1; 
int gas, i;

System.out.println(" Digite o valor inicial do gâs ");
gas = teclado.nextInt();

 while ( gas <= 1000){

 gas = gas * 2;
 soma = gas + soma;



 System.out.printf("  centimetros é " , gas);  
 
 }

System.out.println( " A soma dos números é " +  gas);  


}}