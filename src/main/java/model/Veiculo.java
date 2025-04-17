package model;

public class Veiculo {

    private String tipo;
    private String modelo;
    private String cor;
    private String placa;

    public Veiculo() {

    }

    public Veiculo (String tipo, String modelo, String cor, String placa) {
        this.tipo = tipo;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
