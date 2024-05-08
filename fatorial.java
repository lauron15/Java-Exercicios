import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int valorN = sc.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= valorN; i++) {
            fatorial = fatorial * i;
            System.out.println(fatorial);
        }

        sc.close();
    }
}
// não peguei muito bem essa lógica.