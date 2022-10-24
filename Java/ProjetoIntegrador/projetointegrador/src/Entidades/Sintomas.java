package Entidades;

public class Sintomas extends Consulta {
    private Boolean sistema_respiratorio;
    private Boolean sistema_digestivo;
    private Boolean sistema_urinario;
    private Boolean sistema_reprodutor;
    private Boolean sistema_neurologico;
    private Boolean pele;
    private Boolean olhos;

    public Boolean getSistema_respiratorio() {
        if(sistema_respiratorio == true){
            System.out.println("O sistema respiratorio está OK");
        }
        else {
            System.out.println("O sistema respiratorio está com PROBLEMA!!!");
        }
        return sistema_respiratorio;
    }

    public void setSistema_respiratorio(Boolean sistema_respiratorio) {
        this.sistema_respiratorio = sistema_respiratorio;
    }

    public Boolean getSistema_digestivo() {

        if (sistema_digestivo == true){
            System.out.println("O sistema digestivo está ok!!!");
        }
        else {
            System.out.println("O sistema digestivo está com PROBLEMA!!!");
        }
        return sistema_digestivo;
    }

    public void setSistema_digestivo(Boolean sistema_digestivo) {
        this.sistema_digestivo = sistema_digestivo;
    }

    public Boolean getSistema_urinario() {
        if (sistema_urinario == true){
            System.out.println("O sistema urinario está ok!!");
        }
        else {
            System.out.println("O sistema urinario está com PROBLEMA!!!");
        }
        return sistema_urinario;
    }

    public void setSistema_urinario(Boolean sistema_urinario) {
        this.sistema_urinario = sistema_urinario;
    }

    public Boolean getSistema_reprodutor() {
        if (sistema_reprodutor == true){
            System.out.println("O sistema reprodutor está ok!!");
        }
        else {
            System.out.println("O sistema reprodutor está com PROBLEMA!!!");
        }
        return sistema_reprodutor;
    }

    public void setSistema_reprodutor(Boolean sistema_reprodutor) {
        this.sistema_reprodutor = sistema_reprodutor;
    }

    public Boolean getSistema_neurologico() {
        if (sistema_neurologico == true){
            System.out.println("O sistema neurologico está OK");
        }
        else {
            System.out.println("O sistema neurologico está com PROBLEMA!!");
        }
        return sistema_neurologico;
    }

    public void setSistema_neurologico(Boolean sistema_neurologico) {
        this.sistema_neurologico = sistema_neurologico;
    }

    public Boolean getPele() {
        if (pele == true){
            System.out.println("A pele do animal está OK!!");
        }
        else {
            System.out.println("A pele do animal está com PROBLEMA!!!");
        }
        return pele;
    }

    public void setPele(Boolean pele) {
        this.pele = pele;
    }

    public Boolean getOlhos() {
        if (olhos == true){
            System.out.println("Os olhos do animal estão ok");
        }
        else {
            System.out.println("Os olhos do animal estão com PROBLEMA!!!!");
        }
        return olhos;
    }

    public void setOlhos(Boolean olhos) {
        this.olhos = olhos;
    }
}