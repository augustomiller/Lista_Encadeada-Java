package com.github.maicmiller;

public class Main {

    public static void main(String[] args) {

        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

        minhaListaEncadeada.add("teste1");
        minhaListaEncadeada.add("teste2");
        minhaListaEncadeada.add("teste3");
        minhaListaEncadeada.add("teste4");

        System.out.println(minhaListaEncadeada.get(0));
        System.out.println(minhaListaEncadeada.get(1));
        System.out.println(minhaListaEncadeada.get(2));
        System.out.println(minhaListaEncadeada.get(3));

        // Imprimindo a Lista completa...
        System.out.println(minhaListaEncadeada);

        // Removendo o Nó de índice número 3...
        System.out.println(minhaListaEncadeada.remove(3));
        System.out.println(minhaListaEncadeada);




    }
}
