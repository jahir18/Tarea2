public class Cocina {

    String marca;
    String modelo;
    String color;

    public Cocina(String mar, String mod, String col) {

        establecerMarca(mar);
        establecerModelo(mod);
        establecerColor(col);
    }

    public String optenerMarca() {
        return marca;
    }

    public void establecerMarca(String mar) {
        marca = mar;
    }

    public String optenerModelo() {
        return modelo;
    }

    public void establecerModelo(String mod) {
        modelo = mod;
    }

    public String optenerColor() {
        return color;
    }

    public void establecerColor(String col) {
        color = col;
    }

}
