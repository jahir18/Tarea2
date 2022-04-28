public class Ropa {

    String tipo;
    String marca;
    String color;

    public Ropa(String mar, String tip, String col) {

        establecerPlaca(tip);
        establecerMarca(mar);
        establecerColor(col);
    }

    public String optenerTipo() {
        return tipo;
    }

    public void establecerPlaca(String tip) {
        tipo = tip;
    }

    public String optenerMarca() {
        return marca;
    }

    public void establecerMarca(String mar) {
        marca = mar;
    }

    public String optenerColor() {
        return color;
    }

    public void establecerColor(String col) {
        color = col;
    }

}
