class Cuenta {
    String titular;
    double saldo;

    Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    void transferir(Cuenta destino, double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            destino.saldo += monto;
            System.out.println("Transferencia realizada correctamente.");
        } else {
            System.out.println("Transferencia fallida: fondos insuficientes o monto invalido.");
        }
    }

    void mostrarSaldo() {
        System.out.println(titular + " tiene $" + saldo);
    }
}

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Ariel", 500.0);
        Cuenta cuenta2 = new Cuenta("Paulo", 100.0);

        cuenta1.transferir(cuenta2, 150.0); // Transferencia valida
        cuenta1.transferir(cuenta2, 600.0); // Transferencia que falla

        cuenta1.mostrarSaldo();
        cuenta2.mostrarSaldo();
    }
}