import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero inteiro: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo numero inteiro: ");
        int b = sc.nextInt();

        int soma = a + b;
        int subtracao = a - b;
        int produto = a * b;
        int divisaoInteira = a / b;
        int resto = a % b;

        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Produto: " + produto);
        System.out.println("Divisao inteira: " + divisaoInteira);
        System.out.println("Resto da divisao: " + resto);
    }
}



