import Dinamicas.PilhaDinamicaInteger;

import java.util.Arrays;
import java.util.List;

public class MainMetodosRemocao {
    public static void main(String[] args) {
        PilhaDinamicaInteger pilha = new PilhaDinamicaInteger();
        pilha.inserirElemento(4, 0);
        pilha.inserirElemento(5, 0);
        pilha.inserirElemento(8, 0);
        pilha.inserirElemento(9, 0);
        pilha.inserirElemento(5, 0);
        pilha.inserirElemento(11, 0);
        pilha.inserirElemento(6, 0);
        pilha.inserirElemento(5, 0);
        pilha.inserirElemento(19, 0);
        pilha.inserirElemento(56, 0);
        pilha.inserirElemento(5, 0);
        pilha.exibir();

        //pilha.limpar();

        //pilha.removerElemento(5);

        //pilha.removerTodasOcorrencias(5);

//        PilhaDinamicaInteger pilha2 = new PilhaDinamicaInteger();
//        pilha2.inserirElemento(17, 0);
//        pilha2.inserirElemento(22, 0);
//        pilha2.inserirElemento(28, 0);
//        pilha.inserirSequencia(pilha2);

        List<Integer> elementosLista = Arrays.asList(4, 5, 9);
        pilha.removerSequencia(elementosLista);

        pilha.exibir();
    }
}
