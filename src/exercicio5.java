import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite o valor da hora trabalhada: ");
        double valorHora = sc.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas no mes: ");
        double horas = sc.nextDouble();

        double salarioBruto = valorHora * horas;
        double descontoInss = salarioBruto * 0.08;
        double salarioLiquido = salarioBruto - descontoInss;

        System.out.printf("Salario bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Desconto INSS (8%%): R$ %.2f%n", descontoInss);
        System.out.printf("Salario liquido: R$ %.2f%n", salarioLiquido);




    }

}


