
import java.util.Scanner;
public class Lista07 {

    public static void main(String[] args) {

        String user;
        float fnumero;
        int i = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual seu nome: ");
        user = scan.nextLine();

        for (fnumero = 1; fnumero<=100; fnumero++) {
            System.out.println(fnumero + "");
            if (fnumero % 7 == 0) {
                System.out.print(user + ", o número " + fnumero + " é Múltiplo de 7");
                System.out.println("");
            }
        }
    }
}
