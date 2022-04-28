public class Celular {

    String marca;
    double imei;
    String modelo;

    public Celular(String marc, double num, String mod) {

        establecerMarca(marc);
        establecerImei(num);
        establecerModelo(mod);
    }

    public String optenerMarca() {
        return marca;
    }

    public void establecerMarca(String marc) {
        marca = marc;
    }

    public double optenerImei() {
        return imei;
    }

    public void establecerImei(double num) {
        imei = num;
    }

    public String optenerModelo() {
        return modelo;
    }

    public void establecerModelo(String mod) {
        modelo = mod;
    }

}
