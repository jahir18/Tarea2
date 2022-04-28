public class Televisor {

    String marca;
    double pulgadas;
    String modelo;

    public Televisor(String marc, double num, String mod) {

        establecerMarca(marc);
        establecerPulgadas(num);
        establecerModelo(mod);
    }

    public String optenerMarca() {
        return marca;
    }

    public void establecerMarca(String marc) {
        marca = marc;
    }

    public double optenerPulgadas() {
        return pulgadas;
    }

    public void establecerPulgadas(double num) {
        pulgadas = num;
    }

    public String optenerModelo() {
        return modelo;
    }

    public void establecerModelo(String mod) {
        modelo = mod;
    }

}
