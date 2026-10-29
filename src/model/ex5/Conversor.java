package model.ex5;

public class Conversor {

    public double converter(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double converter(double quilometros, boolean paraMilhas) {
        if (paraMilhas) {
            return quilometros * 0.621371;
        }
        return quilometros;
    }

    public String converter(String texto) {
        if (texto == null) {
            return null;
        }
        return texto.toUpperCase();
    }
}