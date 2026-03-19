/*Autor: Daniel Jimenez Ramirez*/
public class Ud5Ej12 {
    public static void main(String[] args) {
    // Entorno
        int pares=0, impares=0;  
    //Algoritmo
        for(int i = 0; i <= 10; i++){
            if (i % 2 == 0){
                pares = pares + i;
            } else {
                impares = impares + i;
            }
        }
        System.out.println("La suma de los pares es: "+pares);
        System.out.println("La suma de los impares es: "+impares);
    }    
}
