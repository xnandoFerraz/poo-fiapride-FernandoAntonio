package br.com.fiapride.model;

public class Cachorro {

    // ATRIBUTOS
    private String cor;
    private int peso;
    private int tamanho;
    private int energia;

    // GETTERS E SETTERS

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPeso() {
        return peso;
    }

    // REGRA DE NEGÓCIO
    // O peso não pode ser menor ou igual a zero
    public void setPeso(int peso) {

        if (peso > 0) {
            this.peso = peso;

        } else {
            System.out.println("Erro: peso inválido.");
        }
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    // MÉTODO 1
    public void crescer(int cm) {

        if (cm > 0) {

            tamanho = tamanho + cm;
            System.out.println("O cachorro cresceu " + cm + "cm.");

        } else {

            System.out.println("Erro: o tamanho deve ser maior que zero.");
        }
    }

    // MÉTODO 2
    public void brincar(int tempo) {

        if (tempo > 0 && energia >= tempo) {

            energia = energia - tempo;
            System.out.println("O cachorro brincou por " + tempo + " minutos.");

        } else {

            System.out.println("Erro: energia insuficiente.");
        }
    }
}