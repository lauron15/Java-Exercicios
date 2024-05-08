public class operadorNot {
    public static void main(String[] args) {
        int numero = 5;
        if (numero >= 5) {
            System.out.println("Teste");
        } else {
            System.out.println("Sim");
        }
    }
}
// com o ! eu vou modificar a ideia geral, colocando um não na frente. Ex,
// entraria na condição se numero >=5, mas com a expressão !(numero>=5),
// entraremos caso o número não atenda a condição de ser maior ou igual a 5.
// ou seja, o else será impresso.