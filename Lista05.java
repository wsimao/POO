
import java.util.Scanner;
public class Lista05 {

    public static void main(String[] args) {

        String atleta;
        float idade;
        String categoria;

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual nome completo do atleta: ");
        atleta = scan.nextLine();

        System.out.println("Qual a sua idade: ");
        idade = scan.nextFloat();

        if (idade >= 5 && idade <= 7) {
            System.out.println(atleta + ", você está classificado para categoria Infantil A.");
        }
        if (idade >= 8 && idade <= 11) {
            System.out.println(atleta + ", você está classificado para categoria Infantil B.");
        }
        if (idade >= 12 && idade <=15) {
            System.out.println(atleta + ", você está classififcado para categoria Juvenil A.");
        }
        if (idade >= 15 && idade <= 17) {
            System.out.println(atleta + ", você está classificado para categoria Juvenil B.");
        }
        if (idade >= 18) {
            System.out.println(atleta + ", você está classificado para categoria Adulto.");
        }
        if(idade<=4) {
            System.out.println(atleta + ", infelizmente você ainda não tem idade para classificar em nossas categorias.");
        }
    }
}
