import java.util.Scanner;

public class Leer {
    private static Scanner sc = new Scanner(System.in);

    // Leer una cadena de texto (una línea completa)
    public static String datoString() {
        return sc.nextLine();
    }

    // Leer un número entero
    public static int datoInt() {
        try {
            int valor = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer
            return valor;
        } catch (Exception e) {
            sc.nextLine(); // Limpiar buffer tras error
            System.out.println("Error: No es un entero válido. Se devuelve 0.");
            return 0;
        }
    }

    // Leer un número decimal (float)
    public static float datoFloat() {
        try {
            float valor = sc.nextFloat();
            sc.nextLine(); 
            return valor;
        } catch (Exception e) {
            sc.nextLine();
            System.out.println("Error: No es un float válido. Se devuelve 0.0f.");
            return 0.0f;
        }
    }

    // Leer un número decimal (double)
    public static double datoDouble() {
        try {
            double valor = sc.nextDouble();
            sc.nextLine();
            return valor;
        } catch (Exception e) {
            sc.nextLine();
            System.out.println("Error: No es un double válido. Se devuelve 0.0.");
            return 0.0;
        }
    }

    // Leer un booleano (true/false)
    public static boolean datoBoolean() {
        try {
            boolean valor = sc.nextBoolean();
            sc.nextLine();
            return valor;
        } catch (Exception e) {
            sc.nextLine();
            System.out.println("Error: No es un booleano válido. Se devuelve false.");
            return false;
        }
    }

    // Leer un solo caracter
    public static char datoChar() {
        String res = sc.nextLine();
        return (res.length() > 0) ? res.charAt(0) : '\0';
    }
    
    // Leer un entero corto (short: -32,768 a 32,767)
    public static short datoShort() {
        try {
            short valor = sc.nextShort();
            sc.nextLine();
            return valor;
        } catch (Exception e) {
            sc.nextLine();
            System.out.println("Error: No es un short válido. Se devuelve 0.");
            return 0;
        }
    }

    // Leer un entero largo (long: para números muy grandes)
    public static long datoLong() {
        try {
            long valor = sc.nextLong();
            sc.nextLine();
            return valor;
        } catch (Exception e) {
            sc.nextLine();
            System.out.println("Error: No es un long válido. Se devuelve 0L.");
            return 0L;
        }
    }

    // Leer un byte (-128 a 127)
    public static byte datoByte() {
        try {
            byte valor = sc.nextByte();
            sc.nextLine();
            return valor;
        } catch (Exception e) {
            sc.nextLine();
            System.out.println("Error: No es un byte válido. Se devuelve 0.");
            return 0;
        }
    }
}