package Nos;

public class NoString extends  No
{
    private String conteudo;

    public NoString(){
        setConteudo(null);
        setPeso(null);
        setProximo(null);
        setAnterior(null);
    }


    //Get e set
    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

}
