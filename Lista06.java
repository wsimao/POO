
import java.util.Scanner;
public class Lista06 {

    public static void main(String[] args) {

        String user;
        float inumero;
        float fatorial = 1;
        int i;

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual seu nome: ");
        user = scan.nextLine();

        System.out.println(user + ", digite um número: ");
        inumero = scan.nextFloat();
        System.out.println("");

        for(i=1;i<=inumero;i++) {
            fatorial *= i;
            System.out.println("Fatorial de "+i+ " é "+fatorial);
        }
    }
}