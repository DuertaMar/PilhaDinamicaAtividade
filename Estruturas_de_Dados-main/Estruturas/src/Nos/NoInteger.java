package Nos;

import InterfacesAtividade.INo;

public class NoInteger extends  No
{
    private Integer conteudo;

    public NoInteger(){
        setConteudo(null);
        setPeso(null);
        setProximo(null);
        setAnterior(null);
    }


    //Get e set
    public Integer getConteudo() {
        return conteudo;
    }

    public void setConteudo(Integer conteudo) {
        this.conteudo = conteudo;
    }

}
