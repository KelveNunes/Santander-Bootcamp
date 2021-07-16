package br.com.digital.innovation.one.Aula2;

import java.util.function.Predicate;
public class Predicados {
    public static void main(String[] args) {
        Predicate<String> estaVazio = valor -> valor.isEmpty();
        System.out.println(estaVazio.test("a"));
    }
}
