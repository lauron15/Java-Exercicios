import java.util.Scanner;

public class LojinhaLanches {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int atendimentos = 0; atendimentos < 100; atendimentos++) {

            System.out.println("Olá, Seja bem Vindo. Meu nome é Lauro, e eu vou te atender!");
            System.out.println("Segue abaixo o nosso cardápio:");
            System.out.println(
                    "Para cachoro quente, tecle 1. Para XSalada tecle 2. Para X Bacon Tecle 3, Para Torrada Tecle 4. Para Refrigerante Tecle 5");
            System.out.println("Insira o código do item");
            int codigoItem = scan.nextInt();
            if (codigoItem > 5 || codigoItem < 0) {
                System.out.println("Não possuimos itens com esse código");
                break;
            }
            System.out.println("Insira a quantidade");
            int QTDitem = scan.nextInt();
            if (QTDitem >= 20) {
                System.out.println("A quantidade máxima por pessoa é de: 15");
                break; // esse break eu não conhecia, ele vai pausar o código se ele cumprir um
                       // condição, eu estava buscando isso há tempos.
            }

            double total;

            if (codigoItem == 1) {
                System.out.println("Você escolheu Cachorro Quente");
                total = QTDitem * 4.0;
                System.out.printf("Total a pagar: R$ %.2f%n", total);
                System.out.println("Obrigado!");
            } else if (codigoItem == 2) {
                System.out.println("Você escolheu X-Salada");
                total = QTDitem * 4.5;
                System.out.printf("Total a pagar: R$ %.2f%n", total);
            } else if (codigoItem == 3) {
                System.out.println("Você escolheu X-Bacon");
                total = QTDitem * 5.0;
                System.out.printf("Total a pagar: R$ %.2f%n", total);
            } else if (codigoItem == 4) {
                System.out.println("Você escolheu Torrada");
                total = QTDitem * 2.0;
                System.out.printf("Total a pagar: R$ %.2f%n", total);
            } else if (codigoItem == 5) {
                System.out.println("Você escolheu Refrigerante");
                total = QTDitem * 1.5;
                System.out.printf("Total a pagar: R$ %.2f%n", total);
            }
            System.out.println("Próximo da fila!");

        }
        scan.close();
    }
}

// coloquei o for, com o intuito de simular uma
// Lanchonete da qual o Garçon tenha que
// atender a meta de 100 pessoas.
// importante, o while é bem parecido com o if,
// e a diferença com o for, é que o while não
// tem uma contagem absoluta, ou seja, não sabe
// quantas repetições são necessárias. Já no
// for, pré definimos a quantidade