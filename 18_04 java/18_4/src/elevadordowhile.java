import java.util.Scanner;

/* Nome do Aluno: David Gabriel
* RA: 32312961
* Nome do Programa: 7)  elevador do while
* Data: 22/04/23
*/

public class elevadordowhile {

  /**
   * @param args
   */
  public static void main(String[] args) {
  
  Scanner teclado = new Scanner(System.in);
  int pessoas = 0, pessoasmax;
  double cargamax, peso=0, soma = 0;

System.out.println(" Digite a carga maxima do elevador em KG");
cargamax = teclado.nextDouble();

System.out.println(" Digite o número maxímo de pessoas que o elevador aguenta");
pessoasmax = teclado.nextInt();

//do while
     
do {

System.out.println(" Digite seu peso ");
peso = teclado.nextDouble();

soma = peso + soma; // Soma o peso das pessoas de acordo que e digitado
pessoas = pessoas + 1; // Soma o número de pessoas contado
 
System.out.printf(" peso atual %.2f , número de pessoas no elevador %d", soma, pessoas  ); // Exibe a soma de peso e pessoas 

} while (pessoas <= pessoasmax && soma <= cargamax); // Programa para quando peso ou número de pessoas 

System.out.println(" Limite atingido "  );

}}