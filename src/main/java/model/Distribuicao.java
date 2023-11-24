package model;

import java.util.List;
public class Distribuicao {
    private String nome;
    private List<Rota> rotas;

    public Distribuicao(String nome){
        this.nome = nome;
    }

    public List<Rota> getRotas() {
        return rotas;
    }

    public void setRotas(List<Rota> rotas) {
        this.rotas = rotas;
    }
}
