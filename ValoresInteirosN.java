import java.util.Scanner;

public class ValoresInteirosN {
    public static void main(String[] args) {
        // e quantos
        // estão fora do intervalo, mostrando
        // essas informações conforme exemplo (use a palavra "in" para dentro do
        // intervalo, e "out" para fora do intervalo).
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor");
        int in = 0;
        int out = 0;
        int valor = sc.nextInt();
        for (int i = 0; i <= valor; i++) {
            System.out.println("Digite um número:");
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in = in + 1;
            } else if (x < 10 || x > 20) {
                out = out + 1;

            }

        }

        System.out.println(in + "-IN");
        System.out.println(out + "-OUT");
        sc.close();
    }
}
