package br.com.digital.innovation.one.Aula2;

import org.jetbrains.annotations.NotNull;

public class FunçaoAltaOrdem {
    public static void main(String[] args) {
        Calculo soma =(a,b) -> a+b;
        Calculo sub = (a,b) -> a-b;
        Calculo multi = (a,b) -> a*b;
        Calculo div = (a,b) -> a/b;

        System.out.println("soma: "+ executarOperaçao(soma, 3, 4));
        System.out.println("subitraçao: " + executarOperaçao(sub, 3, 4));
        System.out.println("multiplicaçao: " + executarOperaçao(multi, 3, 4));
        System.out.println("divisao: " + executarOperaçao(div, 4, 4));
    }
    public static int executarOperaçao(@NotNull Calculo calculo, int a, int b){
        return calculo.calculo(a,b);
    }
}

@FunctionalInterface
interface Calculo {

    public int calculo(int a,int b);
}

//Funções de alta ordem:
//
//	por parametro recebe outra função
//	ou ela retorna uma função.
