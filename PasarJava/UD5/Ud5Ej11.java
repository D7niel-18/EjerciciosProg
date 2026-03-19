/*Autor: Daniel Jimenez Ramirez*/
public class Ud5Ej11 {
    public static void main(String[] args) {
    // Entorno
        int numero, contadorPositivos = 0, contadorNegativos = 0, totales=0;
    //Algoritmo
        do {
            System.out.println("Introduce un numero(Cero para parar): ");
            numero = Leer.datoInt();
            if (numero > 1){
                contadorPositivos++;
            } else if (numero < 0){
                contadorNegativos++;
            }
        }while(numero != 0);
        totales = contadorPositivos + contadorNegativos;
        System.out.println("Cantidad de numeros introducidos: "+totales);
        System.out.println("Cantidad de numeros positivos: "+contadorPositivos);
        System.out.println("Cantidad de numeros negativos: "+contadorNegativos);
    }
    
}
