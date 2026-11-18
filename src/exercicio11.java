import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            System.out.print("Digite o primeiro numero: ");
            int a = sc.nextInt();

            System.out.print("Digite o segundo numero: ");
            int b = sc.nextInt();

            System.out.print("Digite o terceiro numero: ");
            int c = sc.nextInt();

            int maior;
            if (a > b && a > c) {
                maior = a;
            } else if (b > a && b > c) {
                maior = b;
            } else {
                maior = c;
            }

            System.out.println("O maior numero e: " + maior);
        }
    }
}

