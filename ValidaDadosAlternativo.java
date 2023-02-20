import java.util.Scanner;

public class ValidaDadosAlternativo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int idade = 0;
        double salario = 0.0;
        String genero = null;

        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print("Digite a idade: ");
            idade = input.nextInt();
            if (idade >= 0 && idade <= 150) {
                entradaValida = true;
            } else {
                System.out.println("Idade inválida. Tente novamente.");
            }
        }

        entradaValida = false;

        while (!entradaValida) {
            System.out.print("Digite o salário: ");
            salario = input.nextDouble();
            if (salario > 0) {
                entradaValida = true;
            } else {
                System.out.println("Salário inválido. Tente novamente.");
            }
        }

        entradaValida = false;

        while (!entradaValida) {
            System.out.print("Digite o gênero (M/F/Outro): ");
            genero = input.next();
            if (genero.equalsIgnoreCase("M") || genero.equalsIgnoreCase("F") || genero.equalsIgnoreCase("Outro")) {
                entradaValida = true;
            } else {
                System.out.println("Gênero inválido. Tente novamente.");
            }
        }

        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Gênero: " + genero);
    }
}



