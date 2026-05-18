package br.com.fiapride.main;

// Importamos a classe Cachorro para que o sistema a reconheça
import br.com.fiapride.model.Cachorro;

public class SistemaPrincipal {

    public static void main(String[] args) {
        // INSTANCIAÇÃO
        // O comando 'new' aloca memória para um novo objeto.
        // Criando o primeiro passageiro (Objeto 1)
    	Cachorro cachorro1 = new Cachorro();
        cachorro1.cor = "Cinza";
        cachorro1.peso = 20; //kg
        cachorro1.tamanho = 55; //cm
        

        // Criando o segundo passageiro (Objeto 2)
        Cachorro cachorro2 = new Cachorro();
        cachorro2.cor = "Marrom";
        cachorro2.peso = 35; //kg
        cachorro2.tamanho = 60; //cm

        // Exibindo os dados no Console
        System.out.println("--- Sistema FiapRide ---");
        System.out.println("Meu cachorro é: " + cachorro1.cor);
        System.out.println("O cachorro do professor é: " + cachorro2.cor);
        
    }
}