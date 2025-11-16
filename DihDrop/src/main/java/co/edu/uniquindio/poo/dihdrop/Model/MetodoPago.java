package co.edu.uniquindio.poo.dihdrop.Model;

public class MetodoPago {
    private String idMetodoPago;
    private String tipo; // Ej: "Tarjeta de Crédito Simulada"
    private String detalles; // Ej: "**** **** **** 1234"

    public MetodoPago(String idMetodoPago, String tipo, String detalles) {
        this.idMetodoPago = idMetodoPago;
        this.tipo = tipo;
        this.detalles = detalles;
    }

    // --- Getters y Setters ---

    public String getIdMetodoPago() {
        return idMetodoPago;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDetalles() {
        return detalles;
    }
}

