package br.com.digital.innovation.one.Aula2;

import java.util.function.Supplier;
public class Supridores {
    public static void main(String[] args) {
        Supplier<Pessoa> instaciarClasse = Pessoa::new;
        System.out.println(instaciarClasse.get());
    }
}

class Pessoa{
    private String nome;
    private int idade;

    public Pessoa(){
        this.nome = "kelve";
        this.idade = 22;
    }

    @Override
    public String toString(){
        return String.format("nome: %s, idade: %d", nome, idade);
    }
}