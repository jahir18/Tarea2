public class Mueble {
    String nombre;
    double capacidad;
    String material;

    public Mueble(String nom, double cap, String mat) {

        establecerNombre(nom);
        establecerCapacidad(cap);
        establecerMaterial(mat);
    }

    public String optenerNombre() {
        return nombre;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public double optenerCapacidad() {
        return capacidad;
    }

    public void establecerCapacidad(double cap) {
        capacidad = cap;
        ;
    }

    public String optenerMaterial() {
        return material;
    }

    public void establecerMaterial(String mat) {
        material = mat;
    }

}
