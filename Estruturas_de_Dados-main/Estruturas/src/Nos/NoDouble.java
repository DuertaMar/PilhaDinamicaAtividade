package Nos;

public class NoDouble extends  No
{
    private Double conteudo;

    public NoDouble(){
        setConteudo(null);
        setPeso(null);
        setProximo(null);
        setAnterior(null);
    }


    //Get e set
    public Double getConteudo() {
        return conteudo;
    }

    public void setConteudo(Double conteudo) {
        this.conteudo = conteudo;
    }

}
