package br.com.fernandocalisto.desafioaudiomaster;

public class Podcast extends Audio {
    private String categoria;
    private String convidado;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getConvidado() {
        return convidado;
    }

    public void setConvidado(String convidado) {
        this.convidado = convidado;
    }
}
