package classe;
public class carro {

    //atributos
    String marca;
    String nome;
    int ano;
    int vel;

    // métodos
    void acelerar (int aceleracao){
        vel+=aceleracao;
    }
    void freiar(int reduzir){
        vel-=reduzir;
    }
    void buzinar(){
        System.out.println(" Bibibi");
    }
}