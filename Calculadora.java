public class Calculadora {

    public static void main(String[] args) {

        Suma.suma();
        Division.division();
        System.out.println("Multiplicacion: " + Producto.producto(3,6));
        System.out.println("Resta: " +  resta());
    }

    public static int resta(){
        Resta resta = new Resta();
        int resultado = resta.resta(3,5);
        return resultado;
    }
}
