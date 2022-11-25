//Operador Logico && e ||

// Prgroma para saber se o número é par ou ímpar;

import java.util.Scanner;
public class Aula20 {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        int numero;

        System.out.printf("Digite um número: \n");
        numero = texto.nextInt();

        if((numero % 2 == 0) && (numero < 20)){
            System.out.printf("O número %d é par e maior que 10", numero);
        }
    }
}

// % = Analisa se a divisão tem resto

// != Esse operador significa diferente. (No exemplo do programa, toda vez que o meu termo dentro do if for diferentede
// de 0, quer dizer que o número é ímpar)

// Operador &&. O bloco de comando so vai rodar se as expressões forem todas verdadeiras

// Operador ||. O bloco de de comando vai rodar se uma das expressões forem verdadeiras


