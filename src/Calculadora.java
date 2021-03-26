public class Calculadora {
    public static double sumar(double numero1, double numero2){
        return numero1 + numero2;
    }

    public static double restar (double numero1, double numero2){
        return numero1 - numero2;
    }

    public static double multiplicar (double numero1, double numero2){
        return numero1 * numero2;
    }

    public static double dividir (double numero1, double numero2){
        return numero1 / numero2;
    }

    public static double potencias(double base, double exponente){
        double resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}
