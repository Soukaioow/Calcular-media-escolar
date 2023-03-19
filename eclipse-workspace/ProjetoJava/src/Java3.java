
import java.util.Scanner;
public class Java3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

       String continuar = "s";
        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("Digite o nome do aluno: ");
            String nome = sc.nextLine();

            double soma = 0;
            for (int i = 1; i <= 4; i++) {
                System.out.printf("Digite a nota %d: ", i);
                double nota = sc.nextDouble();
                soma += nota;
            }
            double media = soma / 4;

            System.out.printf("Aluno: %s - Média: %.2f - ", nome, media);
            if (media >= 6) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }

            System.out.print("Deseja calcular a média de outro aluno? (s/n) ");
            continuar = sc.next();
            sc.nextLine();
        }
        System.out.println("Programa encerrado.");
        sc.close();
    }



	}


