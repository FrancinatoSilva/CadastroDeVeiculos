package model;

public class Motorista {

    private String nome;
    private String cpf;
    private String cnh;
    private String status;

    public Motorista() {

    }

    public Motorista(String nome, String cpf, String cnh, String status) {
        this.nome = nome;
        this.cpf = cpf;
        this.cnh = cnh;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
