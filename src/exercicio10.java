import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            System.out.print("Digite a media final do aluno: ");
            double media = sc.nextDouble();

            if (media >= 7) {
                System.out.println("Aprovado");
            } else if (media >= 5) {
                System.out.println("Recuperacao");
            } else {
                System.out.println("Reprovado");
            }

            sc.close();

        }
    }
        }


