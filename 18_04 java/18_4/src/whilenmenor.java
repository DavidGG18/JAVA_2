import java.util.Scanner;

public class whilenmenor {

/**
 * @param args
 */
public static void main(String[] args) {
   
Scanner teclado = new Scanner(System.in);

/* Nome do Aluno: David Gabriel
* RA: 32312961
* Nome do Programa: 4) digite um número até número for menor que 0 número negativo estrtura de repetião while
* Data: 22/04/23
*/

int contador=1;
int numero=1;

  System.out.println( " Digite um número ");  
  numero = teclado.nextInt();

    while (numero >= 0) {
    System.out.println( " Digite um número ");  
    numero = teclado.nextInt();   
    }

  System.out.println( " Finalizou ");  
  
  }}