/*Autor: Daniel Jimenez Ramirez*/
public class Ud5Ej14NoTerminado {
    public static void main(String[] args) {
    // Entorno
        float a,b,c, raiz;
    //Algoritmo
        System.out.println("Valor a: ");
        a = Leer.datoFloat();
        System.out.println("Valor b: ");
        b = Leer.datoFloat();
        System.out.println("Valor c: ");
        c = Leer.datoFloat();
        if (a == 0){
            System.out.println("No puede ser cero");
        } else {
            raiz = (b * b) - (4 * a * c);
        }
    }    
}
