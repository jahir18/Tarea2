public class Persona {

    String nombre;
    double edad;
    String sexo;

    public Persona(String nom, double num, String sex) {

        establecerNombre(nom);
        establecerEdad(num);
        establecerSexo(sex);
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

    public String optenerSexo() {
        return sexo;
    }

    public void establecerSexo(String sex) {
        sexo = sex;
    }

}
