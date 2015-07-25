package com.ddm.gradle;

public class Pessoa {
    private final String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public static void main(String[] args){
        System.out.println("Olá Java.");
    }
}
