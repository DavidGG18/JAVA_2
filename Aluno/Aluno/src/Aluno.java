package aula8;
import java.util.ArrayList;

public class Aluno {

    private String nome;
   private int RA; 
    private String curso;
    private double notaFinal;


    public int getcurso(){
        return curso;
    } 
        public void setcurso(int curso){
        this.curso = curso;
    }


    public int getnome(){
        return nome;
    } 
        public void setnome(int nome){
        this.nome = nome;
    }
    public int getRA(){
        return RA;
    } 
        public void setRA(int RA){
        this.RA = RA;
    }
    public int getnotaFinal(){
        return notaFinal;
    } 
        public void setnotaFinal(int notaFinal){
        this.notaFinal = notaFinal;
        }
}