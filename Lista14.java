
import java.util.Scanner;
public class Lista14 {

    public static void main(String[] args) {

        String user;
        int inumero = 0;
        int cont = 0;
        int imedia = 0;
        int isoma = 0;
        int maior = 0;
        int menor = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual seu nome: ");
        user = scan.nextLine();

        while (inumero != -1) {
            System.out.println(user+ ", digite um número: ");
            inumero = scan.nextInt();
            cont++;
            isoma = isoma + inumero;
            imedia = isoma/cont;
            if(inumero > maior) {
                maior = inumero;
            }
            if(inumero < menor) {
                menor = inumero;
            }
        }
        System.out.println("Quantidade de números digitados: "+cont);
        System.out.println("O maior número digitado: "+maior);
        System.out.println("O menor número digitado: "+menor);
        System.out.println("A média dos números digitados: "+imedia);
    }
}

