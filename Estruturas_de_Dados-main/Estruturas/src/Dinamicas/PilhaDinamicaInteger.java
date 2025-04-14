package Dinamicas;

import InterfacesAtividade.IEstruturaDinamica;
import Nos.No;
import Nos.NoInteger;

import java.util.List;

public class PilhaDinamicaInteger implements IEstruturaDinamica {
    private NoInteger  primeiro;
    private NoInteger ultimo;

    //Métodos da interface


    /*
    Este eu adaptei para receber apenas a pilha, pois estamos pilha e como possui a questão de pesos
    é complicado utilizar outro tipo de estrutura considerando o Nó.
     */
    @Override
    public void inserirSequencia(PilhaDinamicaInteger pilhaDinamicaInteger2) {
        NoInteger aux=pilhaDinamicaInteger2.obterPrimeiroElemento();
        if (pilhaDinamicaInteger2.estaVazia()){
            System.out.println("Pilha vazia");
        }else {
            do {
                inserirElemento(aux.getConteudo(), aux.getPeso());
                aux = aux.getProximo();
            } while (aux != null);
        }
    }

    @Override
    public void limpar() {
        //João Gabriel
        this.primeiro = null;
        this.ultimo = null;
    }

    @Override
    public boolean removerElemento(Object elemento) {
        // João Gabriel
        if (estaVazia()) {
            return false;
        }

        Integer valor = (Integer) elemento;
        NoInteger aux = ultimo; 

        while (aux != null) {
            if (aux.getConteudo().equals(valor)) {
                if (aux.getAnterior() != null) {
                    aux.getAnterior().setProximo(aux.getProximo());
                } else {
                    this.primeiro = aux.getProximo();
                }

                if (aux.getProximo() != null) {
                    aux.getProximo().setAnterior(aux.getAnterior());
                } else {
                    this.ultimo = aux.getAnterior();
                }

                return true;
            }
            aux = aux.getAnterior();
        }
        return false;
    }

    @Override
    public void removerTodasOcorrencias(Object elemento) {
        //João Gabriel
        int removidos = 0;
        while (removerElemento(elemento)) {
            removidos++;
        }
        System.out.println(removidos + " ocorrência(s) do elemento [" + elemento + "] removida(s).");
    }

    @Override
    public void removerSequencia(Object elementos) {
        //João Gabriel
        if (estaVazia()) {
            System.out.println("A pilha está vazia. Nada a remover.");
            return;
        }
        List<Integer> lista = (List<Integer>) elementos;
        for (int i = 0; i < lista.size(); i++) {
            removerTodasOcorrencias(lista.get(i));
        }

        /*
         * Esses comentários, juntamente com os do método coletarSequenciaRemocao(),
         * correspondem ao uso da própria estrutura da pilha
         * (em vez de usar List<>) para criação de uma lista contendo
         * os elementos a serem removidos.
         */
//        PilhaDinamicaInteger lista = (PilhaDinamicaInteger) elementos;
//        NoInteger aux = ((PilhaDinamicaInteger) elementos).primeiro;
//        while(aux != null) {
//            removerTodasOcorrencias(aux.getConteudo());
//            aux = aux.getProximo();
//        }

        System.out.println("Sequência removida da pilha.");
    }
    //pilha = {1, 3, 2, 5, 4, 13}
    //elementos = {3, 5, 13}

    //i=0 -> removerTodasOcorrencias(3)
    //pilha: {1, 2, 5, 4, 13}

    //i=1 -> removerTodasOcorrencias(5)
    //pilha: {1, 2, 4, 13}

    //i=2 -> removerTodasOcorrencias(13)
    //pilha: {1, 2, 4}



    @Override
    public boolean estaCheia() {
        return false;
        //Não precisa fazer
    }



    //Importante lembrar que este buscar elemento também buscará pelo peso então se tiver peso é bom saber.
    //Caso o usuário não saiba o peso por padrão sempre é bom lembrar que o peso é 1
    //E mais importante o peso também poderia ser boolena (true), (false), caso tena mais de um nivel
    // de peso ao invez de apenas 0 e 1.
    @Override
    public boolean buscarElemento(Integer conteudo, Integer peso) {
        NoInteger aux = this.primeiro;

        if (estaVazia()){
            return false;
        } else {
            do {
                if (aux.getConteudo()==conteudo&&aux.getPeso()==peso){
                    return true;
                }
                aux= aux.getProximo();
            }while (aux!=ultimo.getProximo());
            return false;
        }

    }

    @Override
    public void ordenarCrescente() {
        // Yuri
        if (estaVazia()) {
            return;
        }
        NoInteger aux = primeiro.getProximo();
        while (aux != null) {
            int conteudoAux = aux.getConteudo();
            int pesoAux = aux.getPeso();
            NoInteger anterior = aux.getAnterior();
            while (anterior != null && anterior.getConteudo() > conteudoAux) {
                anterior.getProximo().setConteudo(anterior.getConteudo());
                anterior.getProximo().setPeso(anterior.getPeso());
                anterior = anterior.getAnterior();
            }
            if (anterior == null) {
                primeiro.setConteudo(conteudoAux);
                primeiro.setPeso(pesoAux);
            } else {
                anterior.getProximo().setConteudo(conteudoAux);
                anterior.getProximo().setPeso(pesoAux);
            }
            aux = aux.getProximo();
        }
        System.out.println("Pilha ordenada em ordem crescente.");
        exibir();
    }

