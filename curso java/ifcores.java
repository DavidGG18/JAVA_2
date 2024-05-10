public class ifcores {

    /* pega o número da váriavel onda e faz o if else mundo o nome da cor */

    public static void main(String[] args) {

        double onda = 400;

        if (onda >= 380 && onda < 450) {
            System.out.println(" Violeta");
        } else if (onda >= 450 && onda < 495) {
            System.out.println("Azul");
        } else if (onda >= 495 && onda < 570) {
            System.out.println("Verde");
        } else if (onda >= 570 && onda < 590) {
            System.out.println("Amarelo");
        } else if (onda >= 590 && onda < 620) {
            System.out.println("Laranja");
        } else if (onda >= 620 && onda < 750) {
            System.out.println("Vermelho");
        } else {
            System.out.println(" Arco iris");
        }

    }
}