package Aula3;

public class Quadrilatero {
    public static void area(double lado) {
        System.out.println("Área do quadrado: " + lado * lado);
    }
    
    public static void area(double lado1, double lado2) {
        System.out.println("Área do quadrado: " + lado1 * lado2);
    }
    
    public static double area(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior+baseMenor)*altura) / 2;
    }
    
    public static void xpto(){
        System.out.println("Antes");
        return;
    }
    
    public static double abc(){
        return 1.6;
    }
}
