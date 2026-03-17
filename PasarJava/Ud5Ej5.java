

public class Ud5Ej5 {
    public static void main(String[] args) {
        // Entorno:
        float importeVenta, descuento;
        final float IVA = 0.21f;
        // Algoritmo:
        System.out.println("Introduzca el importe de la venta");
        importeVenta = Leer.datoFloat();
        if (importeVenta > 1500){
            // Aplicamos descuento de 25% y IVA
            descuento = (float)(importeVenta * 0.25);
            importeVenta = importeVenta - descuento;
            importeVenta = importeVenta +(importeVenta*IVA);
            System.out.println("Totla a pagar:"+importeVenta);
        } else {
            importeVenta = importeVenta +(importeVenta*IVA);
            System.out.println("Totla a pagar:"+importeVenta);
        }
    }
}
