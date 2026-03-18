public class Ud4Ej5 {
    public static void main(String[] args) {
        // Entorno
        float millas = 26;
        float yardas = 385;
        float kmMillas, kmYardas;

        // Algoritmo
        kmMillas = (float)(millas * 1.60934);
        kmYardas = (float)(yardas * 0.0009144);
        System.out.println("Millas en kilómetros: " + kmMillas);
        System.out.println("Yardas en kilómetros: " + kmYardas);
    }
}
