package view;

import model.ex5.*;
public class Ex5 {
   public static void main(String[] args) {
        Conversor conversor = new Conversor();

        double tempCelsius = 25.0;
        double tempFahrenheit = conversor.converter(tempCelsius);
        System.out.println(tempCelsius + "°C é igual a " + tempFahrenheit + "°F");

        double km = 10.0;
        double milhas = conversor.converter(km, true);
        System.out.println(km + " km é igual a " + String.format("%.2f", milhas) + " milhas");

        String textoOriginal = "olá, mundo!";
        String textoMaiusculo = conversor.converter(textoOriginal);
        System.out.println("Texto original: \"" + textoOriginal + "\" -> Convertido: \"" + textoMaiusculo + "\"");
    } 
}
