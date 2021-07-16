package br.com.digital.innovation.one.Aula2;

import java.util.function.Function;

public class Funçoes {
    public static void main(String[] args) {
        Function<String, Integer> retornaInteiro = frase -> Integer.valueOf(frase);
        Function<String, String> retorneAoContrario = frase -> new StringBuilder(frase).reverse().toString();
        System.out.println(retorneAoContrario.apply("kelve"));
        System.out.println(retornaInteiro.apply("20"));


    }
}



