package model;

public class Visitante extends Motorista{

    private Integer idVisitante;
    private String residenciaVisitada;
    private String autorizadoPor;

    public Visitante() {

    }

    public Visitante(String nome, String cpf, String cnh, Integer idVisitante,
                     String residenciaVisitada, String autorizadoPor) {
        super(nome, cpf, cnh);
        this.idVisitante = idVisitante;
        this.residenciaVisitada = residenciaVisitada;
        this.autorizadoPor = autorizadoPor;
    }

    public Integer getIdVisitante() {
        return idVisitante;
    }

    public void setIdVisitante(Integer idVisitante) {
        this.idVisitante = idVisitante;
    }



    public String getResidenciaVisitada() {
        return residenciaVisitada;
    }

    public void setResidenciaVisitada (String residenciaVisitada) {
        this.residenciaVisitada = residenciaVisitada;
    }

    public String getAutorizadoPor() {
        return autorizadoPor;
    }

    public void setAutorizadoPor(String autorizadoPor) {
        this.autorizadoPor = autorizadoPor;
    }


}