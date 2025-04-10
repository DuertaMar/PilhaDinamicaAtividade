import Dinamicas.PilhaDinamicaInteger;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int escolha, auxiliar, auxiliar2;
        PilhaDinamicaInteger pilhaDinamicaInteger = new PilhaDinamicaInteger();
        PilhaDinamicaInteger aux = new PilhaDinamicaInteger();
        do {
            System.out.println("Escolha o método a ser usado na Pilha Dinamica.\n0_Sair\n1_Ver lista\n2_Adicionar valor" +
                    "\n3_Remover valor(modo Pilha)\n4_Buscar valor\n5_Editar valor\n6_Adicionar sequencia");
            escolha = perguntarInt();
            switch (escolha) {
                case 1:
                    pilhaDinamicaInteger.exibir();
                    break;
                case 2:
                    // Perguntar valor e peso. ( caso precise informar precisa de peso?
                    //pilhaDinamicaInteger.adicionarPhila();
                    break;
                case 3:
                    pilhaDinamicaInteger.removerPilha();
                    break;
                case 4:
                    //Depois tem que fazer de forma bonita if else e pedir o valor e perguntar se precisa do peso
                    // provavelmente da para fazer um método estático
                    System.out.println(pilhaDinamicaInteger.buscarElemento(perguntarInt(),perguntarInt()));
                break;
                case 5:
                    //mesma situação do de cimda...... (vagabundagem minha ta forte kk
                    pilhaDinamicaInteger.editarElemento(perguntarInt(),perguntarInt(),perguntarInt(),perguntarInt());
                    break;
                case 6:
                    //estou fazendo ela receber a mesma estrutura mas não sei se é por causa disso que está dando está mensagem aqui..
                    // talvez não possa ser a mesma estrutura? dps preciso que verifique se está correto.

                    //WARNING: A restricted method in java.lang.System has been called
                    //WARNING: java.lang.System::load has been called by com.intellij.rt.execution.application.AppMainV2 in an unnamed module (file:/C:/Program%20Files/JetBrains/IntelliJ%20IDEA%20Community%20Edition%202024.1.1/lib/idea_rt.jar)
                    //WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
                    //WARNING: Restricted methods will be blocked in a future release unless native access is enabled

                    // Aqui tem que fazer a pilha aux adicionar mais valores igual aqui (ou editar ou remover), e com isso
                    // fazer ela ser reccebida pelo método auxiliar que a coloca na pilha.
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
}
