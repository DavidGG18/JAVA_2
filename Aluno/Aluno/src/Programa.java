package aula8;
import java.util.ArrayList;

public class Programa {

    public static void main(String[]args){
        Aluno aluno1 = new Aluno();
        aluno1.setcurso("MEDVET");
        aluno1.setnome("Nelson");
        aluno1.setnotaFinal(70.5);
        aluno1.setRA(121212);

        Aluno aluno2 = new Aluno();
        aluno2.setcurso("si");
        aluno2.setnome("Natalia");
        aluno2.setnotaFinal(85.0);
        aluno2.setRA(121213);


        Aluno aluno3 = new Aluno();
        aluno3.setcurso("ADM");
        aluno3.setnome("Leonardo");
        aluno3.setnotaFinal(65.0);
        aluno3.setRA(121214);

        ArrayList<Aluno> turma = new ArrayList<Aluno>();
        // incluir aluno3 na lista 
        turma.add(aluno3);
        turma.add(aluno1);
        turma.add(aluno1);

        turma.add(aluno1);
        // quantos alunos tem na lista?
        System.out.println(turma.size());
        // como é que eu faço para remover?
        turma.remove(aluno2);
        turma.remove(0);
        // quantos alunos tem na lista?
        System.out.println(turma.size());
        // como percorrer todos os itens da lista?
        for(int i = 0; i < turma.size(); i++) {
            Aluno item = turma.get(i);
            System.out.println(item.getNome());
        }        
    }
}