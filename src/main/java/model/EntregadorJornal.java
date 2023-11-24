package model;

import java.util.List;

public class EntregadorJornal extends Funcionario{
    private List<Rota> rotas;

    public EntregadorJornal(String nome, String cpf, String endereco, String tipoFuncionario) {
        super(nome, cpf, endereco, tipoFuncionario);
    }

    public List<Rota> getRotas() {
        return rotas;
    }

    public void setRotas(List<Rota> rotas) {
        this.rotas = rotas;
    }
}
