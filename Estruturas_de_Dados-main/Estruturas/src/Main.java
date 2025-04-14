import Dinamicas.PilhaDinamicaInteger;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int escolha, sequencia;
        Integer auxiliar, auxiliar2,auxiliar3, auxiliar4;
        PilhaDinamicaInteger pilhaDinamicaInteger = new PilhaDinamicaInteger();
        PilhaDinamicaInteger aux = new PilhaDinamicaInteger();
        do {
            System.out.println("Escolha o método a ser usado na Pilha Dinamica.\n0 - Sair   1 - Ver lista   2 - Adicionar valor" +
                    "\n3 - Remover valor(modo Pilha)    4 - Buscar valor    5 - Editar valor\n6 - Adicionar sequencia   7 - Ver lista (Crescente)   " +
                    "8 - Ver lista (Decrescente)  \n9 - Quantidade de elementos na lista    " +
                    "10 - Remover Elemento      11 - Remover Todas as Ocorrências\n12 - Remover Sequência       13 - Limpar" +
                    "\n14 - Ultimo elemento da pilha    15 - Exibir conteudo");
            escolha = perguntarInt();
            switch (escolha) {
                case 1:
                    pilhaDinamicaInteger.exibir();
                    break;
                case 2:
                    System.out.println("Escolha o valor que está querendo adicionar a phila: ");
                    auxiliar = perguntarInt();
                    auxiliar2 = perguntarPeso();
                    pilhaDinamicaInteger.inserirElemento(auxiliar,auxiliar2);
                    break;
                case 3:
                    pilhaDinamicaInteger.removerPilha();
                    break;
                case 4:
                    System.out.println("Escolha o valor que está procurando na pilha: ");
                    auxiliar = perguntarInt();
                    auxiliar2 = perguntarPeso();
                    if (pilhaDinamicaInteger.buscarElemento(auxiliar,auxiliar2)){
                        System.out.println("Valor encontrado");
                    } else {
                        System.out.println("Valor não existe na phila");
                    }
                break;
                case 5:
                    System.out.println("Escolha o valor que precisa editar ");
                    auxiliar = perguntarInt();
                    auxiliar2 = perguntarPeso();
                    System.out.println("Escolha agora o valor e o peso para atualizar");
                    auxiliar3 = perguntarInt();
                    auxiliar4 = perguntarPeso();
                    pilhaDinamicaInteger.editarElemento(auxiliar,auxiliar2,auxiliar3,auxiliar4);
                    break;
                case 6:
                    System.out.println("Iniciando a Pilha auxiliar.\n Inclua o valor.");
                    auxiliar = perguntarInt();
                    auxiliar2 = perguntarPeso();
                    aux.inserirElemento(auxiliar,auxiliar2);

                    do {
                        System.out.println("Gostaria de adicionar mais elementos? \n0_Não\n1_Sim");
                        sequencia = perguntarInt();
                        if (sequencia==1){
                            System.out.println("Escolha o valor que está querendo adicionar a phila auxiliar: ");
                            auxiliar = perguntarInt();
                            auxiliar2 = perguntarPeso();
                            aux.inserirElemento(auxiliar,auxiliar2);
                        }
                        aux.exibir();
                    } while (sequencia!=0);

                    do {
                        System.out.println("Gostaria de remover elementos? Considerando a ordem lógica da pilha. \n0_Não\n1_Sim");
                        sequencia = perguntarInt();
                        if (sequencia==1){
                            aux.removerPilha();
                        }
                        aux.exibir();
                    } while (sequencia!=0);

                    System.out.println("Pilha auxiliar inserida na phila principal!");
                    pilhaDinamicaInteger.inserirSequencia(aux);
                    break;
                case 7:
                    pilhaDinamicaInteger.ordenarCrescente();
                    break;
                case 8:
                    pilhaDinamicaInteger.ordenarDecrescente();
                    break;
                case 9:
                    System.out.println("Quantidade de elementos na pilha: "+pilhaDinamicaInteger.quantidadeElementos());
                    break;
                case 10:
                    System.out.println("Digite o valor que deseja remover:");
                    auxiliar = perguntarInt();
                    pilhaDinamicaInteger.removerElemento(auxiliar);
                    System.out.println("Elemento "+auxiliar+" removido.");
                    break;
                case 11:
                    System.out.println("Digite o valor a ser removido todas as ocorrências:");
                    auxiliar = perguntarInt();
                    pilhaDinamicaInteger.removerTodasOcorrencias(auxiliar);
                    break;
                case 12:
                    pilhaDinamicaInteger.removerSequencia(coletarSequenciaRemocao());
                    break;
                case 13:
                    pilhaDinamicaInteger.limpar();
                    System.out.println("A pilha foi esvaziada.");
                    break;
                case 14:
                    pilhaDinamicaInteger.ultimoElemento();
                    break;
                case 15:
                    pilhaDinamicaInteger.exibirConteudo();
                    break;
            }

        } while (escolha!=0);
        System.out.println("Obrigado por usar.");
    }



    public static int perguntarInt (){
        Scanner scanner = new Scanner(System.in);
        int perguntar;
        perguntar = scanner.nextInt();
        return perguntar;
    }
    public  static  int perguntarPeso (){
        int peso;
        do {
            System.out.println("O valor precisa de peso?\nSe sim '1' Se não '0'");
            peso= perguntarInt();
        } while (peso!=0&&peso!=1);
        return peso;
    }


//os comentários referem-se a mudanças necessárias para o uso da estrutura de pilha na criação da lista com elementos
//private static PilhaDinamicaInteger coletarSequenciaRemocao()
    private static List<Integer> coletarSequenciaRemocao() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> sequenciaRemocao = new ArrayList<>();
        //PilhaDinamicaInteger sequenciaRemocao = new PilhaDinamicaInteger();
        int valor, escolha;
        do {
            do  {
                System.out.println("Digite 1 para adicionar um valor na sequência ou 0 para finalizar: ");
                escolha = scanner.nextInt();
            } while((escolha != 1 && escolha != 0));
            if (escolha == 0)
                break;
            System.out.println("Digite o valor a ser removido:");
            valor = scanner.nextInt();
            sequenciaRemocao.add(valor);
            //sequenciaRemocao.inserirElemento(valor, 0);
        } while (escolha != 0);
        return sequenciaRemocao;
    }
 }
