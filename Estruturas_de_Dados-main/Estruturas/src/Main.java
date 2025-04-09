import Dinamicas.PhilaDinamicaInteger;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int escolha, auxiliar, auxiliar2;
        PhilaDinamicaInteger philaDinamicaInteger = new PhilaDinamicaInteger();
        do {
            System.out.println("Escolha o método a ser usado na Pilha Dinamica.\n0_Sair\n1_Ver lista\n2_Adicionar valor" +
                    "\n3_Remover valor\n4_....");
            escolha = perguntarInt();
            switch (escolha) {
                case 1:
                    philaDinamicaInteger.mostrarPhila();
                    break;
                case 2:

                    // Perguntar valor e peso. ( caso precise informar precisa de peso?
                    //philaDinamicaInteger.adicionarPhila();
                    break;
                case 3:
                    philaDinamicaInteger.removerPhila();
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
