
import java.util.Scanner;
public class Lista02 {

    public static void main(String[] args) {

        String user;
        float fgasolina;
        float fetanol;
        float fresultado;

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual seu nome: ");
        user = scan.nextLine();

        System.out.println(user+ ", qual o preço da Gasolina? ");
        fgasolina = scan.nextFloat();
        System.out.println("O preço da Gasolina está R$" +fgasolina+ "\n\n");

        System.out.println(user+ ", qual o preço do Etanol? ");
        fetanol = scan.nextFloat();
        System.out.println("O preço do Etanol está R$" +fetanol+ "\n\n");

        fresultado = fetanol/fgasolina;

        if(fresultado <=0.7) {
            System.out.println(user+", abasteça com Etanol, no momento está sendo o melhor abastecimento.");
        }
        else{
            System.out.println(user+", abasteça com Gasolina, no momento está sendo o melhor abastecimento.");
        }

    }


}
