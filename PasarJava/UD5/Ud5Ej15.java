/*Autor: Daniel Jimenez Ramirez*/
public class Ud5Ej15 {
    public static void main(String[] args) {
    // Entorno
        float numero=0, suma=0, media=0;
        int i;
    //Algoritmo
        for(i=1;i <= 5;i++){
            System.out.println("Introduce un numero: ");
            numero = Leer.datoFloat();
            suma = suma + numero;
        }
        media = suma/i;
        System.out.println("La media es: "+media);
    }    
}
