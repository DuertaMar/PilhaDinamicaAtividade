import Simples.FilaSimples;
import Simples.ListaSimples;
import Simples.PilhaSimples;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int tipoEstrutura, estrutura,metodo,funcoes,funcoes2;
        ListaSimples listaSimples = new ListaSimples(10);
        FilaSimples filaSimples= new FilaSimples(10);
        PilhaSimples pilhaSimples= new PilhaSimples(10);
        do {
            do {
                System.out.println("Simples ou Dinamica");
                System.out.println("0=Sair  1=Simples  2=Dinamica");
                tipoEstrutura = perguntarInt();
            } while (tipoEstrutura<0||tipoEstrutura>2);

            if (tipoEstrutura == 1) {
                estrutura = escolherEstrutura();
                if (estrutura==1){
                    //Lista Simples
                    do {
                        do {
                            metodosListaSimples();
                            metodo = perguntarInt();
                        } while (metodo < 0 || metodo > 5);
                        if (metodo==1){
                            listaSimples.mostrarLista();
                        }
                        if (metodo==2){
                            listaSimples.adicionarLista(perguntarInt());
                        }
                        if (metodo==3){
                            listaSimples.removerPorIndice((perguntarInt()-1));
                        }
                        if (metodo==4){
                            funcoes = perguntarInt();
                            funcoes = funcoes-1;
                            if (listaSimples.checarIntervalo(funcoes)){
                                if (listaSimples.checarIndice(funcoes)){
                                    System.out.println("Indice null");
                                } else {
                                    System.out.println("Há coisas neste indice ["+(funcoes+1)+"]");
                                }
                            } else {
                                System.out.println("Indice incorreto");
                            }

                        }
                        if (metodo==5){
                            funcoes= perguntarInt();
                            funcoes=funcoes-1;
                            listaSimples.checarIntervalo(funcoes);
                        }
                    } while (metodo!=0);

                }
                //Fila e Pilha tem como padronizar, mas Lista não.
                if (estrutura==2){
                    //Fila Simples
                    metodosFilaSimples();
                }
                if (estrutura==3){
                    //Pilha Simples
                    metodosPilhaSimples();
                }
            }
            if (tipoEstrutura == 2){
                estrutura = escolherEstrutura();
                if (estrutura==1){}
                if (estrutura==2){}
                if (estrutura==3){}
            }
        } while (tipoEstrutura!= 0);
        System.out.println("Obrigado por usar.");
    }


    public static int escolherEstrutura(){
        int estrutura;
        do {
            System.out.println("Escolha a estrutura\n0=Sair  1=Lista  2=Fila  3=Pilha");
            estrutura = perguntarInt();
        } while (estrutura<0||estrutura>3);

        return estrutura;
    }

    public static void metodosPilhaSimples(){
        System.out.println("Métodos da Pilha Simples\n0=Sair  1=Mostrar Pilha  2=Adicionar Conteudo\n" +
                "3=Remover Conteudo  4=Checar Indice  5=Ultimo elemento");
    }

    public static void metodosListaSimples(){
        System.out.println("Métodos da Lista Simples\n0=Sair  1=Mostrar Lista  2=Adicionar Conteudo\n" +
                "3=Remover Conteudo(Por Indice)  4=Checar Indice   5=Checar Intervalo");
        // Falta um método de ver o tamanho da lista e aumentar ou diminuir o tamanho.
        // além de retirar os outros métodos a mais
    }

    public static void metodosFilaSimples(){
        System.out.println("Métodos da Fila Simples\n0=Sair  1=Mostrar Fila  2=Adicionar Conteudo\n" +
                "3=Remover Conteudo  4=Checar Indice  5=Cheia?");
    }



    public static int perguntarInt (){
        Scanner scanner = new Scanner(System.in);
        int perguntar;
        perguntar = scanner.nextInt();
        return perguntar;
    }
}
