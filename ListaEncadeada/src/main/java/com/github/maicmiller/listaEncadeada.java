package com.github.maicmiller;

public class listaEncadeada<T> {

    No<T> referenciaEntrada;

    public listaEncadeada() {
        this.referenciaEntrada = null;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if (this.isEmpty()){ // Se a lista estiver vazia...
            referenciaEntrada = novoNo; // Eu digo que a referencia de entrada é igual ao novo nó...
            return;
        }
        // Se ñao, continua...
        No<T> noAuxiliar = referenciaEntrada;

        for (int i = 0; i < this.size() -1 ; i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        
        noAuxiliar.setProximoNo(novoNo);

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
