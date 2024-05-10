public class  contador1a100multiplicar {
 
    public static void main(String[] args) {
       
   int contador;
  double soma=1; 
   for ( contador = 1; contador<=100;){
   soma = contador * soma;
   contador = contador + 1;
   
   }

  System.out.println( " A soma dos números é " +  soma);  
  
  
  }}