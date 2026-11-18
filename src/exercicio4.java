import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            System.out.print("Digite a nota do 1o bimestre: ");
            double n1 = sc.nextDouble();

            System.out.print("Digite a nota do 2o bimestre: ");
            double n2 = sc.nextDouble();

            System.out.print("Digite a nota do 3o bimestre: ");
            double n3 = sc.nextDouble();

            System.out.print("Digite a nota do 4o bimestre: ");
            double n4 = sc.nextDouble();

            double media = (n1 + n2 + n3 + n4) / 4;

            System.out.printf("Media do aluno: %.2f%n", media);
        }


        }
    }