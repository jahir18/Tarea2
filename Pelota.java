
public class Pelota {

    double tamaño;
    String forma;
    String peso;

    public Pelota(double tam, String form, String pes) {

        establecerTamaño(tam);
        establecerForma(form);
        establecerPeso(pes);
    }

    public double optenerTamaño() {
        return tamaño;
    }

    public void establecerTamaño(double tam) {
        tamaño = tam;
    }

    public String optenerForma() {
        return forma;
    }

    public void establecerForma(String form) {
        forma = form;
    }

    public String optenerPeso() {
        return peso;
    }

    public void establecerPeso(String pes) {
        peso = pes;
    }

}
