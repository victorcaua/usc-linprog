package model;

public class Veiculo {
    private String marca;
    private String modelo;
    private String cor;

    public Veiculo(String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    //GETTERS
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public String getCor(){
        return cor;
    }

    //SETTERS
    private void setMarca(String marca){
        this.marca = marca;
    }
    private void setModelo(String modelo){
        this.marca = modelo;
    }
    private void setCor(String cor){
        this.marca = cor;
    }
}

