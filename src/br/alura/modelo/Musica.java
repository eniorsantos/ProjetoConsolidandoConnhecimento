package br.alura.modelo;

import br.alura.interfaces.Classificacao;
import br.alura.interfaces.InterfaceSugestao;

import java.util.ArrayList;
import java.util.List;

public class Musica extends  Audio implements  Classificacao, InterfaceSugestao {
    protected String album;
    protected String gravadora;
    protected String cantor;
    protected List<String> compositor = new ArrayList<>();


    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public List<String> getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor.add(compositor);
    }

    @Override
    public void calcularAvaliacoes() {
        this.mediaAvaliacoes = (int) this.getAvaliacao() / this.getTotalAvaliacoes();

    }

    @Override
    public int classificar() {
        if (this.mediaAvaliacoes <= 5) {
            return 3;
        } else {
            return 5;
        }
    }

    @Override
    public String mensagemSugestao() {
        if(this.mediaAvaliacoes <= 3){
            return "Muaicas para tedio!";
        }else{
            return "Musica para todo momento!";
        }
    }

    @Override
    public String toString() {
        return "Musica{" +
                "album='" + album + '\'' +
                ", gravadora='" + gravadora + '\'' +
                ", cantor='" + cantor + '\'' +
                ", compositor=" + compositor +
                ", titulo='" + titulo + '\'' +
                ", duracao=" + duracao +
                ", dataDeLancamento='" + dataDeLancamento + '\'' +
                ", genero='" + genero + '\'' +
                ", avaliacao=" + avaliacao +
                ", totalAvaliacoes=" + totalAvaliacoes +
                ", mediaAvaliacoes=" + mediaAvaliacoes +
                '}';
    }
}