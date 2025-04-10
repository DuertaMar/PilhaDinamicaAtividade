import Dinamicas.PilhaDinamicaInteger;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int escolha, auxiliar, auxiliar2;
        PilhaDinamicaInteger pilhaDinamicaInteger = new PilhaDinamicaInteger();
        do {
            System.out.println("Escolha o método a ser usado na Pilha Dinamica.\n0_Sair\n1_Ver lista\n2_Adicionar valor" +
                    "\n3_Remover valor\n4_....");
            escolha = perguntarInt();
            switch (escolha) {
                case 1:
                    pilhaDinamicaInteger.mostrarPilha();
                    break;
                case 2:

                    // Perguntar valor e peso. ( caso precise informar precisa de peso?
                    //pilhaDinamicaInteger.adicionarPhila();
                    break;
                case 3:
                    pilhaDinamicaInteger.removerPilha();
                    break;
                case 4:
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
