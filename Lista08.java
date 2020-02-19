

import java.util.Scanner;
public class Lista08 {

    public static void main(String[] args) {

        String user;
        float fnumero;
        int fibonacci = 0;
        int a = 1;
        int b = 0;
        int i;

        Scanner scan = new Scanner(System.in);
        System.out.println("Qual seu nome: ");
        user = scan.nextLine();

        System.out.println("Digite um número: ");
        fnumero = scan.nextFloat();

        for(i=3;i<=fnumero;i++) {
            fibonacci = a +b;
            b = a;
            a = fibonacci;
        }
        System.out.println("O numero "+fnumero+"  esino numero do Fibonnaci é: "+fibonacci);
    }
}
