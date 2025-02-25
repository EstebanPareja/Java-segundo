public class Estudiante {
    private String nombre;
    private int edad;
    private String genero;
    private String id;
    private String alergias;
    private String nombreAcudiente;
    private String numeroContacto;

    public Estudiante(String nombre, int edad, String genero, String id, String alergias, String nombreAcudiente, String numeroContacto) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.id = id;
        this.alergias = alergias;
        this.nombreAcudiente = nombreAcudiente;
        this.numeroContacto = numeroContacto;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getId(){
        return id;
    }
    public  void setId(String id){
        this.id = id;
    }
    public String getAlergias(){
        return alergias;
    }
    public void setAlergias(String alergias){
        this.alergias = alergias;
    }
    public String getNombreAcudiente(){
        return nombreAcudiente;
    }
    public void setNombreAcudiente(String nombreAcudiente){
        this.nombreAcudiente = nombreAcudiente;
    }
    public String getNumeroContacto(){
        return numeroContacto;
    }
    public void setNumeroContacto(String numeroContacto){
        this.numeroContacto = numeroContacto;
    }

    public String toString(){
        return "Nombre: "+nombre+"\n"+"Edad: "+edad+"\n"
                +"Género: "+genero+"\n"+"id: "+ id + "\n"
                +"Alergias: "+ alergias +"\n"+"Nombre del acudiente: "+nombreAcudiente+"\n"
                + "Número de contacto: "+ numeroContacto;


    }

}
