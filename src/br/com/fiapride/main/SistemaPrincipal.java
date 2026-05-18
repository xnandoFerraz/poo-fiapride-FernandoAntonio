package br.com.fiapride.main;

import br.com.fiapride.model.Cachorro;

public class SistemaPrincipal {

    public static void main(String[] args) {

        // INSTANCIAÇÃO
        Cachorro cachorro1 = new Cachorro();

        cachorro1.cor = "Cinza";
        cachorro1.peso = 20;
        cachorro1.tamanho = 55;
        cachorro1.energia = 10;
        
        Cachorro cachorro2 = new Cachorro();

        cachorro2.cor = "Marrom";
        cachorro2.peso = 35;
        cachorro2.tamanho = 60;
        cachorro2.energia = 10;


        // EXIBIÇÃO INICIAL
        System.out.println("--- Sistema FiapRide ---");
        
        System.out.println();

        System.out.println("--Cachorro 1--");
        System.out.println("Cor: " + cachorro1.cor);
        System.out.println("Peso: " + cachorro1.peso + "kg");
        System.out.println("Tamanho inicial: " + cachorro1.tamanho + "cm");
        System.out.println("Energia inicial: " + cachorro1.energia);
        
        System.out.println();
        
        System.out.println("--Cachorro 2--");
        System.out.println("Cor: " + cachorro2.cor);
        System.out.println("Peso: " + cachorro2.peso + "kg");
        System.out.println("Tamanho inicial: " + cachorro2.tamanho + "cm");
        System.out.println("Energia inicial: " + cachorro2.energia);

        System.out.println();

        // TESTE COM VALORES VÁLIDOS
        System.out.println("-- Testes válidos --");

        cachorro1.crescer(5);
        cachorro1.brincar(4);

        System.out.println();

        // ESTADO APÓS ALTERAÇÕES
        System.out.println("--- Estado atualizado ---");
        
        System.out.println("--Cachorro 1--");
        System.out.println("Cor: " + cachorro1.cor);
        System.out.println("Peso: " + cachorro1.peso + "kg");
        System.out.println("Tamanho atualizado: " + cachorro1.tamanho + "cm");
        System.out.println("Energia atualizado: " + cachorro1.energia);
        
        System.out.println();
        
        System.out.println("--Cachorro 2--");
        System.out.println("Cor: " + cachorro2.cor);
        System.out.println("Peso: " + cachorro2.peso + "kg");
        System.out.println("Tamanho atualizado: " + cachorro2.tamanho + "cm");
        System.out.println("Energia atualizado: " + cachorro2.energia);

        System.out.println();

        // TESTE COM VALORES INVÁLIDOS
        System.out.println("-- Testes inválidos --");

        cachorro1.crescer(0);
        cachorro1.brincar(20);
        
        System.out.println();
        
        System.out.println("--- Estado atualizado ---");
        
        System.out.println("--Cachorro 1--");
        System.out.println("Cor: " + cachorro1.cor);
        System.out.println("Peso: " + cachorro1.peso + "kg");
        System.out.println("Tamanho atualizado: " + cachorro1.tamanho + "cm");
        System.out.println("Energia atualizado: " + cachorro1.energia);
        
        System.out.println();
        
        System.out.println("--Cachorro 2--");
        System.out.println("Cor: " + cachorro2.cor);
        System.out.println("Peso: " + cachorro2.peso + "kg");
        System.out.println("Tamanho atualizado: " + cachorro2.tamanho + "cm");
        System.out.println("Energia atualizado: " + cachorro2.energia);

    }
}