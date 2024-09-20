package br.alura.modelo;

import br.alura.interfaces.Classificacao;
import br.alura.interfaces.InterfaceSugestao;

public class AudioLivro extends Audio implements  Classificacao, InterfaceSugestao {
    protected String autor;
    protected String dataDePublicacao;
    protected String editora;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDataDePublicacao() {
        return dataDePublicacao;
    }

    public void setDataDePublicacao(String dataDePublicacao) {
        this.dataDePublicacao = dataDePublicacao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public void calcularAvaliacoes() {
        this.mediaAvaliacoes = this.avaliacao / (this.totalAvaliacoes * 2);
    }

    @Override
    public int classificar() {
        if (this.mediaAvaliacoes <= 3) {
            return 2;
        } else if (this.mediaAvaliacoes <= 7) {
            return 3;
        } else {
            return 5;
        }


    }

    @Override
    public String mensagemSugestao() {
        if(this.mediaAvaliacoes < 3){
            return "Assuntos Cotidianos!";
        }else if(this.mediaAvaliacoes <=6){
            return "Instrutivos!";
        }else{
            return "Como um livro de cabeceira!t";
        }
    }

    @Override
    public String toString() {
        return "AudioLivro{" +
                "autor='" + autor + '\'' +
                ", dataDePublicacao='" + dataDePublicacao + '\'' +
                ", editora='" + editora + '\'' +
                ", titulo='" + titulo + '\'' +
                ", duracao=" + duracao +
                ", dataDeLancamento='" + dataDeLancamento + '\'' +
                ", avaliacao=" + avaliacao +
                ", totalAvaliacoes=" + totalAvaliacoes +
                ", mediaAvaliacoes=" + mediaAvaliacoes +
                '}';
    }
}
