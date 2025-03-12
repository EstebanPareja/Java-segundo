public class Producto {
    private String nombre;
    private String codigo;
    private int valor;
    private String categoria;
    private int stock;

    public Producto(String nombre, String codigo, int valor, String categoria, int stock) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.valor = valor;
        this.categoria = categoria;
        this.stock = stock;
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

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto: " + "\n"+
                "Nombre: " + nombre + "\n" +
                "Código: " + codigo + "\n" +
                "Valor: " + valor +"\n"+
                "Categoría:'" + categoria + "\n" +
                "Stock" + stock;
    }
}
