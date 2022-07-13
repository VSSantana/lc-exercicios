package m2;

import java.util.Arrays;

public class ImcCalc {

    private String[] listaNome = new String[5];
    private Double[] listaAltura = new Double[5];
    private Double[] listaPeso = new Double[5];
    private Double[] listaImc = new Double[5];

    public String[] getListaNome() {
        return listaNome;
    }

    public void setListaNome(String[] listaNome) {
        this.listaNome = listaNome;
    }

    public Double[] getListaAltura() {
        return listaAltura;
    }

    public void setListaAltura(Double[] listaAltura) {
        this.listaAltura = listaAltura;
    }

    public Double[] getListaPeso() {
        return listaPeso;
    }

    public void setListaPeso(Double[] listaPeso) {
        this.listaPeso = listaPeso;
    }

    public Double[] getListaImc() {
        return listaImc;
    }

    public void setListaImc(Double[] listaImc) {
        this.listaImc = listaImc;
    }

    public String getListaNomePosicao(Integer posicao) {
        return this.listaNome[posicao];
    }

    public void setListaNomePosicao(String nome, Integer posicao) {
        this.listaNome[posicao] = nome;
    }

    public Double getListaAlturaPosicao(Integer posicao) {
        return this.listaAltura[posicao];
    }

    public void setListaAlturaPosicao(Double altura, Integer posicao) {
        this.listaAltura[posicao] = altura;
    }

    public Double getListaPesoPosicao(Integer posicao) {
        return this.listaPeso[posicao];
    }

    public void setListaPesoPosicao(Double peso, Integer posicao) {
        this.listaPeso[posicao] = peso;
    }

    public Double getListaImcPosicao(Integer posicao) {
        return this.listaImc[posicao];
    }

    public void setListaImcPosicao(Double imc, Integer posicao) {
        this.listaImc[posicao] = imc;
    }

    public void calculaImc() {

        for (int i = 0; i < listaNome.length; i++) {

            this.listaImc[i] = (this.listaPeso[i]) / (this.listaAltura[i] * this.listaAltura[i]);

        }

    }

    @Override
    public String toString() {
        return "ImcCalc [listaAltura=" + Arrays.toString(listaAltura) + ", listaImc=" + Arrays.toString(listaImc)
                + ", listaNome=" + Arrays.toString(listaNome) + ", listaPeso=" + Arrays.toString(listaPeso) + "]";
    }

}
