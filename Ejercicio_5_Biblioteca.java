class Usuario {
    String nombre;
    String cedula;

    Usuario(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }
}

class Libro {
    String titulo;
    boolean disponible;

    Libro(String titulo) {
        this.titulo = titulo;
        this.disponible = true;
    }

    boolean prestar() {
        if (disponible) {
            disponible = false;
            return true;
        }
        return false;
    }

    void devolver() {
        disponible = true;
        System.out.println("Libro devuelto: " + titulo);
    }
}

class Prestamo {
    Usuario usuario;
    Libro libro;

    Prestamo(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
    }

    void registrar() {
        if (libro.prestar()) {
            System.out.println("Prestamo registrado para " + usuario.nombre
                    + ". Libro: " + libro.titulo);
        } else {
            System.out.println("El libro " + libro.titulo + " no esta disponible para "
                    + usuario.nombre + ".");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Ariel", "0000000001");
        Usuario usuario2 = new Usuario("Paulo", "0000000002");
        Libro libro1 = new Libro("Programacion en Java");

        Prestamo prestamo1 = new Prestamo(usuario1, libro1);
        Prestamo prestamo2 = new Prestamo(usuario2, libro1);

        prestamo1.registrar();
        prestamo2.registrar();
    }
}