package Entidades;


public class Dono {
    private String nome_dono;
    private String cpf;
    private String cidade;
    private String celular;
    private String uf;
    private String telefone_fixo;

    public String getNome_dono() {
        return nome_dono;
    }

    public String setNome_dono(String nome_dono) {
        this.nome_dono = nome_dono;
        return nome_dono;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getTelefone_fixo() {
        return telefone_fixo;
    }

    public void setTelefone_fixo(String telefone_fixo) {
        this.telefone_fixo = telefone_fixo;
    }
}

