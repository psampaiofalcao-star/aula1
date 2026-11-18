import java.util.Scanner;

public class exercicicio6 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);{
            System.out.print("Digite o raio do circulo: ");
            double raio = sc.nextDouble();

            double area = Math.PI * raio * raio;
            double perimetro = 2 * Math.PI * raio;

            System.out.printf("Area: %.2f%n", area);
            System.out.printf("Perimetro: %.2f%n", perimetro);
        }

        }
        }


