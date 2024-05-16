package model;

import java.util.Date;
import utils.Utils;

public class Pessoa {

    private static int counter = 1;
    private int numeroPessoa;
    private String name;
    private String cpf;
    private String eMail;
    private Date accountCreationDate;

    public Pessoa() { }

    //METODO CONSTRUTOR
    public Pessoa(String name, String cpf, String eMail) {
        this.numeroPessoa = Pessoa.counter;
        this.name = name;
        this.cpf = cpf;
        this.eMail = eMail;
        this.accountCreationDate = new Date();
        Pessoa.counter += 1;
    }

    //GETTERS
    public int getNumeroPessoa() {
        return this.numeroPessoa;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return eMail;
    }

    public String getCpf() {
        return cpf;
    }

    public Date getAccountCreationDate() {
        return this.accountCreationDate;
    }

    //SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String eMail) {
        this.eMail = eMail;
    }

    //METODOS
    public String toString() {
        return "\nName: " + this.getName() +
                "\nCPF: " + this.getCpf() +
                "\nEmail: " + this.getEmail() +
                "\nData: " + Utils.dateToString(this.getAccountCreationDate());
    }
}
