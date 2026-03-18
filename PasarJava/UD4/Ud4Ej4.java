public class Ud4Ej4 {
    public static void main(String[] args) {
        // Entorno:
        float euros, kuwait, pesetas;
        // Algoritmo:
        System.out.println("Introduce una cantidad en euros:");
        euros = Leer.datoFloat();
        kuwait = (float)(euros * 0.33);
        pesetas = (float)(euros * 166386);
        System.out.println("La cantidad introducida en kuwait es " + kuwait + " y en pesetas " + pesetas);
    }
}
