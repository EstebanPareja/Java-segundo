import java.util.ArrayList;
import java.util.List;

public class Venta {
    private String fecha;
    private double subTotal;
    private double impuesto;
    private double total;
    private Cliente cliente;
    private List<DetallesVenta> listaDetalleVentas;
    private String codigoVenta;

    public Venta(String fecha, double impuesto, Cliente cliente, String codigoVenta) {
        this.fecha = fecha;
        this.subTotal = calcularSubTotal();
        this.impuesto = impuesto;
        this.total = calcularTotal();
        this.cliente = cliente;
        this.listaDetalleVentas = new ArrayList<>();
        this.codigoVenta = codigoVenta;
    }

    public String getFecha(){
        return fecha;
    }
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    public double getSubTotal(){
        return subTotal;
    }
    public void setSubTotal(double subTotal){
        this.subTotal = subTotal;
    }
    public double getImpuesto(){
        return impuesto;
    }
    public void setImpuesto(double impuesto){
        this.impuesto = impuesto;
    }
    public double getTotal(){
        return total;
    }
    public void setTotal(double total){
        this.total = total;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public List<DetallesVenta> getListaDetalleVentas() {
        return listaDetalleVentas;
    }
    public void setListaDetalleVentas(List<DetallesVenta> listaDetalleVentas) {
        this.listaDetalleVentas = listaDetalleVentas;
    }
    public String getCodigoVenta() {
        return codigoVenta;
    }
    public void setCodigoVenta(String codigoVenta) {
        this.codigoVenta = codigoVenta;
    }
    public void agregarDetallesVenta(DetallesVenta detallesVenta){
        if (detallesVenta != null && detallesVenta.getProducto() != null) {
            this.listaDetalleVentas.add(detallesVenta);
        }
    }
    public double calcularSubTotal(){
        subTotal = 0;
        for (DetallesVenta detallesVenta : listaDetalleVentas) {
            subTotal += detallesVenta.getSubTotal();
        } return subTotal;
    }

    public double calcularTotal(){
        total = subTotal * impuesto + subTotal;
        return total;
    }



    public String toString(){
        return cliente+"\n"+listaDetalleVentas+"\n"+subTotal+"\n"+impuesto+"\n"+total+"\n"+codigoVenta;
    }






}