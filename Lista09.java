
import java.util.Scanner;
public class Lista09 {

    public static void main(String[] args) {

        String user;
        float fnumero1 = 0;
        float fnumero2 = 0;
        int i;
        float fsoma = 0;
        float fresultado = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual seu nome: ");
        user = scan.nextLine();


            System.out.println("Digite um número inteiro: ");
            fnumero1 = scan.nextFloat();

            System.out.println("Digite mais um número inteiro: ");
            fnumero2 = scan.nextFloat();

            fsoma = fsoma + fnumero1 + fnumero2;
            fresultado = (fnumero1 + fnumero2) * fnumero1;

        System.out.println("A soma dos números é: "+fsoma);
        System.out.println("Multiplicando a soma pelo número "+fnumero1+ " o resultado é: "+fresultado);
    }
}