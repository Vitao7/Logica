//Saber se o ano é bissexto ou não
import java.util.Scanner;

public class Aula21 {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        int ano;

        System.out.printf("Digite o ano: \n");
        ano = texto.nextInt();

        if((ano % 400 == 0) || (ano % 4 == 0 && ano % 100!= 0));
        {
            System.out.printf("O ano %d é bissexto!");
        }

    }
}
