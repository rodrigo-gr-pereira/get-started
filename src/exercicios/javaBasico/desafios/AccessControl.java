package exercicios.javaBasico.desafios;

import java.util.Scanner;

public class AccessControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados do usuário
        // Solicita se o visitante é autorizado
        System.out.print("O visitante possui autorização? (true/false): ");
        boolean hasPermission = scanner.nextBoolean(); // Lê um valor booleano (true ou false)
        System.out.print("Digite a idade do visitante: ");
        int age = scanner.nextInt(); // Lê a idade como inteiro
        // TODO: Verifique condições de acesso
        if(age >= 18 &&  hasPermission){
            System.out.println("Acesso permitido");
        }else if(age >= 18 && hasPermission){
            System.out.println("Acesso negado");
        } else if( age  < 18 && hasPermission){
            System.out.println("Idade insuficiente");
        } else{
            System.out.println("Acesso negado");
        }

        scanner.close();
    }
}

