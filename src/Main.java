import br.alura.controle.RenovarConteudo;
import br.alura.modelo.Musica;

public class Main {
    public static void main(String[] args) {

        Musica musica = new Musica();
        RenovarConteudo renova = new RenovarConteudo();

        musica.setTitulo("Higher");
        musica.setCantor("Banda Creed");
        musica.setAlbum("Human Clay");
        musica.setDuracao(5.16);
        musica.setGravadora("Loudwire");
        musica.setGenero("Rock");
        musica.setCompositor("Mark Tremont");
        musica.setCompositor("Scott Stapp");
        musica.setDataDeLancamento("31/08/1999");
        musica.setAvaliacao(8);
        musica.setAvaliacao(10);
        musica.setAvaliacao(10);

        System.out.println(musica.getAvaliacao());
        System.out.println(musica.getTotalAvaliacoes());
        musica.calcularAvaliacoes();
        System.out.println(musica.getMediaAvaliacoes());
        System.out.println(musica.classificar());
        System.out.println(musica.mensagemSugestao());
        System.out.println(renova.renovar(musica));
        System.out.println(musica.toString());


    }
}