package model;

import java.util.List;

public class Funcionario extends Pessoa{
    private String tipoFuncionario;
    private List<Distribuicao> distribuicoes;


    public Funcionario(String nome, String cpf, String endereco, String tipoFuncionario) {
        super(nome, cpf, endereco);
        this.tipoFuncionario = tipoFuncionario;
    }



    public String getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(String tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }

    public List<Distribuicao> getDistribuicoes() {
        return distribuicoes;
    }

    public void setDistribuicoes(List<Distribuicao> distribuicoes) {
        this.distribuicoes = distribuicoes;
    }
}
