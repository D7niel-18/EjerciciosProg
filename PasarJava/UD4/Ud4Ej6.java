public class Ud4Ej6 {
    public static void main(String[] args) {
    // Entorno
        float fahrenheit, celsius;
    // Algoritmo
        System.out.print("Ingresa la temperatura en grados Fahrenheit: ");
        fahrenheit = Leer.datoFloat();
        celsius = (5.0f / 9.0f) * (fahrenheit - 32.0f);
        System.out.println("Los grados fahrenheit pasados a celsius son: " + celsius);
    }
}
