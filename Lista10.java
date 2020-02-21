
import java.util.Scanner;
public class Lista10 {

    public static void main(String[] args) {

        String user;
        int fnumero;
        int i;
        int[] vetorpar = new int[10];
        int[] vetorimpar = new int[10];


        Scanner scan = new Scanner(System.in);

        System.out.println("Qual seu nome: ");
        user = scan.nextLine();

        System.out.println("Digite dez números: ");

        for (i = 0; i <= 9; i++) {
            fnumero = scan.nextInt();

            if (fnumero % 2 == 0) {
                vetorpar[i] = fnumero;
            } else {
                vetorimpar[i] = fnumero;
            }
        }
        for (i = 0; i <= 9; i++) {
            System.out.println("O número " + vetorpar[i] + " é par.");
            System.out.println("O número " + vetorimpar[i] + " é ímpar.");
            }
        }
    }
