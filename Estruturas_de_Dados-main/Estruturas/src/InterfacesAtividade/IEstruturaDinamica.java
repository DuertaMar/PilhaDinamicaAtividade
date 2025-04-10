package InterfacesAtividade;

import Dinamicas.PilhaDinamicaInteger;
import Nos.No;

public interface IEstruturaDinamica {

    void inserirElemento(Integer conteudo,Integer peso);
    void inserirSequencia(PilhaDinamicaInteger pilhaDinamicaInteger2);
    boolean removerElemento(Object elemento);
    void removerSequencia(Object elementos);
    void removerTodasOcorrencias(Object elemento);
    boolean estaCheia();
    boolean estaVazia();
    boolean buscarElemento(Integer elemento, Integer peso);
    void ordenarCrescente();
    void ordenarDecrescente();
    int quantidadeElementos();
    void editarElemento(Integer conteudoAntigo, Integer pesoAntigo,Integer conteudoNovo, Integer pesoNovo);
    void limpar();
    void exibir();
    No obterPrimeiroElemento();
    No obterUltimoElemento();
}
