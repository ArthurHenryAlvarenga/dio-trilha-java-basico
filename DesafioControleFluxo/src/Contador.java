import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parametro deve ser maior que o primeiro parametro");
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validando se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroDois < parametroUm)
            throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;

            for (int numero = 1; numero <= contagem; numero++) {

                System.out.println(numero);
            }


        }
    }

