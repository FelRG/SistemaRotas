package model;

import java.util.List;

public class Cliente extends Pessoa{

    private String enderecoSecundario;
    private boolean receberJornalFinalSem;
    private double latitude;
    private double longitude;
    private List<String> fotos;

    //construtor que recebe atributos da classe generica
    public Cliente(String nome, String cpf, String endereco) {
        super(nome, cpf, endereco);
    }

    //construtor que recebe atributos da classe generica e sobrecarregado, se necessario
    public Cliente(String nome, String cpf, String endereco,
                   String enderecoSecundario,
                   boolean receberJornalFinalSem,
                   double latitude, double longitude) {
        super(nome, cpf, endereco);
        this.enderecoSecundario = enderecoSecundario;
        this.receberJornalFinalSem = receberJornalFinalSem;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getEnderecoSecundario() {
        return enderecoSecundario;
    }

    public void setEnderecoSecundario(String enderecoSecundario) {
        this.enderecoSecundario = enderecoSecundario;
    }

    public boolean isReceberJornalFinalSem() {
        return receberJornalFinalSem;
    }

    public void setReceberJornalFinalSem(boolean receberJornalFinalSem) {
        this.receberJornalFinalSem = receberJornalFinalSem;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public List<String> getFotos() {
        return fotos;
    }

    public void setFotos(List<String> fotos) {
        this.fotos = fotos;
    }
}
