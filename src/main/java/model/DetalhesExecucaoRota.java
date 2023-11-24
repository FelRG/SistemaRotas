package model;

import java.util.List;

public class DetalhesExecucaoRota {
    private String horaInicio;
    private String tempoGasto;
    private String tipoLocomocao;
    private List<Rastro> rastros;

    public DetalhesExecucaoRota(String horaInicio, String tempoGasto, String tipoLocomocao) {
        this.horaInicio = horaInicio;
        this.tempoGasto = tempoGasto;
        this.tipoLocomocao = tipoLocomocao;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getTempoGasto() {
        return tempoGasto;
    }

    public void setTempoGasto(String tempoGasto) {
        this.tempoGasto = tempoGasto;
    }

    public String getTipoLocomocao() {
        return tipoLocomocao;
    }

    public void setTipoLocomocao(String tipoLocomocao) {
        this.tipoLocomocao = tipoLocomocao;
    }

    public List<Rastro> getRastros() {
        return rastros;
    }

    public void setRastros(List<Rastro> rastros) {
        this.rastros = rastros;
    }
}
