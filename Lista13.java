import java.util.Scanner;
public class Lista13 {

    public static void main(String[] args) {



        String user;
        int inumero[] = new int[10];

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual seu nome: ");
        user = scan.nextLine();

        System.out.println("Digite dez números inteiros: ");
        for (int i = 0; i <inumero.length; i++) {
            inumero[i] = scan.nextInt();
        }

        for (int i=0;i<inumero.length;i++) {
            System.out.println("Número original: "+inumero[i]);
        }
        System.out.println("");
        System.out.println("");

        for (int i=9;i>=0;i--) {
            System.out.println("Número invertido: " +inumero[i]);
        }
    }
}