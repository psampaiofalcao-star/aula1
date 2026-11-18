import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // garante que o ponto seja usado como separador decimal

        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite a altura (em metros): ");
        double altura = sc.nextDouble();

        System.out.println(nome + " tem " + idade + " anos e " + altura + " metros de altura.");

        sc.close();
    }
}

