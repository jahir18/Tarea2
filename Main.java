public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona("Jahir Trujillo", 22, "Masculino");

        System.out.println(persona.optenerNombre());
        System.out.println((int) persona.optenerEdad());
        System.out.println(persona.optenerSexo());

        Auto auto = new Auto("TOYOTA", "22M1-P4", "Rojo");

        System.out.println(auto.optenerMarca());
        System.out.println(auto.optenerPlaca());
        System.out.println(auto.optenerColor());

        Televisor televisor = new Televisor("SAMSUNG", 49, "Qled");

        System.out.println(televisor.optenerMarca());
        System.out.println((int) televisor.optenerPulgadas());
        System.out.println(televisor.optenerModelo());

        Celular celular = new Celular("LG", 49332, "K11");

        System.out.println(celular.optenerMarca());
        System.out.println((int) celular.optenerImei());
        System.out.println(celular.optenerModelo());

        Producto producto = new Producto("Arroz", 493, "12G34");

        System.out.println(producto.optenerNombre());
        System.out.println((int) producto.optenerCantidad());
        System.out.println(producto.optenerCodigo());

        Ropa ropa = new Ropa("Adidas", "Polo", "Rojo");

        System.out.println(ropa.optenerTipo());
        System.out.println(ropa.optenerMarca());
        System.out.println(ropa.optenerColor());

        Perro perro = new Perro("Firulais", 10, "pitbull");

        System.out.println(perro.optenerNombre());
        System.out.println((int) perro.optenerEdad());
        System.out.println(perro.optenerRaza());

        Computadora computadora = new Computadora("LENOVO", "IdeaPad5", "AMD Ryzen3");

        System.out.println(computadora.optenerMarca());
        System.out.println(computadora.optenerModelo());
        System.out.println(computadora.optenerProcesador());

        Mueble mueble = new Mueble("Silla", 1, "Tornillo");

        System.out.println(mueble.optenerNombre());
        System.out.println((int) mueble.optenerCapacidad());
        System.out.println(mueble.optenerMaterial());

        Bicicleta bicicleta = new Bicicleta("Scoop", "Amster", "Gris");

        System.out.println(bicicleta.optenerMarca());
        System.out.println(bicicleta.optenerModelo());
        System.out.println(bicicleta.optenerColor());

        Cocina cocina = new Cocina("Sole", "COSOL 027 4", "Gris");

        System.out.println(cocina.optenerMarca());
        System.out.println(cocina.optenerModelo());
        System.out.println(cocina.optenerColor());

        Puente puente = new Puente(15, "Fierro", 2000);

        System.out.println(puente.optenerLongitud());
        System.out.println(puente.optenerMaterial());
        System.out.println(puente.optenerTolerancia());

        Pelota pelota = new Pelota(21.5, "Esferico", "420 gr");

        System.out.println(pelota.optenerTamaño());
        System.out.println(pelota.optenerForma());
        System.out.println(pelota.optenerPeso());

        Libro libro = new Libro("Los perros hambrientos", "200 paginas", "Ciro Alegria");

        System.out.println(libro.optenerTitulo());
        System.out.println(libro.optenerPaginas());
        System.out.println(libro.optenerAutor());

    }

}