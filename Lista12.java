
import java.util.Scanner;
public class Lista12 {

    public static void main(String[] args) {

        String user;
        int[] inumero = new int[10];
        int[] imedia = new int[1];
        int soma = 0;
        int cont = 0;
        int j = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual seu nome: ");
        user = scan.nextLine();

        System.out.println("Digite dez números inteiros: ");
        for (int i = 0; i <= 9; i++) {
            inumero[i] = scan.nextInt();
            cont++;
            soma = inumero[i] + soma;
            imedia[j] = soma/cont;
        }
            System.out.println("");
            System.out.println("A média dos valores digitados é igual à: " + imedia[j]);

        }
    }


