package Entidades;

public class Consulta extends Dono{
    public String getQueixa() {
        return queixa;
    }

    public void setQueixa(String queixa) {
        this.queixa = queixa;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public String getContactantes() {
        return contactantes;
    }

    public void setContactantes(String contactantes) {
        this.contactantes = contactantes;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public Boolean getVacinacao() {
        if (vacinacao == true){
            System.out.println("A vacinação está ok");
        }
        else {
            System.out.println("A vacinação está irregular");
        }

        return vacinacao;

    }

    public void setVacinacao(Boolean vacinacao) {
        this.vacinacao = vacinacao;
    }

    public Boolean getVermifugacao() {

        if (vermifugacao == true){
            System.out.println("A vermifugação está ok");

        }
        else{
            System.out.println("Está faltando a vermifugação");
        }
        return vermifugacao;

    }

    public void setVermifugacao(Boolean vermifugacao) {
        this.vermifugacao = vermifugacao;
    }

    private String queixa;
    private String historico;
    private String alimentacao;
    private String contactantes;
    private String ambiente;
    private Boolean vacinacao;
    private Boolean vermifugacao;

}
