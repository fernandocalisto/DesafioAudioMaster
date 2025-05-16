package br.com.fernandocalisto.desafioaudiomaster;

public abstract class Audio {
    private String titulo;
    private int duracao;
    private int reproducoes;
    private int totalCurtidas;
    private int totalClassificacoes;
    private int classificacoes;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getReproducoes() {
        return reproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacoes() {
        return classificacoes;
    }

    public void curtir() {
        totalCurtidas++;
    }

    public void reproduzir() {
        System.out.println("Reproduzindo " + titulo + " ...");
        reproducoes++;
    }

    public void classificar(int classificacao) {
        if (classificacao < 1 || classificacao > 5) {
            System.out.println("Avaliação inválida! Insira um número de 1 a 5.");
            return;
        }
        classificacoes += classificacao;
        totalClassificacoes++;
    }

    public int getClassificacao() {
        if (totalClassificacoes == 0) {
            return 0;
        }
        return classificacoes / totalClassificacoes;
    }

}
