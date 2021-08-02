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

    public T get(int index){ // Passando o índice do nó que queremos pegar a informação como parâmetro...
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index){

        validaIndice(index);

        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;

        for(int i = 0; i < this.size(); i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    public T remove(int index){
        No<T> noTarget = this.getNo(index);
        if (index == 0){ // Se estou com o índice igual a zero, quer dizer que esta removendo o primeiro nó(índice 0)...
            referenciaEntrada = noTarget.getProximoNo();
            return noTarget.getConteudo();
        }
        No<T> noAnterior = getNo(index -1);
        noAnterior.setProximoNo(noTarget.getProximoNo());
        return noTarget.getConteudo();
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

    private void validaIndice(int index){
        if (index >=size()){
            int ultimoIndice = size() -1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice!" + index + "dessa Lista. Esta lista só vai até o índice" + ultimoIndice + ".");
        }
    }

    public boolean isEmpty(){
        return referenciaEntrada == null;
    }
}
