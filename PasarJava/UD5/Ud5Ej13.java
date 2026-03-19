/*Autor: Daniel Jimenez Ramirez*/
public class Ud5Ej13 {
    public static void main(String[] args) {
    // Entorno
        int numero; 
    //Algoritmo
        System.out.println("Introduce un numero distinto de cero: ");
        numero = Leer.datoInt();
        if (numero > 0){
            numero = (int)Math.pow(numero, 2);
            System.out.println("El cuadrado del numero: "+numero);
        }
    }    
}
