public class Cliente {
    private String nombre, identificacion, direccion,
    telefono, mail;

    public Cliente(String nombre, String identificacion, String direccion, String telefono, String mail) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Nombre del cliente: "+ nombre + "\n"+
                "Identificación: "+ identificacion +"\n"+
                "Dirección" + direccion + "\n"+
                "Teléfono: " + telefono + "\n"+
                "Mail: " + mail;
    }
}
