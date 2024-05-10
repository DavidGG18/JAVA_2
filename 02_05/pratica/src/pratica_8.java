import java.util.Scanner;

// Qual número está mais próximo de 0
public class pratica_8 {
    public static void main (String []args){
        Scanner input = new Scanner(System.in);

// metodo
//public class int  proximo ()
System.out.print(" Digite o 1º númeross: ");
int num1 = input.nextInt();

System.out.print(" Digite o 2º númeross: ");
int num2 = input.nextInt();

int distancia1 = Math.abs(10 - num1);
int distancia2 = Math.abs(10 - num2);

    if (distancia1 < distancia2) {
      System.out.println("O número " + num1 + " está mais próximo de 10.");
    } else if (distancia2 < distancia1) {
      System.out.println("O número " + num2 + " está mais próximo de 10.");
    } else {
      System.out.println("Os dois números estão igualmente distantes de 10.");
    }


    }
}