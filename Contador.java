import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;

        System.out.print("Digite o primeiro numero: ");
        num1 = input.nextInt();
        System.out.print("Digite segundo numero : ");
        num2 = input.nextInt();

        try {
            numOcorrencias(num1,num2);

        }catch(ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    private static void numOcorrencias(int num1,int num2) throws ParametrosInvalidosException {
        if (num1 > num2){
            throw new ParametrosInvalidosException();
        } else {
            int contagem = num2 - num1;
            System.out.print("\nResultado conta: " + contagem);
            for (int i = 0; i < contagem; i++) {
                System.out.print("\nImprimindo o número: " + (i+1));
            }
        }
    }
}

//Wellington Rodrigues 02/09/2024
