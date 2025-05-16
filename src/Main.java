import br.com.fernandocalisto.desafioaudiomaster.Musica;
import br.com.fernandocalisto.desafioaudiomaster.Podcast;

public class Main {
    public static void main(String[] args) {

        Podcast meuPodcast = new Podcast();

        meuPodcast.setTitulo("Coisa Boa Talks");
        meuPodcast.setDuracao(120);
        meuPodcast.setCategoria("Negócios");
        meuPodcast.setConvidado("Silvio Santos");

        meuPodcast.reproduzir();
        meuPodcast.classificar(4);
        meuPodcast.classificar(3);
        System.out.println(meuPodcast.getClassificacao());

        Musica minhaMusica = new Musica();

        minhaMusica.setTitulo("Don't stay");
        minhaMusica.setDuracao(3);
        minhaMusica.setCantor("Linkin Park");
        minhaMusica.setCompositor("Mike Shinoda");

        minhaMusica.reproduzir();
        minhaMusica.classificar(5);
        minhaMusica.classificar(4);
        minhaMusica.curtir();
        System.out.println(minhaMusica.getClassificacao());

    }
}