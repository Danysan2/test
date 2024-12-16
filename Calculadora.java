public class Calculadora {

    public static void main(String[] args) {
        System.out.println("Multiplicacion: " + multiplicacion());
        System.out.println("Resta: " +  resta());
    }

    public static int multiplicacion(){
        Producto multiplicacion = new Producto();
        int resultado = multiplicacion.producto(3,5);
        return resultado;
    }

    public static int resta(){
        Resta resta = new Resta();
        int resultado = resta.resta(3,5);
        return resultado;
    }
}
