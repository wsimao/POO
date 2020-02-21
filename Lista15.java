
import java.util.Scanner;
public class Lista15 {

    public static void main(String[] args) {

        String name;
        int slfixo;
        int sltotal;
        int vendas;
        int comissao01;
        int comissao02;

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual seu nome: ");
        name = scan.nextLine();

        System.out.println(name + ", qual seu salário fixo? ");
        slfixo = scan.nextInt();

        System.out.println(name + ", quantas vendas você realizou este mês? ");
        vendas = scan.nextInt();

        comissao01 = (vendas * 3)/100;
        sltotal = comissao01 + slfixo;

        if (comissao01 >= 1500) {

            comissao02 = comissao01 + (vendas * 5) / 100;
            sltotal = comissao02 + slfixo;
            System.out.println("Salário total neste mês: " + sltotal);
            System.out.println("Valor da comissão sobre vendas: " + comissao02);
        } else {
            System.out.println("Salário total neste mês: " + sltotal);
            System.out.println("Valor da comissão sobre vendas: " + comissao01);


        }
    }
}
