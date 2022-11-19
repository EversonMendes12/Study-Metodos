import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int escolha, numP, numS;

        System.out.println("Digite o número correspondente a operação: " +
                "\n 1 - Adição " +
                "\n 2 - Subtração " +
                "\n 3 - Divisão " +
                "\n 4 - Multiplicação");
        escolha = scan.nextInt();

        System.out.println("Digite o número primario: ");
        numP = scan.nextInt();
        System.out.println("Digite o número secundario: ");
        numS = scan.nextInt();

        if (escolha == 1){
            adicao(numP, numS);
        } else if (escolha == 2){
            subtracao(numP, numS);
        } else if (escolha == 3){
            divisao(numP, numS);
        } else if (escolha == 4){
            multiplicacao(numP, numS);
        }

    }

    public static void adicao(int p, int s){

        int total = p + s;

        System.out.println("|||| Total: " + total + " ||||\nDeseja continuar?" +
                "\n0 - Não" +
                "\n1 - Sim");
    }
    public static void subtracao(int p, int s){

        int total = p - s;

        System.out.println("|||| Total: " + total + " ||||\nDeseja continuar?" +
                "\n0 - Não" +
                "\n1 - Sim");
    }
    public static void divisao(int p, int s){

        int total = p / s;

        System.out.println("|||| Total: " + total + " ||||\nDeseja continuar?" +
                "\n0 - Não" +
                "\n1 - Sim");
    }
    public static void multiplicacao(int p, int s){

        int total = p * s;

        System.out.println("|||| Total: " + total + " ||||\nDeseja continuar?" +
                "\n0 - Não" +
                "\n1 - Sim");
    }




}