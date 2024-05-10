// Se o ultimo digito for igual nos dois numeros diga true verdadeiro 

public class pratica_5{

    public static void main (String []args) {
    boolean resultado;
    resultado = ultimo_digito(22,32); // onde os números são digitados
    System.out.println(resultado);
    }

        public static boolean ultimo_digito(int a, int b ) {
            int restoA = a % 10;
            int restoB = b % 10;

            if (restoA==restoB) {
                return true;
                 }else{
                    return false;
                 }





    }

    }
