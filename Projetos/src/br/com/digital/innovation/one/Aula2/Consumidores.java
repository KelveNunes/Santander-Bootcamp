package br.com.digital.innovation.one.Aula2;

import java.util.function.Consumer;

public class Consumidores {
    public static void main(String[] args) {
        //Method Reference

        //     - apenas utilizar o parametros da forma que eçe foi recebido
        Consumer<String> imprimirFrase = System.out::println;
        Consumer<String> imprimirFrase2 = frase -> System.out.println(frase);
        imprimirFrase.accept("Hello World");
        imprimirFrase2.accept("Hello World");
    }
}

