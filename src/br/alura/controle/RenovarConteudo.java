package br.alura.controle;

import br.alura.interfaces.Classificacao;

public class RenovarConteudo {

    public int conteudo;

    public boolean renovar(Classificacao classifica){
        this.conteudo = classifica.classificar();
        if(conteudo < 5){
            return false;
        }else{
            return true;
        }
    }
}
