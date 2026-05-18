package br.com.fiapride.main;

import java.util.ArrayList;
import java.util.List;
import br.com.fiapride.model.Cachorro;
import br.com.fiapride.model.CachorroHusky;
import br.com.fiapride.model.CachorroPastorAlemao;
import br.com.fiapride.model.Dono;

public class SistemaPrincipal {

    public static void main(String[] args) {

        // Instanciação

        Dono dono1 = new Dono("Fernando", 19);

        CachorroPastorAlemao cachorro1 = new CachorroPastorAlemao(
            "Apolo",
            "Cinza",
            20,
            55,
            10,
            dono1,
            "Patrulha"
        );

        Dono dono2 = new Dono("Rodolfo", 30);

        CachorroHusky cachorro2 = new CachorroHusky(
            "Boris",
            "Branco",
            20,
            55,
            10,
            dono2,
            true
        );
        
        List<Cachorro> listaCachorros = new ArrayList<>();

        listaCachorros.add(cachorro1);
        listaCachorros.add(cachorro2);

        // Tela inicial
        System.out.println("--- Sistema FiapRide ---");

        System.out.println();

        System.out.println("-- Cachorro 1 (" + cachorro1.getNome() + ") --");
        System.out.println("Cor: " + cachorro1.getCor());
        System.out.println("Peso: " + cachorro1.getPeso() + "kg");
        System.out.println("Tamanho inicial: " + cachorro1.getTamanho() + "cm");
        System.out.println("Energia inicial: " + cachorro1.getEnergia());
        System.out.println("Nome do dono: " + cachorro1.getDono().getNome());

        // Atributo exclusivo
        System.out.println("Missão militar: " + cachorro1.getMissao());

        System.out.println();

        System.out.println("-- Cachorro 2 (" + cachorro2.getNome() + ") --");
        System.out.println("Cor: " + cachorro2.getCor());
        System.out.println("Peso: " + cachorro2.getPeso() + "kg");
        System.out.println("Tamanho inicial: " + cachorro2.getTamanho() + "cm");
        System.out.println("Energia inicial: " + cachorro2.getEnergia());
        System.out.println("Nome do dono: " + cachorro2.getDono().getNome());

        // Atributo exclusivo
        System.out.println("Gosta de neve: " + cachorro2.isGostaDeNeve());

        System.out.println();

        System.out.println("--- Polimorfismo ---");

        for (Cachorro cachorro : listaCachorros) {

            System.out.println(
                cachorro.getNome() + ": " + cachorro.fazerSom()
            );
        }
        
        System.out.println();

        // Teste com valores válidos
        System.out.println("-- Testes válidos --");

        cachorro1.crescer(5);
        cachorro1.brincar(4);

        System.out.println();

        // Estado após alteração
        System.out.println("--- Estado atualizado ---");

        System.out.println("-- Cachorro 1 (" + cachorro1.getNome() + ") --");
        System.out.println("Cor: " + cachorro1.getCor());
        System.out.println("Peso: " + cachorro1.getPeso() + "kg");
        System.out.println("Tamanho atualizado: " + cachorro1.getTamanho() + "cm");
        System.out.println("Energia atualizada: " + cachorro1.getEnergia());
        System.out.println("Nome do dono: " + cachorro1.getDono().getNome());
        System.out.println("Missão militar: " + cachorro1.getMissao());

        System.out.println();

        System.out.println("-- Cachorro 2 (" + cachorro2.getNome() + ") --");
        System.out.println("Cor: " + cachorro2.getCor());
        System.out.println("Peso: " + cachorro2.getPeso() + "kg");
        System.out.println("Tamanho atualizado: " + cachorro2.getTamanho() + "cm");
        System.out.println("Energia atualizada: " + cachorro2.getEnergia());
        System.out.println("Nome do dono: " + cachorro2.getDono().getNome());
        System.out.println("Gosta de neve: " + cachorro2.isGostaDeNeve());

        System.out.println();

        System.out.println("--- Polimorfismo ---");

        for (Cachorro cachorro : listaCachorros) {

            System.out.println(
                cachorro.getNome() + ": " + cachorro.fazerSom()
            );
        }
        
        System.out.println();

        // Teste com valores inválidos
        System.out.println("-- Testes inválidos --");

        cachorro1.crescer(0);
        cachorro1.brincar(20);

        // Teste da regra do set
        cachorro1.setPeso(-10);

        System.out.println();

        // Estado final
        System.out.println("--- Estado Inválido ---");

        System.out.println("-- Cachorro 1 (" + cachorro1.getNome() + ") --");
        System.out.println("Cor: " + cachorro1.getCor());
        System.out.println("Peso: " + cachorro1.getPeso() + "kg");
        System.out.println("Tamanho final: " + cachorro1.getTamanho() + "cm");
        System.out.println("Energia final: " + cachorro1.getEnergia());
        System.out.println("Nome do dono: " + cachorro1.getDono().getNome());
        System.out.println("Missão militar: " + cachorro1.getMissao());

        System.out.println();

        System.out.println("-- Cachorro 2 (" + cachorro2.getNome() + ") --");
        System.out.println("Cor: " + cachorro2.getCor());
        System.out.println("Peso: " + cachorro2.getPeso() + "kg");
        System.out.println("Tamanho final: " + cachorro2.getTamanho() + "cm");
        System.out.println("Energia final: " + cachorro2.getEnergia());
        System.out.println("Nome do dono: " + cachorro2.getDono().getNome());
        System.out.println("Gosta de neve: " + cachorro2.isGostaDeNeve());
        
        System.out.println();

        System.out.println("--- Polimorfismo ---");

        for (Cachorro cachorro : listaCachorros) {

            System.out.println(
                cachorro.getNome() + ": " + cachorro.fazerSom()
            );
        }
        
        System.out.println();

    }
}