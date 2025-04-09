package Simples;

public class FilaSimples {
    private int tamanho;
    private Integer [] fila;
    private Integer [] peso;

    public FilaSimples (int tamanho){
        setTamanho(tamanho);
        this.fila= new Integer[getTamanho()];
        this.peso = new Integer[getTamanho()];
    }
    //Métodos Principais

    //Na main colocar uma pergunta pro usuario se ele gostaria de dar peso ao conteudo
    // caso não colocar o peso 0
    //  Criar método modificar e achar, indice e conteudo
    public void adicionarFila (Integer conteudo, Integer peso){
        if (!cheia()){
            System.out.println("Não há espaço na fila.");
        } else{
            for (int i = 0; i < tamanho; i++) {
                if (checarIndice(i)){
                    this.fila[i] = conteudo;
                    this.peso[i] = peso;

                }
            }
        }

    }
    public void resolverFila(){
        if (vazia()){
            System.out.println("Não há elementos para serem resolvidos.");
        }else {
            if (this.peso[1] > 0){
                this.fila[1] = null;
                this.peso[1] = null;
            }
            else {
                this.peso[0] = null;
                this.fila[0] = null;
            }
            arrumarFila();

        }
    }

    private void arrumarFila (){
        int i = 0;
        if (checarIndice(1)){
            i = 1;
        }
        while(i < tamanho-1 && !checarIndice(i+1) ) {
            this.fila[i] = this.fila[i+1];
            this.peso[i] = this.peso[i+1];
            i = i+1;
        }
        this.fila[i] = null;
        this.peso[i] = null;
    }






    //Métodos Auxilires

    public void mostrarFila() {
        System.out.println("Exibindo elementos da lista.");
        for (int i = 0; i < this.tamanho; i++) {
            System.out.println("Fila[" + (i+1) + "] = " + this.fila[i]+ "Peso["+this.peso[i]+"]");
        }
    }

    public boolean cheia() {
        for (int i = 0; i < tamanho; i++) {
            if(this.fila[i] == null) {
                return false;
            }
        }
        return true;
    }


    public boolean checarIndice (int indice){
        if (this.fila[indice] == null){
            return true;
        } else {
            return false;
        }
    }
    //Por ser uma fila, não é necessario verificar todos os indices apenas, o primeiro.
    public boolean vazia() {
        if(this.fila[0] == null) {
            return true;
        } else {
            return false;
        }
    }



    //Get e Set

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public Integer[] getFilaSimples() {
        return fila;
    }

    public void setFilaSimples(Integer[] fila) {
        this.fila = fila;
    }
}
