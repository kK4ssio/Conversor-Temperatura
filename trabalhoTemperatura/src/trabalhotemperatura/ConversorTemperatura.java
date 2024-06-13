package trabalhotemperatura;

import java.util.Scanner;

public class ConversorTemperatura {

    Scanner sc = new Scanner(System.in);
    private double TempCelsius;
    private double TempFahrenheit;
    private String Clima;

    public ConversorTemperatura(double TempCelsius, double TempFahrenheit, String Clima) {
        this.TempCelsius = TempCelsius;
        this.TempFahrenheit = TempFahrenheit;
        this.Clima = Clima;
    }
//metodos acessores

    public double setTempCelsius(double TempCelsius) {
        this.TempCelsius = TempCelsius;
        return TempCelsius;
    }

    public double getTempCelsius() {
        return TempCelsius;
    }

    public double setTempFahrenheit(double TempFahrenheit) {
        this.TempFahrenheit = TempFahrenheit;
        return TempFahrenheit;
    }

    public double getTempFahrenheit() {
        return TempFahrenheit;
    }

    public String setClima(String Clima) {
        this.Clima = Clima;
        return Clima;
    }

    public String getClima() {
        return Clima;
    }

    public void RealizarConversao() {
        System.out.println("Insira a temperatura em celsius = ");
        double getTempCelsius = sc.nextDouble();
        double getTempFahrenheit = (getTempCelsius) * 9 / 5 + 32;

        //frio
        if (getTempFahrenheit <= 64.4) {

            System.out.println("temperatura em Celsius = " + getTempCelsius);
            System.out.println("temperatura convertida para Fahrenheit  = " + getTempFahrenheit);
            Clima = "frio";
            System.out.println("Clima = "+Clima);
        }
        //agradavel
        if (getTempFahrenheit >= 66.2 && getTempFahrenheit <= 73.4) {
            System.out.println("temperatura em Celsius = " + getTempCelsius);
            System.out.println("temperatura convertida para Fahrenheit  = " + getTempFahrenheit);
            Clima = "agradavel";
            System.out.println("Clima = "+Clima);
        }
        //quente
        if (getTempFahrenheit >= 75.2 && getTempFahrenheit <= 95) {
            System.out.println("temperatura em Celsius = " + getTempCelsius);
            System.out.println("temperatura convertida para Fahrenheit  = " + getTempFahrenheit);
            Clima = "quente";
            System.out.println("Clima = "+Clima);
        }
        //muito quente 
        if (getTempFahrenheit > 95) {
            System.out.println("temperatura em Celsius = " + getTempCelsius);
            System.out.println("temperatura convertida para Fahrenheit  = " + getTempFahrenheit);
            Clima = "muito Quente";
            System.out.println("Clima = "+Clima);
        }
    }

}
