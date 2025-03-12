import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String nombre;
    private String codigo;
    private List<Cliente> listaClientes;
    private List<Venta> listaVentas;
    private List<Producto> listaProductos;

    public Tienda(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.listaClientes = new ArrayList<>();
        this.listaVentas = new ArrayList<>();
        this.listaProductos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Venta> getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(List<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public boolean verificarExistenciaCliente(Cliente cliente) {
        boolean existe = false;
        for (Cliente client : listaClientes) {
            if (client.getIdentificacion().equals(cliente.getIdentificacion())) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    public void agregarCliente(Cliente cliente) {
        if (verificarExistenciaCliente(cliente)) {
            JOptionPane.showMessageDialog(null, "El cliente ya existe");
        } else {
            listaClientes.add(cliente);
            JOptionPane.showMessageDialog(null, "Cliente agregado");
        }
    }

    public boolean verificarProductoRepetido(Producto producto) {
        boolean repetido = false;
        for (Producto product : listaProductos) {
            if (product.getCodigo().equals(producto.getCodigo())) {
                repetido = true;
                break;
            }
        }
        return repetido;
    }

    public void agregarProducto(Producto producto) {
        if(verificarProductoRepetido(producto)) {
            JOptionPane.showMessageDialog(null, "El producto ya existe");
        }
        else{
            listaProductos.add(producto);
            JOptionPane.showMessageDialog(null, "Producto agregado");
        }
    }

    public void agregarVenta(Venta venta) {
        listaVentas.add(venta);
        JOptionPane.showMessageDialog(null, "Venta agregada");
    }

    public void eliminarCliente(String identificacion) {
        boolean eliminado = false;
        for (int i=0; i<listaClientes.size(); i++) {
            if(listaClientes.get(i).getIdentificacion().equals(identificacion)) {
                listaClientes.remove(i);
                eliminado = true;
                break;
            }
            }if (eliminado) {
            JOptionPane.showMessageDialog(null, "El cliente ha sido eliminado");
        }else{
            JOptionPane.showMessageDialog(null, "El cliente no existe");
        }
    }

    public void eliminarProducto(String codigoProducto) {
        boolean eliminado = false;
        for (int i=0; i<listaProductos.size(); i++) {
            if(listaProductos.get(i).getCodigo().equals(codigo)) {
                listaProductos.remove(i);
                eliminado = true;
                break;
            }
        }if (eliminado){
            JOptionPane.showMessageDialog(null, "El producto ha sido eliminado");
        }else{
            JOptionPane.showMessageDialog(null, "El producto no existe");
        }
    }

    public void eliminarVenta(String codigoVenta) {
        boolean eliminado = false;
        for (int i=0; i<listaVentas.size(); i++) {
            if(listaVentas.get(i).getCodigoVenta().equals(codigoVenta)) {
                listaVentas.remove(i);
                eliminado = true;
                break;
            }
        }if (eliminado){
            JOptionPane.showMessageDialog(null, "La venta ha sido eliminado");
        }else{
            JOptionPane.showMessageDialog(null, "La venta no existe");
        }
    }

    public void actualizarCliente(String identificacion, Cliente cliente) {
        boolean actualizar = false;
        for (int i =0; i< listaClientes.size(); i++){
            if(listaClientes.get(i).getIdentificacion().equals(identificacion)) {
                listaClientes.set(i, cliente);
                actualizar = true;
                break;
            }
        }if (actualizar){
            JOptionPane.showMessageDialog(null, "El cliente ha sido actualizado");
        }
        else{
            JOptionPane.showMessageDialog(null, "El cliente no existe");
        }
    }

    public void actualizarProducto(String codigo, Producto producto) {
        boolean actualizar = false;
        for(int i =0; i< listaProductos.size(); i++){
            if(listaProductos.get(i).getCodigo().equals(codigo)) {
                listaProductos.set(i,producto);
                actualizar = true;
                break;
            }
        }if (actualizar){
            JOptionPane.showMessageDialog(null, "El producto ha sido actualizado");
        }
        else{
            JOptionPane.showMessageDialog(null, "El producto no existe");
        }
    }
    public void actualizarVenta(String codigo, Venta venta) {
        boolean actualizar = false;
        for(int i =0; i< listaVentas.size(); i++){
            if(listaVentas.get(i).getCodigoVenta().equals(codigo)) {
                listaVentas.set(i,venta);
                actualizar = true;
                break;
            }
        }if (actualizar){
            JOptionPane.showMessageDialog(null, "La venta ha sido actualizada");
        } else {
            JOptionPane.showMessageDialog(null, "La venta no existe");
        }
    }


    public String toString() {
        return "Tienda" + nombre +"\n"+ "Código: "+ codigo;
    }
}
