package Task1;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Введите название шкалы а затем температуру для перевода");
        Scanner scanner = new Scanner(System.in);
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        temperatureConverter.setUserTemperatureSignature(scanner.nextLine());
        temperatureConverter.setUserTemperatureValue(scanner.nextFloat());
        System.out.println(temperatureConverter.convertTo());
    }
}
