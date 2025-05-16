package br.com.fernandocalisto.desafioaudiomaster;

public class Musica extends Audio {
    private String cantor;
    private String compositor;

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }
}
