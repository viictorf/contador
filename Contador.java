import java.util.Scanner;
import java.util.InputMismatchException;

public class Contador {

    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);
        int parametroUm = 0;
        int parametroDois = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("Digite o primeiro parâmetro numérico:");
                parametroUm = entradaDados.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                entradaDados.next();
            }
        }

        validInput = false;

        while (!validInput) {
            try {
                System.out.println("Digite o segundo parâmetro numérico:");
                parametroDois = entradaDados.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                entradaDados.next(); 
            }
        }

        try {
            contar(parametroUm, parametroDois);
        } catch (Exception e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro em pelos menos dois valores.");
        }

        entradaDados.close();
    }

    static void contar(int parametroUm, int parametroDois) throws Exception {
        if (parametroDois <= parametroUm || parametroDois == parametroUm+1) {
            throw new Exception("O segundo parâmetro deve ser maior que o primeiro.");
        }
        
        for (int x = parametroUm + 1; x < parametroDois; x++) {
            System.out.println("Número: " + x);
        }
    }
    
}
