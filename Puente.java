public class Puente {

    double longitud;
    String material;
    double tolerancia;

    public Puente(double lon, String mat, double tol) {

        establecerLongitud(lon);
        establecerMaterial(mat);
        establecerTolerancia(tol);
    }

    public double optenerLongitud() {
        return longitud;
    }

    public void establecerLongitud(double lon) {
        longitud = lon;
    }

    public String optenerMaterial() {
        return material;
    }

    public void establecerMaterial(String mat) {
        material = mat;
    }

    public double optenerTolerancia() {
        return tolerancia;
    }

    public void establecerTolerancia(double tol) {
        tolerancia = tol;
    }

}
