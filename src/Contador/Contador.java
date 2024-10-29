package Contador;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        terminal.nextLine();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();
        terminal.nextLine();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            System.out.println("Exceção Capturada: " + exception.getMessage());
        }

    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        } else if (parametroUm < 0 && parametroDois < 0) {
            throw new ParametrosInvalidosException("Os parâmetros não podem ser negativos. ");
        }

        int contagem = parametroDois - parametroUm;

        System.out.println("A diferença entre " + parametroDois + " e " + parametroUm + " é de " + contagem + " números. A seguir a contagem entre eles: ");
        for(int i=0;i<=contagem;i++){
            System.out.println("Imprimindo o número: " + i);
        }
    }
}
