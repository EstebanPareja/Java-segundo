import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String nombreTienda = JOptionPane.showInputDialog("Ingrese el nombre de la tienda: ");
        String codigo = JOptionPane.showInputDialog("Ingrese el codigo de registro de la tienda: ");
        Tienda tienda = new Tienda(nombreTienda, codigo);
        boolean flag = true;
        while(flag){
            String opciones = JOptionPane.showInputDialog("Elige la opción que deseas realizar:\n1.Agregar cliente\n"+
                    "2.Agregar producto\n3.Agregar venta\n4.Eliminar cliente\n5.Eliminar producto\n6.Eliminar venta\n7.Actualizar cliente"+
                    "\n8.Actualizar producto\n9.Actualizar venta\n10.Mostrar lista de clientes\n11.Mostrar lista de productos\n12.Mostrar lista de ventas" +
                    "\n13.Salir");
            switch (opciones) {
                case "1":
                    String nombreCliente = JOptionPane.showInputDialog("Ingresa el nombre del cliente: ");
                    String identificacion = JOptionPane.showInputDialog("Ingresa la identificación del cliente: ");
                    String direccion = JOptionPane.showInputDialog("Ingresa la dirección del cliente: ");
                    String telefono = JOptionPane.showInputDialog("Ingresa el telefono del cliente: ");
                    String mail = JOptionPane.showInputDialog("Ingresa el email del cliente: ");
                    Cliente cliente = new Cliente(nombreCliente, identificacion, direccion, telefono, mail);
                    tienda.agregarCliente(cliente);
                    break;
                case "2":
                    String nombreProducto = JOptionPane.showInputDialog("Ingresa el nombre de producto: ");
                    String codigoProducto = JOptionPane.showInputDialog("Ingresa el código de producto: ");
                    int valorProducto = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de producto: "));
                    String categoriaProducto = JOptionPane.showInputDialog("Ingresa el categoría de producto: ");
                    int stockProducto = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el stock de producto: "));
                    Producto producto = new Producto(nombreProducto, codigoProducto, valorProducto, categoriaProducto, stockProducto);
                    tienda.agregarProducto(producto);
                    break;
                case "3":
                    String fecha = JOptionPane.showInputDialog("Ingresa la fecha de la venta: ");
                    double impuesto = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el impuesto: "));
                    if (tienda.getListaClientes().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay clientes registrados");
                        break;
                        }
                    String idCliente = JOptionPane.showInputDialog(tienda.getListaClientes()
                            +"Elige la identificación del cliente que desea realizar la compra: ");
                    Cliente clienteSeleccionado = null;
                    for (Cliente client : tienda.getListaClientes()) {
                        if (client.getIdentificacion().equals(idCliente)) {
                            clienteSeleccionado = client;

                        } else{
                            JOptionPane.showMessageDialog(null, "El cliente no existe " +
                                    "o la identificación no fue ingresada correctamente");

                        }
                    }
                    List<DetallesVenta>detallesVentas = new ArrayList<>();
                    boolean agregarOtro = true;
                    do{
                        if (tienda.getListaProductos().isEmpty()){
                            JOptionPane.showMessageDialog(null, "No hay productos registrados");
                            break;
                        }
                        String codigoProductoSeleccionado = JOptionPane.showInputDialog(tienda.getListaProductos()+"Ingresa el código del producto que " +
                                "el cliente desea comprar: ");
                        Producto productoSeleccionado = null;
                        for (Producto product : tienda.getListaProductos()) {
                            if (product.getCodigo().equals(codigoProductoSeleccionado)) {
                                productoSeleccionado = product;
                            } else {
                                JOptionPane.showMessageDialog(null, "El producto no ha sido encontrado");
                            }
                        }
                        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad que el cliente desea comprar del producto: "));
                        DetallesVenta detallesVenta = new DetallesVenta(cantidad, productoSeleccionado);
                        if(detallesVenta.verificarStock()){
                            productoSeleccionado.setStock(productoSeleccionado.getStock() - cantidad);
                            detallesVentas.add(detallesVenta);
                        }
                        String comprarOtro = JOptionPane.showInputDialog("El cliente desea comprar otro producto?: 1.Si\n2.No ");
                        if (comprarOtro.equals("2")) {
                            agregarOtro = false;
                        }
                    } while (agregarOtro);

                    String codigoVenta = JOptionPane.showInputDialog("Ingresa el código de venta: ");
                    Venta venta = new Venta(fecha, impuesto, clienteSeleccionado, codigoVenta);
                    for (DetallesVenta detalles : detallesVentas) {
                        venta.agregarDetallesVenta(detalles);
                    }
                    tienda.agregarVenta(venta);
                    JOptionPane.showMessageDialog(null, "Se ha realizado correctamente la compra");

                    break;
                case "4":
                    String eliminarCliente = JOptionPane.showInputDialog("Ingresa la identificación del cliente que deseas eliminar: ");
                    tienda.eliminarCliente(eliminarCliente);
                    break;
                case "5":
                    String eliminarProducto =   JOptionPane.showInputDialog("Ingresa el código del producto que deseas eliminar: ");
                    tienda.eliminarProducto(eliminarProducto);
                    break;
                case "6":
                    String eliminarVenta = JOptionPane.showInputDialog("Ingresa el código de la venta que deseas eliminar: ");
                    tienda.eliminarVenta(eliminarVenta);
                    break;
                case "7":
                    String actualizarCliente = JOptionPane.showInputDialog("Ingresa la identificación del cliente que deseas actualizar: ");
                    String newNombre = JOptionPane.showInputDialog("Ingresa el nombre del cliente: ");
                    String newIdentificacion = JOptionPane.showInputDialog("Ingresa la identificación del cliente: ");
                    String newDireccion = JOptionPane.showInputDialog("Ingresa la dirección del cliente: ");
                    String newTelefono = JOptionPane.showInputDialog("Ingresa el teléfono del cliente: ");
                    String newMail = JOptionPane.showInputDialog("Ingresa el email del cliente: ");
                    Cliente newCliente = new Cliente(newNombre, newIdentificacion, newDireccion, newTelefono, newMail);
                    tienda.actualizarCliente(actualizarCliente, newCliente);
                    break;
                case "8":
                    String actualizarProducto = JOptionPane.showInputDialog("Ingresa el código del producto que desea actualizar: ");
                    String newNombreProducto = JOptionPane.showInputDialog("Ingresa el nombre del producto: ");
                    String newcCodigoProducto = JOptionPane.showInputDialog("Ingresa el código del producto: ");
                    int newValorProducto = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor del producto: "));
                    String newCategoriaProducto = JOptionPane.showInputDialog("Ingresa la categoría del producto: ");
                    int newStockProducto = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el stock del producto: "));
                    Producto newProducto = new Producto(newNombreProducto, newcCodigoProducto, newValorProducto, newCategoriaProducto, newStockProducto);
                    tienda.actualizarProducto(actualizarProducto, newProducto);
                    break;
                case "9":
                    String actualizarVenta = JOptionPane.showInputDialog("Ingresa el código de la venta que desea actualizar: ");
                    String newFecha = JOptionPane.showInputDialog("Ingresa la fecha de la venta: ");
                    double newImpuesto = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el impuesto: "));
                    String nuevoNombreCliente = JOptionPane.showInputDialog("Ingresa el nombre del cliente: ");
                    String nuevaIdentificacionCliente = JOptionPane.showInputDialog("Ingresa la identificación del cliente: ");
                    String nuevaDireccionCliente = JOptionPane.showInputDialog("Ingresa la direccion del cliente: ");
                    String nuevoTelefonoCliente = JOptionPane.showInputDialog("Ingresa el teléfono del cliente: ");
                    String nuevoMailCliente = JOptionPane.showInputDialog("Ingresa el email del cliente: ");
                    Cliente nuevoCliente = new Cliente(nuevoNombreCliente, nuevaIdentificacionCliente, nuevaDireccionCliente, nuevoTelefonoCliente, nuevoMailCliente);
                    String nuevoCodigoVenta = JOptionPane.showInputDialog("Ingresa el código de la venta: ");
                    Venta nuevaVenta = new Venta(newFecha, newImpuesto, nuevoCliente, nuevoCodigoVenta);
                    tienda.agregarCliente(nuevoCliente);
                    tienda.actualizarVenta(actualizarVenta, nuevaVenta);
                    break;
                case "10":
                    JOptionPane.showMessageDialog(null, "Lista de clientes:\n"+tienda.getListaClientes());
                    break;
                case "11":
                    JOptionPane.showMessageDialog(null, "Lista de productos:\n"+tienda.getListaProductos());
                    break;
                case "12":
                    JOptionPane.showMessageDialog(null, "Lista de ventas:\n"+tienda.getListaVentas());
                    break;
                case "13":
                    flag = false;
            }
        }
    }
}
