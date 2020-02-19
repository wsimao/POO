
import java.util.Scanner;
public class Lista04 {

    public static void main(String[] args) {

        String user;
        int inumero;
        int isoma = 0;
        int imedia = 0;
        int cont = 0;
        int i;

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual seu nome: ");
        user = scan.nextLine();

        for (i = 0; i <= 4; i++) {
            System.out.println(user + ", digite cinco números inteiros:");
            inumero = scan.nextInt();
            cont++;
            isoma=inumero+isoma;
            imedia=isoma/cont;
        }
            System.out.println("Você digitou "+cont+" números.");
            System.out.println(isoma+" é a soma de todos números digitados.");
            System.out.println(imedia+ " é a média dos números digitados.");

        }
    }