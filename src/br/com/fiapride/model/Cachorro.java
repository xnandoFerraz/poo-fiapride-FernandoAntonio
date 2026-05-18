package br.com.fiapride.model;

public class Cachorro {

    private String nome;
    private String cor;
    private int peso;
    private int tamanho;
    private int energia;
    private Dono dono;

    // Construtor
    public Cachorro(
            String nome,
            String cor,
            int peso,
            int tamanho,
            int energia,
            Dono dono
    ) {
        this.setNome(nome);
        this.setCor(cor);
        this.setPeso(peso);
        this.setTamanho(tamanho);
        this.setEnergia(energia);
        this.setDono(dono);
    }

    // Getters e Setters

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPeso() {
        return peso;
    }

    // Regra de negócio
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
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Erro: nome inválido.");
        }
    }
    
    public Dono getDono() {
        return dono;
    }
    public void setDono(Dono dono) {
        this.dono = dono;
    }
    
    public String fazerSom() {

        return "O cachorro está fazendo um som.";
    }

    // Método 1
    public void crescer(int cm) {

        if (cm > 0) {

            tamanho = tamanho + cm;
            System.out.println("O cachorro cresceu " + cm + "cm.");

        } else {

            System.out.println("Erro: o tamanho deve ser maior que zero.");
        }
    }

    // Método 2
    public void brincar(int tempo) {

        if (tempo > 0 && energia >= tempo) {

            energia = energia - tempo;
            System.out.println("O cachorro brincou por " + tempo + " minutos.");

        } else {

            System.out.println("Erro: energia insuficiente.");
        }
    }
}