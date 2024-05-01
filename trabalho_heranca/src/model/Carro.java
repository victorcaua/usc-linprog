package model;

public class Carro extends Veiculo{
    private int portas;
    private int cavalos;

    public Carro(String marca, String modelo, String cor, int portas, int cavalos){
        super(marca, modelo, cor);
        this.portas = portas;
        this.cavalos = cavalos;
    }

    //GETTERS
    public int getPortas(){
        return portas;
    }
    public int getCavalos(){
        return cavalos;
    }

    //SETTERS
    private void setPortas(int portas){
        this.portas = portas;
    }
    private void setCabalos(int cavalos){
        this.cavalos = cavalos;
    }
}
