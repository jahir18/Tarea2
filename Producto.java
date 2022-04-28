public class Producto {

    String nombre;
    double cantidad;
    String codigo;

    public Producto(String nom, double can, String cod) {

        establecerNombre(nom);
        establecerCantidad(can);
        establecerCodigo(cod);
    }

    public String optenerNombre() {
        return nombre;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public double optenerCantidad() {
        return cantidad;
    }

    public void establecerCantidad(double can) {
        cantidad = can;
    }

    public String optenerCodigo() {
        return codigo;
    }

    public void establecerCodigo(String cod) {
        codigo = cod;
    }

}
