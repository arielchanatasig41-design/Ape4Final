class Producto {
    String nombre;
    double precio;
    int stock;

    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    void reducirStock(int cantidad) {
        if (cantidad > 0 && stock >= cantidad) {
            stock -= cantidad;
            System.out.println("Stock actualizado.");
        } else {
            System.out.println("Stock insuficiente.");
        }
    }

    void mostrarProducto() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
    }
}

class Venta {
    int cantidad;

    Venta(int cantidad) {
        this.cantidad = cantidad;
    }

    void aplicar(Producto producto) {
        if (cantidad > 0 && producto.stock >= cantidad) {
            double total = producto.precio * cantidad;
            producto.reducirStock(cantidad);
            System.out.println("Total a pagar: $" + total);
        } else {
            System.out.println("Stock insuficiente.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Cuaderno", 2.50, 10);
        Venta venta1 = new Venta(3);

        p1.mostrarProducto();
        venta1.aplicar(p1);
        p1.mostrarProducto();
    }
}