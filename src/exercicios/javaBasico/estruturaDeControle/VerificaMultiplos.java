package exercicios.javaBasico.estruturaDeControle;

import java.util.Scanner;

public class VerificaMultiplos {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o número: ");
        var number = scanner.nextInt();
        var keepVerify = true;
        while (keepVerify){
            System.out.println("Informe o numero para verificação");
            var toVerify = scanner.nextInt();
            if(toVerify < number){
                System.out.printf("Informe um numero maior que %s \n", number);
                continue;
            }
            var result = toVerify % number;
            keepVerify = result == 0;
            System.out.printf("%s %% %s = %s \n", toVerify, number, result);
            if (result != 0) break;
        }
    }
}
