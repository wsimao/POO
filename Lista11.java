
import java.util.Scanner;
public class Lista11 {

    public static void main(String[] args) {

        String user;
        int[] vetornum = new int[20];
        int maior = 0;
        int menor = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Qual seu nome: ");
        user = scan.nextLine();

        System.out.println("Digite dez números: ");
        for (int i = 0; i <= 9; i++) {
            vetornum[i]= scan.nextInt();

            if (vetornum[i] > maior) {
                maior = vetornum[i];
            }
        }
        for (int j = 0; j <= 9; j++) {
            if (vetornum[j] < menor) {
                menor = vetornum[j];
            }
        }
            System.out.println("O maior número é: " + maior);
            System.out.println("O menor número é: " + menor);
        }
    }




