package br.alura.modelo;

public class Audio {
    protected String titulo;
    protected double duracao;
    protected String dataDeLancamento;
    protected String genero;
    protected int avaliacao;
    protected int totalAvaliacoes;
    protected int mediaAvaliacoes;

    public int getMediaAvaliacoes() {
        return mediaAvaliacoes;
    }

    public void calcularAvaliacoes() {
        this.mediaAvaliacoes = this.getAvaliacao();

    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public Audio(){}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getDataDeLancamento() {
        return dataDeLancamento;
    }

    public void setDataDeLancamento(String dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;

    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public void setAvaliacao(int a) {
        this.avaliacao += a;
        this.totalAvaliacoes++;
    }

    @Override
    public String toString() {
        return "Audio{" +
                "Titulo = '" + titulo + '\'' +
                ", Duracao = " + duracao +
                ", Data de Lancamento = '" + dataDeLancamento + '\'' +
                ", Genero = '" + genero + '\'' +
                '}';
    }
}
