public class Computadora {

    String marca;
    String modelo;
    String procesador;

    public Computadora(String mar, String mod, String pro) {

        establecerMarca(mar);
        establecerModelo(mod);
        establecerProcesador(pro);
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

    public String optenerProcesador() {
        return procesador;
    }

    public void establecerProcesador(String pro) {
        procesador = pro;
    }

}
