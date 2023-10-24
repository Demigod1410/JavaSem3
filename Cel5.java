import java.util.Scanner;

public class Cel5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your temperature in Celsius: ");
        double celsius = sc.nextDouble(); 

        TemperatureCalculator calculator = new TemperatureCalculator();
        double kelvin = calculator.convertToKelvin(celsius);

        System.out.println("Kelvin is: " + kelvin);
    }
}

class TemperatureCalculator {
    public double convertToKelvin(double celsius) {
        return celsius + 273; 
    }
}
