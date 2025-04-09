package Dinamicas;

import Nos.NoInteger;

public class FilaDinamicaInteger {
    private NoInteger  primeiro;
    private NoInteger ultimo;

    public FilaDinamicaInteger (){
        this.primeiro = new NoInteger();
        this.ultimo= this.primeiro;
    }


    //Metodos principais
    public void mostrarFila (){
        NoInteger aux = this.primeiro;

        if (vazia()) {
            System.out.println("A Fila está vazia");
        }
        else {
            System.out.println("Fila:");
            do {
                System.out.println("Conteudo[" + aux.getConteudo() + "] " +  "Peso["+aux.getPeso()+"]");
                aux = aux.getProximo();
            } while (aux!=ultimo);

        }
    }

    public void adicionarFila (Integer conteudo, Integer peso){
        NoInteger novoNo = new NoInteger();
        novoNo.setConteudo(conteudo);
        novoNo.setPeso(peso);
        if(vazia()) {
            this.primeiro = novoNo;
            this.ultimo = this.primeiro;
        } else {
            this.ultimo.setProximo(novoNo);
            novoNo.setAnterior(this.ultimo);
            this.ultimo=novoNo;
        }
    }

    public void removerFila () {
        NoInteger aux = primeiro;

        if (this.primeiro.getProximo().getPeso() > 0) {
            aux = aux.getProximo().getProximo();
            aux.setAnterior(primeiro);
            this.primeiro.setProximo(primeiro.getProximo().getProximo());
        } else {
            this.primeiro = primeiro.getProximo();
            this.primeiro.setAnterior(null);
        }
    }




    // Metodos segundarios
    public boolean vazia () {
        if (this.primeiro == null) {
            return true;
        }else {return false;}
    }

    public void ultimoElemento (){
        System.out.println("O ultimo da fila é "+ultimo.getConteudo()+" com peso de"+ultimo.getPeso());
    }



    //Get and Set

    public NoInteger getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(NoInteger primeiro) {
        this.primeiro = primeiro;
    }

    public NoInteger getUltimo() {
        return ultimo;
    }

    public void setUltimo(NoInteger ultimo) {
        this.ultimo = ultimo;
    }
}
