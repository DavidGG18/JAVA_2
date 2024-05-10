package classe;
public class carrotestar {
    public static void main (String []args){
        carro carro1 = new carro();

        carro1.nome = "Uno";
        carro1.marca = "Fiat";
        carro1.ano = 2015;
        carro1.vel = 60;

        // método acelerar
// velocidade do carro era 60 com o metodo acelerar valor 10 foi pra 70
carro1.acelerar(10);
System.out.println(carro1.vel);        

carro1.freiar(30);

System.out.println(" A velocidade do carro é " + carro1.vel+ "km/h");

    } 
} 