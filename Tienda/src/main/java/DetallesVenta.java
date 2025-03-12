import javax.swing.*;

public class DetallesVenta {
    private int cantidad;
    private double subTotal;
    private double total;
    private Producto producto;

    public DetallesVenta(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;

        if (verificarStock()) {
            this.subTotal = calcularSubtotal();
            this.total = this.subTotal;
        } else {
            JOptionPane.showMessageDialog(null, "No puede realizarse la compra debido a que no hay stock suficiente");
            this.subTotal = 0;
            this.total = 0;
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Producto getProducto() {
        return producto;
    }

    public boolean verificarStock() {
        return producto.getStock() >= cantidad;
    }

    public double calcularSubtotal() {
        if (verificarStock()) {
            subTotal = cantidad * producto.getValor();
        } else {
            subTotal = 0;
        } return subTotal;
    }

    public String toString() {
        return "Producto: " + producto + " | Cantidad: " + cantidad + " | Subtotal: " + subTotal + " | Total: " + total;
    }
}