import java.util.Scanner;

public class HoraInicialHoraFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a hora início do jogo");
        int inicioJogo = sc.nextInt();
        System.out.println("Digite a hora final do jogo");
        int finalJogo = sc.nextInt();
        int duracaoJogo = inicioJogo - finalJogo;
        if (inicioJogo < finalJogo) {
            System.out.println("A duração mínima é de 1" + "Hora(s)");
        } else {
            duracaoJogo = 24 - inicioJogo + finalJogo;
            System.out.println("O jogo durou: " + duracaoJogo + "Hora(s)");
        }

        sc.close();
    }

}
// a lógica é simples mas me deixou confuso.