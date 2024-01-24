package regra;

import java.util.Scanner;

public class ConversorDeUnidades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            exibirMenu();
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    converterTemperatura(scanner);
                    break;
                case 2:
                    converterDistancia(scanner);
                    break;
                case 3:
                    converterPeso(scanner);
                    break;
                case 4:
                    calcularIMC(scanner);
                    break;
                case 0:
                    System.out.println("Saindo do programa. Até mais!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("\nEscolha o que deseja converter:");
        System.out.println("1. Temperatura");
        System.out.println("2. Distância");
        System.out.println("3. Peso");
        System.out.println("4. Calcular IMC");
        System.out.println("0. Sair");
        System.out.print("Digite o número da opção desejada: ");
    }

    private static void converterTemperatura(Scanner scanner) {
        System.out.println("\nEscolha a unidade de entrada:");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.print("Digite o número da opção desejada: ");
        int unidadeEntrada = scanner.nextInt();

        System.out.print("Digite a temperatura a ser convertida: ");
        double temperatura = scanner.nextDouble();

        double resultado;

        switch (unidadeEntrada) {
            case 1: // Celsius
                resultado = converterCelsius(temperatura);
                break;
            case 2: // Fahrenheit
                resultado = converterFahrenheit(temperatura);
                break;
            case 3: // Kelvin
                resultado = converterKelvin(temperatura);
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        System.out.println("Resultado: " + resultado + "°");
    }

    private static double converterCelsius(double temperatura) {
        return temperatura;
    }

    private static double converterFahrenheit(double temperatura) {
        return (temperatura - 32) * 5 / 9;
    }

    private static double converterKelvin(double temperatura) {
        return temperatura - 273.15;
    }

    private static void converterDistancia(Scanner scanner) {
        System.out.println("\nEscolha a unidade de entrada:");
        System.out.println("1. Metros");
        System.out.println("2. Quilômetros");
        System.out.println("3. Milhas");
        System.out.print("Digite o número da opção desejada: ");
        int unidadeEntrada = scanner.nextInt();

        System.out.print("Digite a distância a ser convertida: ");
        double distancia = scanner.nextDouble();

        double resultado;

        switch (unidadeEntrada) {
            case 1: // Metros
                resultado = converterMetros(distancia);
                break;
            case 2: // Quilômetros
                resultado = converterQuilometros(distancia);
                break;
            case 3: // Milhas
                resultado = converterMilhas(distancia);
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        System.out.println("Resultado: " + resultado + " " + obterUnidadeSaida(unidadeEntrada));
    }

    private static double converterMetros(double distancia) {
        return distancia;
    }

    private static double converterQuilometros(double distancia) {
        return distancia / 1000;
    }

    private static double converterMilhas(double distancia) {
        return distancia / 1609.34;
    }

    private static String obterUnidadeSaida(int unidadeEntrada) {
        switch (unidadeEntrada) {
            case 1: return "metros";
            case 2: return "quilômetros";
            case 3: return "milhas";
            default: return "";
        }
    }

    private static void converterPeso(Scanner scanner) {
        System.out.println("\nEscolha a unidade de entrada:");
        System.out.println("1. Gramas");
        System.out.println("2. Quilogramas");
        System.out.println("3. Libras");
        System.out.print("Digite o número da opção desejada: ");
        int unidadeEntrada = scanner.nextInt();

        System.out.print("Digite o peso a ser convertido: ");
        double peso = scanner.nextDouble();

        double resultado;

        switch (unidadeEntrada) {
            case 1: // Gramas
                resultado = converterGramas(peso);
                break;
            case 2: // Quilogramas
                resultado = converterQuilogramas(peso);
                break;
            case 3: // Libras
                resultado = converterLibras(peso);
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        System.out.println("Resultado: " + resultado + " " + obterUnidadeSaidaPeso(unidadeEntrada));
    }

    private static double converterGramas(double peso) {
        return peso;
    }

    private static double converterQuilogramas(double peso) {
        return peso / 1000;
    }

    private static double converterLibras(double peso) {
        return peso / 453.592;
    }

    private static String obterUnidadeSaidaPeso(int unidadeEntrada) {
        switch (unidadeEntrada) {
            case 1: return "gramas";
            case 2: return "quilogramas";
            case 3: return "libras";
            default: return "";
        }
    }

    private static void calcularIMC(Scanner scanner) {
        System.out.print("Digite seu peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = calcularIMC(peso, altura);
        System.out.println("Seu IMC é: " + imc);
    }

    private static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
}

