import Dinamicas.PilhaDinamicaInteger;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int escolha, sequencia;
        Integer auxiliar, auxiliar2,auxiliar3, auxiliar4;
        PilhaDinamicaInteger pilhaDinamicaInteger = new PilhaDinamicaInteger();
        PilhaDinamicaInteger aux = new PilhaDinamicaInteger();
        do {
            System.out.println("Escolha o método a ser usado na Pilha Dinamica.\n0_Sair  1_Ver lista  2_Adicionar valor" +
                    "\n3_Remover valor(modo Pilha)  4_Buscar valor  5_Editar valor\n6_Adicionar sequencia\n");
            escolha = perguntarInt();
            switch (escolha) {
                case 1:
                    pilhaDinamicaInteger.ordenarCrescente();
                    pilhaDinamicaInteger.ordenarDecrescente();
                    System.out.println("Quantidade de elementos na pilha: "+pilhaDinamicaInteger.quantidadeElementos());
                    pilhaDinamicaInteger.exibir();
                    break;
                case 2:
                    System.out.println("Escolha o valor que está querendo adicionar a lista: ");
                    auxiliar = perguntarInt();
                    auxiliar2 = perguntarPeso();
                    pilhaDinamicaInteger.inserirElemento(auxiliar,auxiliar2);
                    break;
                case 3:
                    pilhaDinamicaInteger.removerPilha();
                    break;
                case 4:
                    System.out.println("Escolha o valor que está procurando na lista: ");
                    auxiliar = perguntarInt();
                    auxiliar2 = perguntarPeso();
                    if (pilhaDinamicaInteger.buscarElemento(auxiliar,auxiliar2)){
                        System.out.println("Valor encontrado");
                    } else {
                        System.out.println("Valor não existe na lista");
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

                    //estou fazendo ela receber a mesma estrutura mas não sei se é por causa disso que está dando está mensagem aqui..
                    // talvez não possa ser a mesma estrutura? dps preciso que verifique se está correto.
                    // mensagem é esta
                    //WARNING: A restricted method in java.lang.System has been called
                    //WARNING: java.lang.System::load has been called by com.intellij.rt.execution.application.AppMainV2 in an unnamed module (file:/C:/Program%20Files/JetBrains/IntelliJ%20IDEA%20Community%20Edition%202024.1.1/lib/idea_rt.jar)
                    //WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
                    //WARNING: Restricted methods will be blocked in a future release unless native access is enabled
                    System.out.println("Iniciando a lista auxiliar.\n Inclua o valor.");
                    auxiliar = perguntarInt();
                    auxiliar2 = perguntarPeso();
                    aux.inserirElemento(auxiliar,auxiliar2);

                    do {
                        System.out.println("Gostaria de adicionar mais elementos? \n0_Não\n1_Sim");
                        sequencia = perguntarInt();
                        if (sequencia==1){
                            System.out.println("Escolha o valor que está querendo adicionar a lista auxiliar: ");
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

                    System.out.println("Lista auxiliar inserida na lista principal!");
                    pilhaDinamicaInteger.inserirSequencia(aux);
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
 }
