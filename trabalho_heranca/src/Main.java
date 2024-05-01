import model.Carro;
import model.Moto;
import model.Veiculo;

public class Main {
    public static void main(String[] args) {

        Veiculo cyber = new Veiculo("Tesla", "Cybertruck", "Branco");
        System.out.println("==== Printando infos do veiculo: ====" +
                            "\nMarca: " + cyber.getMarca() +
                            "\nModelo: " + cyber.getModelo() +
                            "\nCor: " + cyber.getCor());

        Carro lancer = new Carro("Mitsubishi", "Lancer", "Prata", 4, 600);
        System.out.println("==== Printando infos do carro: ====" +
                           "\nMarca: " + lancer.getMarca() +
                           "\nModelo: " + lancer.getModelo() +
                           "\nCor: " + lancer.getCor() +
                           "\nPortas: " + lancer.getPortas() +
                           "\nCavalos: " + lancer.getCavalos());

        Moto xtz = new Moto("Yamaha", "Crosser", "Azul", 300);
        System.out.println("==== Printando infos da moto: ====" +
                            "\nMarca: " + xtz.getMarca() +
                            "\nModelo: " + xtz.getModelo() +
                            "\nCor: " + xtz.getCor() +
                            "\nCilindradas: " + xtz.getCilindrada());
    }
}