import java.util.Scanner;

public class PesquisaPostoGasolina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor de 1 a 4");
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int tipo = sc.nextInt();

        while (tipo != 4) {

            if (tipo == 1) {
                alcool = alcool + 1;
            } else if (tipo == 2) {
                gasolina = gasolina + 1;
            } else if (tipo == 3) {
                diesel = diesel + 1;
            } else {
                System.out.println("Valores inválidos");
            }

            tipo = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
