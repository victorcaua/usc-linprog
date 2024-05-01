package model;

public class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, String cor, int cilindrada){
        super(marca, modelo, cor);
        this.cilindrada = cilindrada;
    }

    //GETTERS
    public int getCilindrada(){
        return cilindrada;
    }

    //SETTERS
    private void setCilindrada(int cilindrada){
        this.cilindrada = cilindrada;
    }
}
