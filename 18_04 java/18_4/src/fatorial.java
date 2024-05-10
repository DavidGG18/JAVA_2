import java.util.Scanner;

public class fatorial {

/**
 * @param args
 */
public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
   

/* Nome do Aluno: David Gabriel
* RA: 32312961
* Nome do Programa: 5) fatorial de um número digitado pelo usúario
* Data: 22/04/23
*/

int fatorial = 1;
int contador = 1;
int numero;

System.out.println(" Digite um número ");
numero = teclado.nextInt();

while (contador <= numero) {
    fatorial *= contador;
    contador++;
    
}
System.out.printf(" O fatoria de %d é %d " ,numero, fatorial);

}}