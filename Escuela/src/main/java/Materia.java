public class Materia {
    private String nombre;
    private String codigo;

    public Materia(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public String toString(){
        return "nombre de la materia: " + nombre + ", codigo de la materia: " + codigo;
    }
}
