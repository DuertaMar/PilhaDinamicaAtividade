package Simples;

public class ListaSimples {
    private int tamanho;
    Integer [] lista;

    public ListaSimples(int tamanhoEstrutura) {
        this.tamanho = tamanhoEstrutura;
        lista = new Integer[tamanhoEstrutura];
        System.out.println("A lista criada foi criada com sucesso. Seu tamanho é igual a:" + tamanhoEstrutura);
    }

    public void mostrarLista() {
        System.out.println("Exibindo elementos da lista.");
        for (int i = 0; i < this.tamanho; i++) {
            System.out.println("Lista[" + (i+1) + "] = " + this.lista[i]);
        }
    }

    public void adicionarLista(int valor) {
        for (int i = 0; i < tamanho; i++) {
            if(checarIndice(i)) {
                this.lista[i] = valor;
                System.out.println("O valor " + valor + " foi adicionado com sucesso!");
                return;
            }
        }
        System.out.println("Todas posições estão preenchidas.");
    }

    public boolean checarIndice(int indice) {
        if(this.lista[indice] == null) {
            return true;
        } else {
            return false;
        }
    }

    public void removerPorIndice(int indice) {
        if(checarIntervalo(indice)){
            if(checarIndice(indice)){
                System.out.println("Não existe um valor a ser removido.");
            } else {
                this.lista[indice] = null;
            }
        }
    }
    //Não possuo nos outros simples

    public boolean checarIntervalo(int indice) {
        if(indice >= 0 && indice < this.tamanho){
            return true;
        }
        System.out.println("O indice informado está fora do intervalo.");
        return false;
    }
    /*
//  Não possuo nos outros indices
    public boolean buscaValor(int valor) {
        for (int i = 0; i < this.tamanho; i++) {
            if(!checarIndice(i)) {
                if(checarValorIndice(valor, i)){
                    System.out.println("O elemento " + valor + " existe na lista.");
                    return true;
                }
            }
        }
        System.out.println("O elemento " + valor + " não existe na lista.");
        return false;
    }

    public boolean checarValorIndice(int valor, int indice) {
        if(this.lista[indice] == valor) {
            return true;
        }
        return false;
    }




    public void modificarValorporIndice (int indice, int valor){
        if (checarIntervalo(indice)){
            lista[indice] = valor;
        }
    }

    */

    public int getTamanho() {
        return tamanho;
    }
}