import javax.swing.JOptionPane;

public class aula {
    
 public static void main(String[] args) {

    String nome,idade, salario;
    Double salarioNum;
    int idadeNum, contador;
/*
    JOptionPane.showMessageDialog(null,"Ola O MUNDO");
nome = JOptionPane.showInputDialog(" Digite seu nome ");

idade = JOptionPane.showInputDialog("Digite sua idade  ");
        // conversao dos dados de String -> Int
        idadeNum = Integer.parseInt(idade);

        salario = JOptionPane.showInputDialog("Qual o seu salario");
        // conversao dos dados de String -> double
        salarioNum = Double.parseDouble(salario);
        
        JOptionPane.showMessageDialog(null, " Ola O MUNDO "+nome);
        */

        for ( contador = 1; contador<=4;  contador = contador + 1)
       //   idade = JOptionPane.showInputDialog("Digite sua idade  ");
        //idadeNum = Integer.parseInt(idade);
        {
            idade = JOptionPane.showInputDialog("Digite sua idade  ");
            idadeNum = Integer.parseInt(idade);
     JOptionPane.showMessageDialog(null, " Número - " + contador + " idade - " + idade );

     if (contador == 2) {
        JOptionPane.showMessageDialog(null, " Número 2 - " + contador + " idade - " + idade );  
     }
      
      }
       
    }
}
    