    @Override
    public void ordenarDecrescente() {
        //Yuri
        if (estaVazia()) {
            return;
        }
        NoInteger aux = primeiro.getProximo();
        while (aux != null) {
            int conteudoAux = aux.getConteudo();
            int pesoAux = aux.getPeso();
            NoInteger anterior = aux.getAnterior();
            while (anterior != null && anterior.getConteudo() < conteudoAux) {
                anterior.getProximo().setConteudo(anterior.getConteudo());
                anterior.getProximo().setPeso(anterior.getPeso());
                anterior = anterior.getAnterior();
            }
            if (anterior == null) {
                primeiro.setConteudo(conteudoAux);
                primeiro.setPeso(pesoAux);
            } else {
                anterior.getProximo().setConteudo(conteudoAux);
                anterior.getProximo().setPeso(pesoAux);
            }
            aux = aux.getProximo();
        }  
        System.out.println("Pilha ordenada em ordem decrescente.");
        exibir();
    }

    @Override
    public int quantidadeElementos() {
    //Yuri
    int contador = 0;
    NoInteger aux = primeiro;
    while (aux != null) {
        contador++;
        aux = aux.getProximo();
        }
    return contador;
    }

    @Override
    public void editarElemento(Integer conteudoAntigo, Integer pesoAntigo,Integer conteudoNovo, Integer pesoNovo) {
        NoInteger aux;
        if (buscarElemento(conteudoAntigo,pesoAntigo)){
            aux = puxarNo(conteudoAntigo, pesoAntigo);
            aux.setPeso(pesoNovo);
            aux.setConteudo(conteudoNovo);
        }else {
            System.out.println("Elemento não existe na lista");
        }
    }

    @Override
    public NoInteger obterPrimeiroElemento() {
        return primeiro;
    }

    @Override
    public No obterUltimoElemento() {
        return ultimo;
    }

    @Override
    public void exibir (){
        NoInteger aux = this.primeiro;

        if (estaVazia()) {
            System.out.println("A Pilha está vazia");
        }
        else {
            System.out.println("Pilha:");
            do {
                System.out.println("Conteudo[" + aux.getConteudo() + "] " +  "Peso["+aux.getPeso()+"]");
                aux = aux.getProximo();
            } while (aux!=ultimo.getProximo());

        }
    }

    @Override
    public void inserirElemento(Integer conteudo, Integer peso){
        NoInteger novoNo = new NoInteger();
        novoNo.setConteudo(conteudo);
        novoNo.setPeso(peso);
        if(estaVazia()) {
            this.primeiro = novoNo;
            this.ultimo = this.primeiro;
        } else {
            this.ultimo.setProximo(novoNo);
            novoNo.setAnterior(this.ultimo);
            this.ultimo=novoNo;
        }
    }

    //Metodos Normais

    public NoInteger puxarNo (Integer conteudo, Integer peso){
        NoInteger aux = this.primeiro;

        if (estaVazia()){
            return null;
        } else {
            do {
                if (aux.getConteudo()==conteudo&&aux.getPeso()==peso){
                    return aux;
                }
                aux= aux.getProximo();
            }while (aux!=ultimo.getProximo());
            return null;
        }

    }


    public void removerPilha () {
        NoInteger aux = ultimo;
        NoInteger aux2;
        if (!estaVazia()) {
            if (this.ultimo == this.primeiro) {
                this.primeiro = null;
            } else if (this.ultimo.getAnterior().getPeso() > 0) {
                // problema acontece quando o peso for no primero.
                if (this.ultimo.getAnterior()==this.primeiro){
                    aux = this.primeiro;
                    this.primeiro=this.ultimo;
                    this.primeiro.setProximo(null);
                    aux=null;
                } else {
                    aux2=aux.getAnterior();
                    aux = aux.getAnterior().getAnterior();
                    this.ultimo.setAnterior(ultimo.getAnterior().getAnterior());
                    aux.setProximo(ultimo);
                    aux2=null;
                }
            } else {
                this.ultimo = ultimo.getAnterior();
                this.ultimo.setProximo(null);
            }
        } else {
            System.out.println("A pilha está estaVazia");
        }
    }




    // Metodos segundarios
    public boolean estaVazia () {
        if (this.primeiro == null) {
            return true;
        }else {return false;}
    }

    public void ultimoElemento (){
        if(!estaVazia()) {
            System.out.println("O ultimo da fila é " + ultimo.getConteudo() + " com peso de" + ultimo.getPeso());
        }
    }

    public void exibirConteudo (){
        NoInteger aux = this.primeiro;

        if (estaVazia()) {
            System.out.println("A Pilha está vazia");
        }
        else {
            System.out.println("Pilha:");
            do {
                System.out.println("Conteudo[" + aux.getConteudo() + "]");
                aux = aux.getProximo();
            } while (aux!=ultimo.getProximo());

        }
    }


    //Get and Set


    public void setPrimeiro(NoInteger primeiro) {
        this.primeiro = primeiro;
    }



    public void setUltimo(NoInteger ultimo) {
        this.ultimo = ultimo;
    }

}


