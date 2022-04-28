public class Auto {
    String marca;
    String placa;
    String color;

    public Auto(String mar, String plac, String col) {

        establecerMarca(mar);
        establecerPlaca(plac);
        establecerColor(col);
    }

    public String optenerMarca() {
        return marca;
    }

    public void establecerMarca(String mar) {
        marca = mar;
    }

    public String optenerPlaca() {
        return placa;
    }

    public void establecerPlaca(String plac) {
        placa = plac;
    }

    public String optenerColor() {
        return color;
    }

    public void establecerColor(String col) {
        color = col;
    }

}
