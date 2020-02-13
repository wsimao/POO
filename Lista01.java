
import java.util.Scanner;

public class Lista01 {

    public static void main(String[] args) {

        String user;
        float fnumero;
        int i;
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual seu nome? ");
        user = scan.nextLine();

        System.out.println("Olá, " + user + "! Seja bem vindo.");

        for ( i= 0; i<=2; i++) {
            System.out.println("Digite um número: ");
           fnumero = scan.nextFloat();

            if (fnumero % 2 == 0) {
                System.out.println("O número " + fnumero + " É par.");
            } else {
                System.out.println("O número " + fnumero + " É ímpar");
            }
        }
    }
}
