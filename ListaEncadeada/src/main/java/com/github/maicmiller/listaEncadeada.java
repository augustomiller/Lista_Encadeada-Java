package com.github.maicmiller;

public class listaEncadeada<T> {

    No<T> referenciaEntrada;

    public listaEncadeada() {
        this.referenciaEntrada = null;
    }

    public int size(){ // Método responsável por retornar o tamanho da lista...
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;
        while (true){
            if(referenciaAux != null){ // Verificando se o ponteiro onde estou é nulo...
                tamanhoLista++;
                if (referenciaAux.getProximoNo() != null) {
                    referenciaAux = referenciaAux.getProximoNo();
                } else{
                    break;
                }
            }else{
                break;
            }
        }

        return tamanhoLista;
    }

    public boolean isEmpty(){
        return referenciaEntrada == null;
    }
}
