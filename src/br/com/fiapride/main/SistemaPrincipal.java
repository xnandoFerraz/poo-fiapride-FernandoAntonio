package br.com.fiapride.main;

import br.com.fiapride.model.Cachorro;
import br.com.fiapride.model.Dono;

public class SistemaPrincipal {

    public static void main(String[] args) {

        // INSTANCIAÇÃO
    	
    	Dono dono1 = new Dono("Fernando", 19);

    	Cachorro cachorro1 = new Cachorro(
    	    "Apolo",
    	    "Cinza",
    	    20,
    	    55,
    	    10,
    	    dono1
    	);

    	Dono dono2 = new Dono("Rodolfo", 30);

    	Cachorro cachorro2 = new Cachorro(
    	    "Boris",
    	    "Cinza",
    	    20,
    	    55,
    	    10,
    	    dono2
    	);

        // EXIBIÇÃO INICIAL
        System.out.println("--- Sistema FiapRide ---");

        System.out.println();

        System.out.println("-- Cachorro 1 (" + cachorro1.getNome() +") --");
        System.out.println("Cor: " + cachorro1.getCor());
        System.out.println("Peso: " + cachorro1.getPeso() + "kg");
        System.out.println("Tamanho inicial: " + cachorro1.getTamanho() + "cm");
        System.out.println("Energia inicial: " + cachorro1.getEnergia());
        System.out.println("Nome do dono: " + cachorro1.getDono().getNome());

        System.out.println();

        System.out.println("-- Cachorro 2 (" + cachorro2.getNome() +") --");
        System.out.println("Cor: " + cachorro2.getCor());
        System.out.println("Peso: " + cachorro2.getPeso() + "kg");
        System.out.println("Tamanho inicial: " + cachorro2.getTamanho() + "cm");
        System.out.println("Energia inicial: " + cachorro2.getEnergia());
        System.out.println("Nome do dono: " + cachorro2.getDono().getNome());

        System.out.println();

        // TESTE COM VALORES VÁLIDOS
        System.out.println("-- Testes válidos --");

        cachorro1.crescer(5);
        cachorro1.brincar(4);

        System.out.println();

        // ESTADO APÓS ALTERAÇÕES
        System.out.println("--- Estado atualizado ---");

        System.out.println("-- Cachorro 1 (" + cachorro1.getNome() +") --");
        System.out.println("Cor: " + cachorro1.getCor());
        System.out.println("Peso: " + cachorro1.getPeso() + "kg");
        System.out.println("Tamanho atualizado: " + cachorro1.getTamanho() + "cm");
        System.out.println("Energia atualizada: " + cachorro1.getEnergia());
        System.out.println("Nome do dono: " + cachorro1.getDono().getNome());

        System.out.println();

        System.out.println("-- Cachorro 2 (" + cachorro2.getNome() +") --");
        System.out.println("Cor: " + cachorro2.getCor());
        System.out.println("Peso: " + cachorro2.getPeso() + "kg");
        System.out.println("Tamanho atualizado: " + cachorro2.getTamanho() + "cm");
        System.out.println("Energia atualizada: " + cachorro2.getEnergia());
        System.out.println("Nome do dono: " + cachorro2.getDono().getNome());

        System.out.println();

        // TESTE COM VALORES INVÁLIDOS
        System.out.println("-- Testes inválidos --");

        cachorro1.crescer(0);
        cachorro1.brincar(20);

        // TESTE DA REGRA DO SET
        cachorro1.setPeso(-10);

        System.out.println();

        // ESTADO FINAL
        System.out.println("--- Estado Inválido ---");

        System.out.println("-- Cachorro 1 (" + cachorro1.getNome() +") --");
        System.out.println("Cor: " + cachorro1.getCor());
        System.out.println("Peso: " + cachorro1.getPeso() + "kg");
        System.out.println("Tamanho final: " + cachorro1.getTamanho() + "cm");
        System.out.println("Energia final: " + cachorro1.getEnergia());
        System.out.println("Nome do dono: " + cachorro1.getDono().getNome());

        System.out.println();

        System.out.println("-- Cachorro 2 (" + cachorro2.getNome() +") --");
        System.out.println("Cor: " + cachorro2.getCor());
        System.out.println("Peso: " + cachorro2.getPeso() + "kg");
        System.out.println("Tamanho final: " + cachorro2.getTamanho() + "cm");
        System.out.println("Energia final: " + cachorro2.getEnergia());
        System.out.println("Nome do dono: " + cachorro2.getDono().getNome());
    }
}