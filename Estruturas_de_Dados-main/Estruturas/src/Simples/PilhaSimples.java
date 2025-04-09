package Simples;

public class PilhaSimples {
    private int tamanho;
    private Integer [] pilha;
    private Integer [] peso;

    public PilhaSimples(int tamanho) {
        setTamanho(tamanho);
        this.pilha = new Integer[getTamanho()];
        this.peso = new Integer[getTamanho()];
    }
    //Métodos Principais

    //Na main colocar uma pergunta pro usuario se ele gostaria de dar peso ao conteudo
    // caso não colocar o peso 0
    // Criar método modificar e achar, indice e conteudo
    public void adicionarPilhar (Integer conteudo, Integer peso){
        if (!cheia()) {
            System.out.println("Não há espaço na pilha.");
        } else{
            for (int i = 0; i < tamanho; i++) {
                if (checarIndice(i)){
                    this.peso[i] = peso;
                    this.pilha [i]= conteudo;
                }
            }
        }
    }
    public void resolverPilha (){
        Integer aux;
        if (vazia()){
            System.out.println("Não há elementos para serem resolvidos");
        } else{
            aux = ultimoElemento();
            if (aux == 0){
                this.pilha[0] = null;
                this.peso[0] = null;

            } else {
                if (this.peso[aux-1] > 0) {
                    this.pilha[aux-1] = null;
                    this.peso[aux-1] = null;
                }
                else {
                    this.pilha[aux] = null;
                    this.peso[aux]= null;
                }
            }

        }
    }

    // Métodos auxiliares

    public void mostrarFila() {
        System.out.println("Exibindo elementos da lista.");
        for (int i = 0; i < this.tamanho; i++) {
            System.out.println("Phila[" + (i+1) + "] = " + this.pilha[i]+ "Peso["+this.peso[i]+"]");
        }
    }

    public boolean cheia() {
        for (int i = 0; i < tamanho; i++) {
            if(this.pilha[i] == null) {
                return false;
            }
        }
        return true;
    }

    //precisa da verificação de vazia antes.
    public Integer ultimoElemento () {
        Integer num = null;
        for (int i = 0; i < tamanho; i++) {
            if (this.pilha[i] != null) {
                num = i;
            }
            if (this.pilha[i] == null) {
                break;
            }
        }
        return num;

    }


    public boolean checarIndice (int indice){
        if (this.pilha[indice] == null){
            return true;
        } else {
            return false;
        }
    }
    //Por ser uma pilha, não é necessario verificar todos os indices apenas, o primeiro.
    public boolean vazia() {
        if(this.pilha[0] == null) {
            return true;
        } else {
            return false;
        }
    }
    //Gett and Sett
    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public Integer[] getPilha() {
        return pilha;
    }

    public void setPilha(Integer[] pilha) {
        this.pilha = pilha;
    }

    public Integer[] getPeso() {
        return peso;
    }

    public void setPeso(Integer[] peso) {
        this.peso = peso;
    }
}

