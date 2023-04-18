// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.util.Scanner;

public class IdadePlanetaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double idadeTerrestre = scanner.nextDouble();
        String planeta = scanner.next();

        //TODO: Crie as condições para calcular a idade equivalente de cada planeta.

        //TODO: Imprima a saída conforme descrito neste desafio.
        double idadePlaneta = 0;

        if(planeta.equals("Marte")){
            idadePlaneta = idadeTerrestre / 1.88;
            System.out.printf("Idade equivalente em Marte: %.2f anos", idadePlaneta);
        } else if(planeta.equals("Venus")){
            idadePlaneta = idadeTerrestre / 0.62;
            System.out.printf("Idade equivalente em Venus: %.2f anos", idadePlaneta);
        } else if(planeta.equals("Jupiter")){
            idadePlaneta = idadeTerrestre / 11.86;
            System.out.printf("Idade equivalente em Jupiter: %.2f anos", idadePlaneta);
        } else{
            System.out.println("Planeta invalido.");
        }
        scanner.close();
    }
}