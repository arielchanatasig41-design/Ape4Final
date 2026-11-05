class Rectangulo {
    double base;
    double altura;

    Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea() {
        return base * altura;
    }

    double calcularPerimetro() {
        return 2 * (base + altura);
    }

    boolean esCuadrado() {
        return base == altura;
    }

    String obtenerDescripcion() {
        return "Rectángulo de " + base + " x " + altura;
    }

    void mostrar() {
        System.out.println(obtenerDescripcion());
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
        System.out.println("Es cuadrado?: " + esCuadrado());
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(4.0, 6.0);
        r1.mostrar();
    }
}