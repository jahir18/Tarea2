public class Perro {

    String nombre;
    double edad;
    String raza;

    public Perro(String nom, double num, String raz) {

        establecerNombre(nom);
        establecerEdad(num);
        establecerRaza(raz);
    }

    public String optenerNombre() {
        return nombre;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public double optenerEdad() {
        return edad;
    }

    public void establecerEdad(double num) {
        edad = num;
    }

    public String optenerRaza() {
        return raza;
    }

    public void establecerRaza(String raz) {
        raza = raz;
    }

}
