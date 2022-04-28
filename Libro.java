public class Libro {

    String titulo;
    String paginas;
    String autor;

    public Libro(String tit, String pag, String aut) {

        establecerTitulo(tit);
        establecerPaginas(pag);
        establecerAutor(aut);
    }

    public String optenerTitulo() {
        return titulo;
    }

    public void establecerTitulo(String tit) {
        titulo = tit;
    }

    public String optenerPaginas() {
        return paginas;
    }

    public void establecerPaginas(String pag) {
        paginas = pag;
    }

    public String optenerAutor() {
        return autor;
    }

    public void establecerAutor(String aut) {
        autor = aut;
    }

}
