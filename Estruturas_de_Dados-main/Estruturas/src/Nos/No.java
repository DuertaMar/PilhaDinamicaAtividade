package Nos;

public abstract class No {
    private Integer peso;
    private NoInteger proximo;
    private NoInteger anterior;


    //Get e set
    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public NoInteger getProximo() {
        return proximo;
    }

    public void setProximo(NoInteger proximo) {
        this.proximo = proximo;
    }

    public NoInteger getAnterior() {
        return anterior;
    }

    public void setAnterior(NoInteger anterior) {
        this.anterior = anterior;
    }
}

