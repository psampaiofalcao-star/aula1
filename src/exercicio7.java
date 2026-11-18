import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            System.out.print("Digite a base do retangulo: ");
            double base = sc.nextDouble();

            System.out.print("Digite a altura do retangulo: ");
            double altura = sc.nextDouble();

            double area = base * altura;
            double perimetro = 2 * (base + altura);
            double diagonal = Math.sqrt(base * base + altura * altura);

            System.out.printf("Area: %.2f%n", area);
            System.out.printf("Perimetro: %.2f%n", perimetro);
            System.out.printf("Diagonal: %.2f%n", diagonal);
        }

    }

}