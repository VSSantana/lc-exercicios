package m2;

import java.util.Arrays;

public class ListaPessoa {

    private String[] listaNome = new String[5];
    private Integer[] listaIdade = new Integer[5];

    public String[] getListaNome() {
        return listaNome;
    }

    public void setListaNome(String[] listaNome) {
        this.listaNome = listaNome;
    }

    public Integer[] getListaIdade() {
        return listaIdade;
    }

    public void setListaIdade(Integer[] listaIdade) {
        this.listaIdade = listaIdade;
    }

    public String getListaNomePosicao(Integer posicao) {
        return this.listaNome[posicao];
    }

    public void setListaNomePosicao(String nome, Integer posicao) {
        this.listaNome[posicao] = nome;
    }

    public Integer getListaIdadePosicao(Integer posicao) {
        return this.listaIdade[posicao];
    }

    public void setListaIdadePosicao(Integer idade, Integer posicao) {
        this.listaIdade[posicao] = idade;
    }

    public Integer getPosicaoMaisNovo() {

        Integer posicaoMaisNovo = 0;
        Integer idadeMenor = listaIdade[0];

        for (int i = 0; i < listaIdade.length; i++) {

            if (listaIdade[i] < idadeMenor)
                posicaoMaisNovo = i;

        }

        return posicaoMaisNovo;

    }

    public Integer getPosicaoMaisVelho() {

        Integer posicaoMaisVelho = 0;
        Integer idadeMaior = listaIdade[0];

        for (int i = 0; i < listaIdade.length; i++) {

            if (listaIdade[i] > idadeMaior)
                posicaoMaisVelho = i;

        }

        return posicaoMaisVelho;

    }

    public Double getMediaIdade() {

        Double mediaIdade = 0d;

        for (int i = 0; i < listaIdade.length; i++) {

            mediaIdade = mediaIdade + listaIdade[i];

        }

        return mediaIdade / 5;

    }

    @Override
    public String toString() {
        return "ListaPessoa [listaNome=" + Arrays.toString(listaNome) + ", listaIdade=" + Arrays.toString(listaIdade)
                + "]";
    }

}
