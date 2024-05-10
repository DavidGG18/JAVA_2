public class vetorlinhaecoluna {

/* Nome do Aluno: David Gabriel
* RA: 32312961
* Nome do Programa: 9)  matriz só com 2 linha e coluna 
* Data: 22/04/23
*/

    public static void main(String[] args) {
    // 10 linhas e 10 colunas 
        int[][] matrix = new int[10][10]; // nome da matriz matrix

        // I é igual a linha  e  J é igual a coluna
         /* linha*/ for (int i = 2; i < 10; i++) {
         /* Coluna */   for (int j = 2; j < 10; j++) {
                matrix[i][j] = 2;
            }
        }


        System.out.println("Matriz preenchida com zeros:");
        for (int i = 2; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
