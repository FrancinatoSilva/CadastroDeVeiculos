package model;

public class Morador extends Motorista{

    private Integer idMorador;
    private String residencia;

    public Morador() {

    }

    public Morador(String nome, String cpf, String cnh, Integer idMorador,
                     String residencia) {
        super(nome, cpf, cnh);
        this.idMorador = idMorador;
        this.residencia = residencia;
    }

    public Integer getIdMorador() {
        return idMorador;
    }

    public void setIdMorador(Integer idMorador) {
        this.idMorador = idMorador;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }
}