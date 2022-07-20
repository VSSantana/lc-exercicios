package m4.futebol;

import m4.Futebol.Tipo;

public class Jogador {

    private String nome;
    private Tipo posicao;

    public Jogador(String nome, Tipo posicao) {

        this.nome = nome;
        this.posicao = posicao;

    }

    public String getNome() {

        return nome;

    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public Tipo getPosicao() {

        return posicao;

    }

    public void setPosicao(Tipo posicao) {

        this.posicao = posicao;

    }

}
