import java.util.Scanner;

public class pratica_7 {
//    public static void main (String []args) {


        public int maior (int a, int b, int c){
            Scanner input = new Scanner(System.in);

System.out.print(" Digite o 1º númeross: ");
int a = input.nextInt();
System.out.print(" Digite o 2º númeross: ");
int b = input.nextInt();

           
           if(a>b && a>c){
            return a;
           }
          else if(b>a && b>c){
            return b;
           }     
           else if(c>b && c>a){
            return c;
           }
           return 0;

    }
}