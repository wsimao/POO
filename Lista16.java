import java.util.Scanner;

public class Lista16 {

    public static void main(String[] args) {

        String user;
        int num;

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual seu nome: ");
        user = scan.nextLine();

        System.out.println(user+ ", digite um número: ");
        num = scan.nextInt();

        for(int i = num;i>0;i--) {
            System.out.println(num--);
        }

    }
}
