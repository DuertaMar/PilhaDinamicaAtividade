import Dinamicas.PilhaDinamicaInteger;

public class main2 {
    public static void main(String[] args) {
        PilhaDinamicaInteger pilhaDinamicaInteger= new PilhaDinamicaInteger();
        PilhaDinamicaInteger pilhaDinamicaInteger3= new PilhaDinamicaInteger();

        pilhaDinamicaInteger.inserirElemento(10,0);
        pilhaDinamicaInteger.inserirElemento(20,0);
        pilhaDinamicaInteger.inserirElemento(30,1);
        pilhaDinamicaInteger.exibir();
        pilhaDinamicaInteger.ordenarCrescente();
        pilhaDinamicaInteger.ordenarDecrescente();
        System.out.println("Quantidade de elementos na pilha: "+pilhaDinamicaInteger.quantidadeElementos());
        pilhaDinamicaInteger.exibir();
        System.out.println(pilhaDinamicaInteger.buscarElemento(30,1));

        pilhaDinamicaInteger.editarElemento(30,1,15,0);
        pilhaDinamicaInteger.exibir();

    }

    /*
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
     */
}
