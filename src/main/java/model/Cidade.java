package model;

public class Cidade {
    private String nome;
    private Distribuicao distribuicao;

    public Cidade(String nome){
        this.nome = nome;
    }

    public Distribuicao getDistribuicao() {
        return distribuicao;
    }

    public void setDistribuicao(Distribuicao distribuicao) {
        this.distribuicao = distribuicao;
    }
}
