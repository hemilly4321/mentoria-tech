import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando o objeto Scanner para leitura da entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando que o usuário digite a temperatura em Celsius
        System.out.print("Digite a temperatura em Celsius (°C): ");
        double celsius = scanner.nextDouble();

        // Realizando as conversões
        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        // Exibindo os resultados
        System.out.printf("Temperatura em Celsius: %.2f °C%n", celsius);
        System.out.printf("Temperatura em Fahrenheit: %.2f °F%n", fahrenheit);
        System.out.printf("Temperatura em Kelvin: %.2f K%n", kelvin);

        // Fechando o scanner
        scanner.close();
    }
}
