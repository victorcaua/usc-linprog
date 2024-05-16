package model;

import utils.Utils;

public class ContaPoupanca extends Conta {

    private Double taxaDeJuros;

    //METODO CONSTRUTOR
    public ContaPoupanca(Pessoa pessoa, Double taxaDeJuros) {
        super(pessoa);
        this.taxaDeJuros = taxaDeJuros;
    }

    //GETTERS
    public Double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    //SETTERS
    public void setTaxaDeJuros(Double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    //METODOS
    @Override
    public String toString() {
        return super.toString() +
                "\nSaldo com rendimento: " + Utils.doubleToString(getSaldo() + (getSaldo() * taxaDeJuros));
    }
}
