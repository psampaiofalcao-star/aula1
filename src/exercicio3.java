import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor em reais: ");
        double valorReais = sc.nextDouble();

        System.out.print("Digite a cotacao do dolar: ");
        double cotacaoDolar = sc.nextDouble();

        double valorConvertido = valorReais / cotacaoDolar;

        System.out.printf("Valor convertido:: US$ %.2f%n", valorConvertido);


    }
}
