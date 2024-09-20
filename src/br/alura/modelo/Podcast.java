package br.alura.modelo;

import br.alura.interfaces.Classificacao;
import br.alura.interfaces.InterfaceSugestao;

import java.util.ArrayList;
import java.util.List;

public class Podcast extends Audio implements Classificacao, InterfaceSugestao {
    protected String apresentador;
    protected List<String> convidados = new ArrayList<>();

    public List<String> getConvidados() {
        return convidados;
    }

    public void setConvidados(String convidados) {
        this.convidados.add(convidados);
    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    @Override
    public void calcularAvaliacoes() {
        this.mediaAvaliacoes = (int) (this.avaliacao * 1.5) / this.totalAvaliacoes;
    }

    @Override
    public int classificar() {
        if (this.mediaAvaliacoes < 5){
            return 2;
        }else if (this.mediaAvaliacoes <8){
            return 3;
        }else {
            return 5;
        }
    }


    @Override
    public String mensagemSugestao() {
        if(this.mediaAvaliacoes < 3){
            return "Cultura Inutil!";
        }else if(this.mediaAvaliacoes <=6){
            return "Vale a pena escudar!";
        }else{
            return "Sempre na playlist";
        }
    }

    @Override
    public String toString() {
        return "Podcast{" +
                "apresentador='" + apresentador + '\'' +
                ", convidados=" + convidados +
                ", titulo='" + titulo + '\'' +
                ", duracao=" + duracao +
                ", dataDeLancamento='" + dataDeLancamento + '\'' +
                ", totalAvaliacoes=" + totalAvaliacoes +
                ", mediaAvaliacoes=" + mediaAvaliacoes +
                ", avaliacao=" + avaliacao +
                '}';
    }
}
