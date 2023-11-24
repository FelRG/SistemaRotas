package model;

import java.util.List;

public class Rota {
    private String nome;
    private EntregadorJornal entregadorAtual;
    private List<Cliente> clientes;
    private String formaExecucao;
    private List<PeriodoTrabalho> periodoTrabalho;
    private List<DetalhesExecucaoRota> detalhesExecucao;

    public Rota(String nome, EntregadorJornal entregadorAtual, List<Cliente> clientes, String formaExecucao) {
        this.nome = nome;
        this.entregadorAtual = entregadorAtual;
        this.clientes = clientes;
        this.formaExecucao = formaExecucao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EntregadorJornal getEntregadorAtual() {
        return entregadorAtual;
    }

    public void setEntregadorAtual(EntregadorJornal entregadorAtual) {
        this.entregadorAtual = entregadorAtual;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public String getFormaExecucao() {
        return formaExecucao;
    }

    public void setFormaExecucao(String formaExecucao) {
        this.formaExecucao = formaExecucao;
    }

    public List<PeriodoTrabalho> getPeriodoTrabalho() {
        return periodoTrabalho;
    }

    public void setPeriodoTrabalho(List<PeriodoTrabalho> periodoTrabalho) {
        this.periodoTrabalho = periodoTrabalho;
    }

    public List<DetalhesExecucaoRota> getDetalhesExecucao() {
        return detalhesExecucao;
    }

    public void setDetalhesExecucao(List<DetalhesExecucaoRota> detalhesExecucao) {
        this.detalhesExecucao = detalhesExecucao;
    }

}
