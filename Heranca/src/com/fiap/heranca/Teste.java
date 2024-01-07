package com.fiap.heranca;

public class Teste {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.setAlimenta("Todo animal se alimenta!");
        animal.setLocomove("Todo animal se locomove!");

        Cachorro cachorro = new Cachorro();
        cachorro.setAlimenta("Cachorro come ração de cachorro.");
        cachorro.setLocomove("Cachorro usa 4 patas.");
        cachorro.setLatido("Cachorro faz Au Au!");

        /* Objeto através da subclasse Cachorro e variável de referência através da superclasse
        animal. Ele só consegue acessar os atributos da superclasse Animal */
        Animal poodle = new Cachorro();
        poodle.setAlimenta("Poodle come ração de cachorro.");
        poodle.setLocomove("Poodle usa 4 patas.");

        System.out.println(animal.getAlimenta());
        System.out.println(animal.getLocomove());
        System.out.println(cachorro.getLatido());
        System.out.println(poodle.getLocomove());


    }
}
