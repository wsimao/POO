

import java.util.Scanner;
public class Lista03 {

    public static void main(String[] args) {

        String user;
        int inumero = 0;
        int iresultado;
        int i;
        int imaior = 0;
        int imenor = 0;


        Scanner scan = new Scanner(System.in);

        System.out.println("Qual seu nome: ");
        user = scan.nextLine();

        for (i = 0; i <= 6; i++) {
            System.out.println(user + ", digite sete números inteiros: ");
            inumero = scan.nextInt();

            if (i == 0) {

                imaior = inumero;
                imenor = inumero;
            }

            if (inumero > imaior) {
                imaior = inumero;
            }

            if (inumero < imenor) {
                imenor = inumero;
            }
        }

            System.out.println("O " + imaior + " é o maior número");
            System.out.println("O " + imenor + " é o menor número");

    }
}