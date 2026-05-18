package br.com.fiapride.main;

import br.com.fiapride.model.Cachorro;

public class SistemaPrincipal {

    public static void main(String[] args) {

        // INSTANCIAÇÃO
        Cachorro cachorro1 = new Cachorro();

        cachorro1.setCor("Cinza");
        cachorro1.setPeso(20);
        cachorro1.setTamanho(55);
        cachorro1.setEnergia(10);

        Cachorro cachorro2 = new Cachorro();

        cachorro2.setCor("Marrom");
        cachorro2.setPeso(35);
        cachorro2.setTamanho(60);
        cachorro2.setEnergia(10);

        // EXIBIÇÃO INICIAL
        System.out.println("--- Sistema FiapRide ---");

        System.out.println();

        System.out.println("-- Cachorro 1 --");
        System.out.println("Cor: " + cachorro1.getCor());
        System.out.println("Peso: " + cachorro1.getPeso() + "kg");
        System.out.println("Tamanho inicial: " + cachorro1.getTamanho() + "cm");
        System.out.println("Energia inicial: " + cachorro1.getEnergia());

        System.out.println();

        System.out.println("-- Cachorro 2 --");
        System.out.println("Cor: " + cachorro2.getCor());
        System.out.println("Peso: " + cachorro2.getPeso() + "kg");
        System.out.println("Tamanho inicial: " + cachorro2.getTamanho() + "cm");
        System.out.println("Energia inicial: " + cachorro2.getEnergia());

        System.out.println();

        // TESTE COM VALORES VÁLIDOS
        System.out.println("-- Testes válidos --");

        cachorro1.crescer(5);
        cachorro1.brincar(4);

        System.out.println();

        // ESTADO APÓS ALTERAÇÕES
        System.out.println("--- Estado atualizado ---");

        System.out.println("-- Cachorro 1 --");
        System.out.println("Cor: " + cachorro1.getCor());
        System.out.println("Peso: " + cachorro1.getPeso() + "kg");
        System.out.println("Tamanho atualizado: " + cachorro1.getTamanho() + "cm");
        System.out.println("Energia atualizada: " + cachorro1.getEnergia());

        System.out.println();

        System.out.println("-- Cachorro 2 --");
        System.out.println("Cor: " + cachorro2.getCor());
        System.out.println("Peso: " + cachorro2.getPeso() + "kg");
        System.out.println("Tamanho atualizado: " + cachorro2.getTamanho() + "cm");
        System.out.println("Energia atualizada: " + cachorro2.getEnergia());

        System.out.println();

        // TESTE COM VALORES INVÁLIDOS
        System.out.println("-- Testes inválidos --");

        cachorro1.crescer(0);
        cachorro1.brincar(20);

        // TESTE DA REGRA DO SET
        cachorro1.setPeso(-10);

        System.out.println();

        // ESTADO FINAL
        System.out.println("--- Estado final ---");

        System.out.println("-- Cachorro 1 --");
        System.out.println("Cor: " + cachorro1.getCor());
        System.out.println("Peso: " + cachorro1.getPeso() + "kg");
        System.out.println("Tamanho final: " + cachorro1.getTamanho() + "cm");
        System.out.println("Energia final: " + cachorro1.getEnergia());

        System.out.println();

        System.out.println("-- Cachorro 2 --");
        System.out.println("Cor: " + cachorro2.getCor());
        System.out.println("Peso: " + cachorro2.getPeso() + "kg");
        System.out.println("Tamanho final: " + cachorro2.getTamanho() + "cm");
        System.out.println("Energia final: " + cachorro2.getEnergia());
    }
}